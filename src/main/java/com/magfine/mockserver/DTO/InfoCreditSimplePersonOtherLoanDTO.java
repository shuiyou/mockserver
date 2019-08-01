package com.magfine.mockserver.DTO;

import java.math.BigDecimal;
import java.time.Instant;

public class InfoCreditSimplePersonOtherLoanDTO {
	//其他贷款详情, 详见下面 "其他贷款详情" 部分
	public InfoCreditSimplePersonOtherLoanDTO(){
		this.setIssuer( "上海房地产管理机构" );
		this.setIssueDate(  "2019-06-05T03:57:00.000Z" );
		this.setAmount(new BigDecimal(82100000.55));
		this.setCurrency("RMB");
		this.setType( "个人住房贷款" );
		this.setStatus( "未结清" );
		this.setCloseDate( "2019-06-05T03:57:00.000Z" );
		this.setDueDate(  "2019-06-05T03:57:00.000Z");
		this.setBalance( new BigDecimal( 232 ) );
		this.setOverdues( 2 );
		this.setOverdueAmount( new BigDecimal( 222 ) );
		this.setOverdues90Days( 1 );
	}

	/**
	 * 贷款机构
	 */
	private String issuer;

	/**
	 * 贷款日期
	 */
	private String issueDate;

	/**
	 * 贷款总额
	 */
	private BigDecimal amount;

	/**
	 * 贷款币种
	 */

	private String currency;

	/**
	 * 贷款类型， “个人住房贷款”，等
	 */

	private String type;

	/**
	 * 贷款状态, \"已结清\", \"未结清\"
	 */

	private String status;

	/**
	 * 结清日期，此字段只对已结清贷款有效
	 */

	private String closeDate;

	/**
	 * 贷款到期日， 已结清贷款无此字段
	 */
	private String dueDate;

	/**
	 * 贷款余额, 已结清贷款无此字段
	 */
	private BigDecimal balance;

	/**
	 * 贷款余额截止日期, 已结清贷款无此字段
	 */
	private Instant balanceDate;

	/**
	 * 最近5年逾期次数， 已结清贷款无此字段
	 */

	private Integer overdues;

	/**
	 * 逾期金额， 只有逾期的账号才有此字段
	 */
	private BigDecimal overdueAmount;

	public String getIssuer()
	{
		return issuer;
	}

	public void setIssuer(String issuer)
	{
		this.issuer = issuer;
	}

	public String getIssueDate()
	{
		return issueDate;
	}

	public void setIssueDate(String issueDate)
	{
		this.issueDate = issueDate;
	}

	public BigDecimal getAmount()
	{
		return amount;
	}

	public void setAmount(BigDecimal amount)
	{
		this.amount = amount;
	}

	public String getCurrency()
	{
		return currency;
	}

	public void setCurrency(String currency)
	{
		this.currency = currency;
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

	public String getCloseDate()
	{
		return closeDate;
	}

	public void setCloseDate(String closeDate)
	{
		this.closeDate = closeDate;
	}

	public String getDueDate()
	{
		return dueDate;
	}

	public void setDueDate(String dueDate)
	{
		this.dueDate = dueDate;
	}

	public BigDecimal getBalance()
	{
		return balance;
	}

	public void setBalance(BigDecimal balance)
	{
		this.balance = balance;
	}

	public Instant getBalanceDate()
	{
		return balanceDate;
	}

	public void setBalanceDate(Instant balanceDate)
	{
		this.balanceDate = balanceDate;
	}

	public Integer getOverdues()
	{
		return overdues;
	}

	public void setOverdues(Integer overdues)
	{
		this.overdues = overdues;
	}

	public BigDecimal getOverdueAmount()
	{
		return overdueAmount;
	}

	public void setOverdueAmount(BigDecimal overdueAmount)
	{
		this.overdueAmount = overdueAmount;
	}

	public Integer getOverdues90Days()
	{
		return overdues90Days;
	}

	public void setOverdues90Days(Integer overdues90Days)
	{
		this.overdues90Days = overdues90Days;
	}

	/**
	 * 逾期超过90 天次数， 已结清贷款无此字段
	 */

	private Integer overdues90Days;
}
