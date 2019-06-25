package com.magfine.mockserver.Utils;

public class CallbackThread implements Runnable {
	@Override public void run()
	{
		try
		{
			CallbackhttpPost.postCallbackurl(CallbackhttpPost.url,"123");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}
