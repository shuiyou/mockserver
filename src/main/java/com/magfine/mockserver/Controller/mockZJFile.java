package com.magfine.mockserver.Controller;

import com.itextpdf.text.DocumentException;
import com.magfine.mockserver.DTO.FiledetailBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.magfine.mockserver.Utils.createFileUtil.createAllPdf;

@RestController
@EnableAutoConfiguration
@RequestMapping("/mock/ZJ")
@Slf4j
public class mockZJFile implements Serializable {
	@RequestMapping(value = "/sqs", method = RequestMethod.POST)
	public ResponseEntity<byte[]> responseReportTask(@RequestBody FiledetailBean fileBean)
			throws IOException, DocumentException
	{
		String name = (String) fileBean.getFileParam().get( "contractNo" );
		InputStream in;
		ResponseEntity<byte[]> response=null ;
		in = new FileInputStream(createAllPdf( name ));
		byte[] b=new byte[in.available()];
		in.read(b);
		HttpHeaders headers = new HttpHeaders();
		headers.add( "filename" ,"SG_file;"+name);
		headers.add("Content-Disposition", "attachment;filename="+name);
		HttpStatus statusCode=HttpStatus.OK;
		response = new ResponseEntity<byte[]>(b, headers, statusCode);
		in.close();
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSS");

		System.out.println( "请求时间："+format.toString()+"调用mock中金pdf下载" );
		return response;
	}


}