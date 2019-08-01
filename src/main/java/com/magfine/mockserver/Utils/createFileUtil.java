package com.magfine.mockserver.Utils;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

import java.io.*;

public class createFileUtil {
	public static File createAllPdf(String contractNo) throws IOException, DocumentException
	{
		PdfReader reader = null;
		PdfStamper stamp = null;
		File createFile = null;
		try
		{
			reader = new PdfReader( "SZ_B6000001190626002010.pdf" );
			String requestFilename = contractNo;
			createFile = new File( requestFilename + ".pdf" );
			stamp = new PdfStamper( reader, new FileOutputStream( createFile ) );
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (DocumentException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (stamp != null)
			{
				stamp.close();
			}
			if (reader != null)
			{
				reader.close();
			}
		}
		return createFile;
	}
}
