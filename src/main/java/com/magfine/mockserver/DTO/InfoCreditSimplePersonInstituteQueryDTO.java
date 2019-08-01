package com.magfine.mockserver.DTO;


public class InfoCreditSimplePersonInstituteQueryDTO {

	public InfoCreditSimplePersonInstituteQueryDTO(){
		this.setQueryDate(  "2019-06-05T03:57:00.000Z");
		this.setQueriedBy( "测试查询机构" );
		this.setReason( "需要查询" );
	}
	private String reason;

	/**
	 * 查询日期
	 */
	private String queryDate;

	public String getReason()
	{
		return reason;
	}

	public void setReason(String reason)
	{
		this.reason = reason;
	}

	public String getQueryDate()
	{
		return queryDate;
	}

	public void setQueryDate(String queryDate)
	{
		this.queryDate = queryDate;
	}

	public String getQueriedBy()
	{
		return queriedBy;
	}

	public void setQueriedBy(String queriedBy)
	{
		this.queriedBy = queriedBy;
	}

	/**
	 * 查询机构
	 */
	private String queriedBy;
}


