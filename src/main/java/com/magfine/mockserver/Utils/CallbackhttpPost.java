package com.magfine.mockserver.Utils;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import static com.magfine.mockserver.Utils.Common.getTxt;

public class CallbackhttpPost
{
	final static String url="http://192.168.1.15/api/gears/callback/creditXinDe-19002-tid";



	public static void postCallbackurl(String url,String parmas) throws Exception{
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		StringEntity s = new StringEntity(parmas, "utf-8");
		httpPost.setEntity( s );
		httpPost.setHeader( "Content-type", "application/json" );
		CloseableHttpResponse response = client.execute( httpPost );
		System.out.println("本次请求状态码："+response.getStatusLine());
		response.close();
		client.close();
	}

	public static void main(String args[]){
		try{
			CallbackhttpPost.postCallbackurl(CallbackhttpPost.url,getTxt( "CallbackParm.txt" ));

		}catch (Exception e){
			e.printStackTrace();
		}

	}
}
