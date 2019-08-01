package com.magfine.mockserver.DTO;

import java.io.InputStream;
import java.math.BigDecimal;
import java.time.Instant;

public class InfoCreditSimplePersonGuaranteeDTO {
//担保记录，详见下面 "担保记录" 部分
	public InfoCreditSimplePersonGuaranteeDTO(){
		this.setDebtor( "房拓" );
		this.setDebtorIDType( "身份证" );
		this.setDebtorID( "310115199105032546" );
		this.setGuaranteeDate( "2019-06-05T03:57:00.000Z");
		this.setCreditor( "聂璇" );
		this.setTarget( "测试担保项目" );
		this.setLoanAmount( new BigDecimal( 3432 ) );
		this.setGuaranteeAmount( new BigDecimal( 434324 ) );
		this.setLoanBalance( new BigDecimal( 34324 ) );
		this.setBalanceDate(  "2019-06-05T03:57:00.000Z" );
	}
	/**
	 * 被担保人
	 */
	private String debtor;

	/**
	 * 被担保人证件类型
	 */
	private String debtorIDType;

	/**
	 * 被担保人证件号码
	 */
	private String debtorID;

	/**
	 * 担保日期
	 */
	private String guaranteeDate;

	/**
	 * 债权人
	 */
	private String creditor;

	/**
	 * 担保项目
	 */
	private String target;

	/**
	 * 借贷合同金额
	 */
	private BigDecimal loanAmount;

	/**
	 * 担保金额
	 */
	private BigDecimal guaranteeAmount;

	/**
	 * 担保贷款余额
	 */
	private BigDecimal loanBalance;

	public String getDebtor()
	{
		return debtor;
	}

	public void setDebtor(String debtor)
	{
		this.debtor = debtor;
	}

	public String getDebtorIDType()
	{
		return debtorIDType;
	}

	public void setDebtorIDType(String debtorIDType)
	{
		this.debtorIDType = debtorIDType;
	}

	public String getDebtorID()
	{
		return debtorID;
	}

	public void setDebtorID(String debtorID)
	{
		this.debtorID = debtorID;
	}

	public String getGuaranteeDate()
	{
		return guaranteeDate;
	}

	public void setGuaranteeDate(String guaranteeDate)
	{
		this.guaranteeDate = guaranteeDate;
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

	public BigDecimal getLoanAmount()
	{
		return loanAmount;
	}

	public void setLoanAmount(BigDecimal loanAmount)
	{
		this.loanAmount = loanAmount;
	}

	public BigDecimal getGuaranteeAmount()
	{
		return guaranteeAmount;
	}

	public void setGuaranteeAmount(BigDecimal guaranteeAmount)
	{
		this.guaranteeAmount = guaranteeAmount;
	}

	public BigDecimal getLoanBalance()
	{
		return loanBalance;
	}

	public void setLoanBalance(BigDecimal loanBalance)
	{
		this.loanBalance = loanBalance;
	}

	public String getBalanceDate()
	{
		return balanceDate;
	}

	public void setBalanceDate(String balanceDate)
	{
		this.balanceDate = balanceDate;
	}

	/**
	 * 担保贷款约截止日期
	 */
	private String balanceDate;
}
