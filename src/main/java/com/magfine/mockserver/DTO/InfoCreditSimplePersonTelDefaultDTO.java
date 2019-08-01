package com.magfine.mockserver.DTO;

import java.math.BigDecimal;
import java.time.Instant;

public class InfoCreditSimplePersonTelDefaultDTO {
//电信欠费记录，详见下面 "电信欠费记录" 部分

	public InfoCreditSimplePersonTelDefaultDTO(){
		this.setCarrier( "电信" );
		this.setServiceType( "宽带" );
		this.setStartTime(  "2019-06-05T03:57:00.000Z" );
		this.setDefaultAmount( new BigDecimal( 143 ) );
		this.setAccountingTime(  "2019-06-05T03:57:00.000Z" );
	}
	/**
	 * 运营商
	 */
	private String carrier;

	/**
	 * 业务类型
	 */
	private String serviceType;

	/**
	 * 业务开通时间
	 */
	private String startTime;

	/**
	 * 欠费金额
	 */
	private BigDecimal defaultAmount;

	public String getCarrier()
	{
		return carrier;
	}

	public void setCarrier(String carrier)
	{
		this.carrier = carrier;
	}

	public String getServiceType()
	{
		return serviceType;
	}

	public void setServiceType(String serviceType)
	{
		this.serviceType = serviceType;
	}

	public String getStartTime()
	{
		return startTime;
	}

	public void setStartTime(String startTime)
	{
		this.startTime = startTime;
	}

	public BigDecimal getDefaultAmount()
	{
		return defaultAmount;
	}

	public void setDefaultAmount(BigDecimal defaultAmount)
	{
		this.defaultAmount = defaultAmount;
	}

	public String getAccountingTime()
	{
		return accountingTime;
	}

	public void setAccountingTime(String accountingTime)
	{
		this.accountingTime = accountingTime;
	}

	/**
	 * 记账年月
	 */
	private String accountingTime;
}
