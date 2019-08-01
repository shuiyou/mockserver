package com.magfine.mockserver.DTO;


public class ResultDTO {
	private String tid;

	public String getTid()
	{
		return tid;
	}

	public void setTid(String tid)
	{
		this.tid = tid;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}



	private String type;
	private String status ;

	public String getSubType()
	{
		return subType;
	}

	public void setSubType(String subType)
	{
		this.subType = subType;
	}

	private String subType;

	public String getFailCode()
	{
		return failCode;
	}

	public void setFailCode(String failCode)
	{
		this.failCode = failCode;
	}

	public String getReason()
	{
		return reason;
	}

	public void setReason(String reason)
	{
		this.reason = reason;
	}

	private String failCode;

	private String reason;

	public String getPhase()
	{
		return phase;
	}

	public void setPhase(String phase)
	{
		this.phase = phase;
	}

	private String phase;

	public String getNeed()
	{
		return need;
	}

	public void setNeed(String need)
	{
		this.need = need;
	}

	private String need;

	@Override
	public String toString(){
		return "ResultDto{"+
				"tid="+getTid()+","+
				"type="+getType()+","+
				"subtype="+getSubType()+","+
				"phase="+getPhase()+","+
				"failcode="+getFailCode()+","+
				"reason="+getReason()+","+
				"need="+getNeed()+"}";
	}

}
