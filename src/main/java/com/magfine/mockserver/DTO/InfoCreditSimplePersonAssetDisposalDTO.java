package com.magfine.mockserver.DTO;


import java.math.BigDecimal;


public class InfoCreditSimplePersonAssetDisposalDTO {
//	资产处置详情，详见下面 “资产处置详情” 部分

	public InfoCreditSimplePersonAssetDisposalDTO(){
		this.setCreditor( "新的债权人公司" );
		this.setCreditorTransferDate( "2019-06-05T03:57:00.000Z");
		this.setTarget( "测试资产处置项目" );
		this.setDebtAmount( new BigDecimal( "12321" ) );
		this.setLeftAmount( new BigDecimal( "2343" ) );
		this.setLastPaymentDate( "2019-06-05T03:57:00.000Z" );

	}

	/**
	 * 债权接收日期
	 */
	private String creditorTransferDate;

	/**
	 * 资管公司 （新债权人）
	 */
	private String creditor;

	/**
	 * 资产处置项目
	 */
	private String target;

	/**
	 * 债权金额
	 */
	private BigDecimal debtAmount;

	/**
	 * 未还余额
	 */
	private BigDecimal leftAmount;

	public String getCreditorTransferDate()
	{
		return creditorTransferDate;
	}

	public void setCreditorTransferDate(String creditorTransferDate)
	{
		this.creditorTransferDate = creditorTransferDate;
	}

	public String getCreditor()
	{
		return creditor;
	}

	public void setCreditor(String creditor)
	{
		this.creditor = creditor;
	}

	public String getTarget()
	{
		return target;
	}

	public void setTarget(String target)
	{
		this.target = target;
	}

	public BigDecimal getDebtAmount()
	{
		return debtAmount;
	}

	public void setDebtAmount(BigDecimal debtAmount)
	{
		this.debtAmount = debtAmount;
	}

	public BigDecimal getLeftAmount()
	{
		return leftAmount;
	}

	public void setLeftAmount(BigDecimal leftAmount)
	{
		this.leftAmount = leftAmount;
	}

	public String getLastPaymentDate()
	{
		return lastPaymentDate;
	}

	public void setLastPaymentDate(String lastPaymentDate)
	{
		this.lastPaymentDate = lastPaymentDate;
	}

	/**
	 * 最近一次还款日期
	 */
	private String lastPaymentDate;


}
