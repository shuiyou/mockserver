package com.magfine.mockserver.DTO;

import java.math.BigDecimal;
import java.time.Instant;

public class InfoCreditSimplePersonCreditCardDTO {
//	信用卡详情, 详见下面 "信用卡详情" 部分

	public InfoCreditSimplePersonCreditCardDTO(){
		this.setIssuer( "测试发卡机构" );
		this.setissueDate(  "2019-06-05T03:57:00.000Z");
		this.setCurrency( "RMB" );
		this.setStatus( "激活" );
		this.setCardType( "贷记卡" );
		this.setCreditLimit( new BigDecimal( 50000 ) );
		this.setCreditUsed( new BigDecimal( 1000 ) );
		this.setLastCreditTime(  "2019-06-05T03:57:00.000Z" );
		this.setOverdues( 1 );
		this.setOverdueAmount( new BigDecimal( 200 ) );
		this.setOverDraw60Days( 1 );
		this.setOverdues90Days( 1 );
		this.setOverDraw90Days( 1 );
		this.setInstituteStatement( "测试机构" );
	}

	/**
	 * 发卡机构
	 */

	private String issuer;

	/**
	 * 发卡时间
	 */

	private String issueDate;

	/**
	 * 账户币种
	 */

	private String currency;

	/**
	 * 信用卡当前状态，“未激活”，“激活”， “销户”
	 */

	private String status;

	/**
	 * 销户时间, 只有已销户的信用卡才有此字段
	 */

	private Instant closeDate;

	/**
	 * 信用额度， 已销户的卡无此字段
	 */

	private BigDecimal creditLimit;

	/**
	 * 已用额度， 已销户的卡无此字段
	 */

	private BigDecimal creditUsed;

	/**
	 * 信用额度和已用额度截止日期
	 */

	private String lastCreditTime;

	/**
	 * 最近5年逾期次数, 已销户的卡无此字段
	 */

	private Integer overdues;

	/**
	 * 逾期金额；只有逾期的记录才可能有此字段
	 */
	private BigDecimal overdueAmount;

	/**
	 * 逾期超过90天次数， 已销户的卡无此字段
	 */

	private Integer overdues90Days;

	/**
	 * 准贷记卡 最近5年透支超过60天的次数
	 */

	private Integer overDraw60Days;

	/**
	 * 准贷记卡 最近5年透支超过90天的次数
	 */

	private Integer overDraw90Days;

	public String getIssuer()
	{
		return issuer;
	}

	public void setIssuer(String issuer)
	{
		this.issuer = issuer;
	}

	public String getissueDate()
	{
		return issueDate;
	}

	public void setissueDate(String issueDate)
	{
		this.issueDate = issueDate;
	}

	public String getCurrency()
	{
		return currency;
	}

	public void setCurrency(String currency)
	{
		this.currency = currency;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public Instant getCloseDate()
	{
		return closeDate;
	}

	public void setCloseDate(Instant closeDate)
	{
		this.closeDate = closeDate;
	}

	public BigDecimal getCreditLimit()
	{
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit)
	{
		this.creditLimit = creditLimit;
	}

	public BigDecimal getCreditUsed()
	{
		return creditUsed;
	}

	public void setCreditUsed(BigDecimal creditUsed)
	{
		this.creditUsed = creditUsed;
	}

	public String getLastCreditTime()
	{
		return lastCreditTime;
	}

	public void setLastCreditTime(String lastCreditTime)
	{
		this.lastCreditTime = lastCreditTime;
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

	public Integer getOverDraw60Days()
	{
		return overDraw60Days;
	}

	public void setOverDraw60Days(Integer overDraw60Days)
	{
		this.overDraw60Days = overDraw60Days;
	}

	public Integer getOverDraw90Days()
	{
		return overDraw90Days;
	}

	public void setOverDraw90Days(Integer overDraw90Days)
	{
		this.overDraw90Days = overDraw90Days;
	}

	public String getInstituteStatement()
	{
		return instituteStatement;
	}

	public void setInstituteStatement(String instituteStatement)
	{
		this.instituteStatement = instituteStatement;
	}

	/**
	 * 机构声明
	 */

	private String instituteStatement;

	public String getCardType()
	{
		return cardType;
	}

	public void setCardType(String cardType)
	{
		this.cardType = cardType;
	}

	/**
	 * 卡类型
	 */

	private String cardType;



}
