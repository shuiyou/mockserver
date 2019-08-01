package com.magfine.mockserver.Controller;


import com.magfine.mockserver.DTO.ResultDTO;
import com.magfine.mockserver.DTO.createReportNewTaskBean;
import com.magfine.mockserver.DTO.statusType;
import com.magfine.mockserver.DTO.supplyInfoBean;
import com.magfine.mockserver.Utils.HttpResult;
import com.magfine.mockserver.Utils.HttpUtil;
import com.magfine.mockserver.Utils.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static com.magfine.mockserver.Utils.Common.getTxt;

@RestController
@EnableAutoConfiguration
@RequestMapping("/mock/v1/task")
@Slf4j
public class CreateReportNewTask {
    final static String url = "http://192.168.1.15/api/gears/callback/creditXinDe-19002-tid";
    private HashMap<String, String> tidCache = new HashMap<>();

    @RequestMapping(value = "/createNewTask", consumes = "application/json;charset=UTF-8", method = RequestMethod.POST)
    public ResponseEntity<ResultDTO> responseReportTask(@RequestBody createReportNewTaskBean crnttaskbean) {
        if (crnttaskbean.getAccount() != null && crnttaskbean.getPassword() != null && crnttaskbean.getSubType().equals("applyOrQuery")) {
            String accountname = crnttaskbean.getAccount();
            ResultDTO resultDTO = new ResultDTO();
            Date date = new Date();
            DateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSS");
            String tid = format.format(date) + accountname;
            tidCache.put("tid", tid);
            resultDTO.setTid(tid);
            resultDTO.setType("credit");
            resultDTO.setStatus("processing");
            resultDTO.setSubType("applyOrQuery");
            resultDTO.setPhase("login");


            log.info( "创建新Task请求参数"+crnttaskbean.toString());
            return ResponseEntity.ok(resultDTO);


        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @RequestMapping(value = "/queryTask", method = RequestMethod.GET)
    public ResponseEntity<ResultDTO> responseQueryTask(String tid, String appid, String time, String signature) {
        ResultDTO resultDTO = new ResultDTO();
        System.out.println(appid);
        if (tidCache.get("tid").equals(tid)) {
            resultDTO.setStatus(statusType.processing.toString());
            resultDTO.setTid(tid);
            resultDTO.setSubType("applyReport");
            resultDTO.setType("credit");
            resultDTO.setStatus("suspended");
            resultDTO.setNeed("requireCreditIDCode");
            log.info( "查询任务mock返回请求"+resultDTO.toString() );
            return ResponseEntity.ok(resultDTO);
        } else {
            resultDTO.setTid(tid);
            resultDTO.setSubType("applyReport");
            resultDTO.setType("credit");
            resultDTO.setFailCode("7008");
            resultDTO.setReason("身份信息未收录, 请检查姓名和证件号码是否正确");
            log.info("查询任务进度错误 FailCode{} 信息{}", resultDTO.getFailCode(), resultDTO.getReason());
            return ResponseEntity.ok(resultDTO);
        }
    }


    @RequestMapping(value = "/supplyInfoTask", consumes = "application/json;charset=UTF-8", method = RequestMethod.POST)
    public ResponseEntity<ResultDTO> responseQueryTask(@RequestBody supplyInfoBean supplyInfoBean) {
        if (tidCache.get("tid").equals(supplyInfoBean.getTid())) {
            String request_tid = supplyInfoBean.getTid();
            ResultDTO resultDTO = new ResultDTO();
            resultDTO.setTid(request_tid);
            resultDTO.setType("credit");
            resultDTO.setStatus("processing");
            resultDTO.setSubType("applyReport");
            resultDTO.setPhase("login");
            log.info( "补充任务mock返回请求"+resultDTO.toString() );
            Thread thread = new Thread( () -> callback( request_tid ) );
            thread.start();
            return ResponseEntity.ok(resultDTO);


        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    public void callback(String tid) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String txt = getTxt("CallbackParm.txt");
        Map<String, Object> convert = JSONUtil.toMap( txt );
        convert.put("tid", tid);
        Map<String, Object> result = (Map<String, Object>) convert.get("result");
        result.put("reportNo", tid);
        convert.put("result", result);
        HttpResult post = HttpUtil.post(url, JSONUtil.toJson(convert));
        log.info("调用结果 code{} 信息{}", post.getCode(), post.getResult());
    }
}
