package com.magfine.mockserver.DTO;

import java.math.BigDecimal;
import java.time.Instant;

public class InfoCreditSimplePersonUnpaidTaxDTO {
//详见下面 "欠税记录" 部分
	public InfoCreditSimplePersonUnpaidTaxDTO(){
		this.setAuthority( "欠税测试机构" );
		this.setTime(  "2019-06-05T03:57:00.000Z");
		this.setAmount( new BigDecimal( 2003 ) );
		this.setTaxPayerID( "test123unpayidnameid" );
	}
	/**
	 * 主管税务机构
	 */
	private String authority;

	/**
	 * 欠税统计时间
	 */
	private String time;

	/**
	 * 欠税金额
	 */
	private BigDecimal amount;

	public String getAuthority()
	{
		return authority;
	}

	public void setAuthority(String authority)
	{
		this.authority = authority;
	}

	public String getTime()
	{
		return time;
	}

	public void setTime(String time)
	{
		this.time = time;
	}

	public BigDecimal getAmount()
	{
		return amount;
	}

	public void setAmount(BigDecimal amount)
	{
		this.amount = amount;
	}

	public String getTaxPayerID()
	{
		return taxPayerID;
	}

	public void setTaxPayerID(String taxPayerID)
	{
		this.taxPayerID = taxPayerID;
	}

	/**
	 * 纳税人识别号
	 */
	private String taxPayerID;

}
