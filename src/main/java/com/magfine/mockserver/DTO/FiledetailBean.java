package com.magfine.mockserver.DTO;

import java.util.HashMap;

public class FiledetailBean {

	public HashMap getFileParam()
	{
		return fileParam;
	}

	public void setFileParam(HashMap fileParam)
	{
		this.fileParam = fileParam;
	}

	public String getFileType()
	{
		return fileType;
	}

	public void setFileType(String fileType)
	{
		this.fileType = fileType;
	}

	private HashMap fileParam;

	private String fileType;

}
