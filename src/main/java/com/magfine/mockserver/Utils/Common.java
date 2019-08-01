package com.magfine.mockserver.Utils;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import java.io.IOException;
import java.io.InputStream;

public class Common
{

	public static String getTxt(String fileName)
	{
			Resource resource = new ClassPathResource( fileName );


		try
		{
//			File file = resource.getFile();
//			return FileUtils.readFileToString( file, "utf-8" );
			InputStream in = resource.getInputStream();
			int contentLen = in.available();
			byte[] st = new byte[contentLen];
			in.read(st);
			return new String(st);

		}
		catch (IOException e)
		{
			throw new RuntimeException( e );
		}
	}
}
