package com.magfine.mockserver.DTO;

import java.math.BigDecimal;
import java.time.Instant;

public class InfoCreditSimplePersonCompensationDTO {

	public InfoCreditSimplePersonCompensationDTO(){
		this.setCompensator( "何娟" );
		this.setLastPaymentDate( "2019-06-05T03:57:00.000Z" );
		this.setAmountPaidByCompensator( new BigDecimal( 233 ) );
		this.setLeftAmount( new BigDecimal( 343 ) );
	}

	/**
	 * 代偿人
	 */
	private String compensator;

	/**
	 * 最近一次代偿日期
	 */
	private Instant lastPaymentDateByCompensator;

	/**
	 * 代偿金额
	 */
	private BigDecimal amountPaidByCompensator;

	/**
	 * 本人最近一次还款日
	 */
	private String lastPaymentDate;

	public String getCompensator()
	{
		return compensator;
	}

	public void setCompensator(String compensator)
	{
		this.compensator = compensator;
	}

	public Instant getLastPaymentDateByCompensator()
	{
		return lastPaymentDateByCompensator;
	}

	public void setLastPaymentDateByCompensator(Instant lastPaymentDateByCompensator)
	{
		this.lastPaymentDateByCompensator = lastPaymentDateByCompensator;
	}

	public BigDecimal getAmountPaidByCompensator()
	{
		return amountPaidByCompensator;
	}

	public void setAmountPaidByCompensator(BigDecimal amountPaidByCompensator)
	{
		this.amountPaidByCompensator = amountPaidByCompensator;
	}

	public String getLastPaymentDate()
	{
		return lastPaymentDate;
	}

	public void setLastPaymentDate(String lastPaymentDate)
	{
		this.lastPaymentDate = lastPaymentDate;
	}

	public BigDecimal getLeftAmount()
	{
		return leftAmount;
	}

	public void setLeftAmount(BigDecimal leftAmount)
	{
		this.leftAmount = leftAmount;
	}

	/**
	 * 余额
	 */
	private BigDecimal leftAmount;
}
