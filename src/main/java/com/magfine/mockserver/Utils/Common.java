package com.magfine.mockserver.Utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.apache.commons.io.FileUtils;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Common
{

	public static String getTxt(String fileName)
	{
		Resource resource = new ClassPathResource( fileName );
		try
		{
			File file = resource.getFile();
			return FileUtils.readFileToString( file, "utf-8" );
		}
		catch (IOException e)
		{
			throw new RuntimeException( e );
		}
	}

	public static String WriteTxt(String fileName)
	{
		Resource resource = new ClassPathResource( fileName );
		try
		{
			File file = resource.getFile();
			return FileUtils.readFileToString( file, "utf-8" );
		}
		catch (IOException e)
		{
			throw new RuntimeException( e );
		}
	}

	public static void main(String[] args)
	{

		String params = getTxt( "CallbackParm.txt" );
		HashMap<String, Object> hashMap = JSON.parseObject( params, HashMap.class );
		String ResultContext =hashMap.get( "result" ).toString();
			HashMap<String, Object> resultContextMap = JSON.parseObject( ResultContext, HashMap.class );
		resultContextMap.get( "name" );
		resultContextMap.put( "name" ,"韩骁頔");
		resultContextMap.put( "ID","31011519910503253X" );
		hashMap.put("result",resultContextMap);
		hashMap.get( "result" );

		System.out.println(hashMap.get( "result" ));


	}

}
