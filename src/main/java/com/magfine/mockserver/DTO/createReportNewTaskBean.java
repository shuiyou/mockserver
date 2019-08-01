package com.magfine.mockserver.DTO;

public class createReportNewTaskBean
{
	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	private String type;

	public String getSubType()
	{
		return subType;
	}

	public void setSubType(String subType)
	{
		this.subType = subType;
	}

	public String getCallback()
	{
		return callback;
	}

	public void setCallback(String callback)
	{
		this.callback = callback;
	}

	private String subType;

	private String callback;

	private String account;

	public String getAccount()
	{
		return account;
	}

	public void setAccount(String account)
	{
		this.account = account;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	private String password;

	@Override
	public String toString(){
		return "createReportNewTaskBean{"+
				"account="+getAccount()+","+
				"password="+getPassword()+","+
				"type="+getType()+","+
				"subtype="+getType()+","+
				"callback="+getCallback()+"}";
	}
	
}
