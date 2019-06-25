package com.magfine.mockserver.DTO;

public class supplyInfoBean {
	private String tid;

	public String getTid()
	{
		return tid;
	}

	public void setTid(String tid)
	{
		this.tid = tid;
	}

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

	public String getSmsCode()
	{
		return smsCode;
	}

	public void setSmsCode(String smsCode)
	{
		this.smsCode = smsCode;
	}

	public String getPhoneNo()
	{
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo)
	{
		this.phoneNo = phoneNo;
	}

	private String account;
	private String password;
	private String smsCode;
	private String phoneNo;
}
