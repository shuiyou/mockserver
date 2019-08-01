package com.magfine.mockserver.DTO;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;

public class returnZJFileDTO implements Serializable
{
	public File getInputStream()
	{
		return inputStream;
	}

	public void setInputStream(File inputStream)
	{
		this.inputStream = inputStream;
	}

	private File inputStream;
}
