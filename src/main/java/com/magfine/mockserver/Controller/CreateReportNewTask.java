package com.magfine.mockserver.Controller;


import com.magfine.mockserver.DTO.ResultDTO;
import com.magfine.mockserver.DTO.createReportNewTaskBean;
import com.magfine.mockserver.DTO.statusType;
import com.magfine.mockserver.DTO.supplyInfoBean;
import com.magfine.mockserver.Utils.CallbackThread;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

@RestController
@EnableAutoConfiguration
@RequestMapping("/mock/v1/task")
public class CreateReportNewTask
{
	private HashMap<String,String> tidCache = new HashMap<String,String >();
	@RequestMapping(value = "/createNewTask",consumes = "application/json;charset=UTF-8",  method = RequestMethod.POST)
	public ResponseEntity<ResultDTO> responseReportTask(@RequestBody createReportNewTaskBean crnttaskbean ){
			if (crnttaskbean.getAccount()!=null&&crnttaskbean.getPaswword()!=null&&crnttaskbean.getSubType().equals("applyOrQuery")){
				String accountname = crnttaskbean.getAccount();
				ResultDTO resultDTO =new ResultDTO();
				Date date = new Date();
				DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
				String tid =format.format( date )+accountname;
				tidCache.put( "tid",tid );
				resultDTO.setTid( tid );
				resultDTO.setType( "credit" );
				resultDTO.setStatus("processing");
				resultDTO.setSubType( "applyOrQuery" );
				resultDTO.setPhase( "login" );
				return ResponseEntity.ok(resultDTO);
			}else {
				return ResponseEntity.status( HttpStatus.BAD_REQUEST ).build();
			}

	}

	@RequestMapping(value = "/queryTask",method = RequestMethod.GET)
	public ResponseEntity<ResultDTO> responseQueryTask(String tid,String appid,String time,String signature){
			ResultDTO resultDTO =new ResultDTO();
			System.out.println( appid );
			if(tidCache.get( "tid" ).equals( tid )){
				resultDTO.setStatus(statusType.processing.toString());
				resultDTO.setTid( tid );
				resultDTO.setSubType( "applyReport" );
				resultDTO.setType( "credit" );
				resultDTO.setStatus( "suspended" );
				resultDTO.setNeed( "requireCreditIDCode" );
				return ResponseEntity.ok( resultDTO );
			}else{
				resultDTO.setTid( tid );
				resultDTO.setSubType( "applyReport" );
				resultDTO.setType( "credit" );
				resultDTO.setFailCode( "7008" );
				resultDTO.setReason( "身份信息未收录, 请检查姓名和证件号码是否正确" );
				return ResponseEntity.ok( resultDTO );
			}
	}


	@RequestMapping(value = "/supplyInfoTask ",consumes = "application/json;charset=UTF-8",method = RequestMethod.POST)
	public ResponseEntity<ResultDTO> responseQueryTask(@RequestBody supplyInfoBean supplyInfoBean ){
			if (tidCache.get( "tid" ).equals( supplyInfoBean.getTid() )){
				String request_tid = supplyInfoBean.getTid();
				ResultDTO resultDTO = new ResultDTO();
				resultDTO.setTid( request_tid );
				resultDTO.setType( "credit" );
				resultDTO.setStatus( "processing" );
				resultDTO.setSubType( "applyReport" );
				resultDTO.setPhase( "login" );
				CallbackThread c = new CallbackThread();
				Thread thread=new Thread(c);
				thread.start();
				return ResponseEntity.ok( resultDTO );



			}else {
				return ResponseEntity.status( HttpStatus.BAD_REQUEST ).build();
			}
	}

	@RequestMapping("/test")
	public String hello(){
		return "hello_world";
	}

}
