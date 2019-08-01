package com.magfine.mockserver.DTO;

import java.math.BigDecimal;
import java.time.Instant;

public class InfoCreditSimplePersonExecutionDTO {
//强制执行记录, 详见下面 "强制执行记录" 部分
	public InfoCreditSimplePersonExecutionDTO(){
		this.setCourt( "测试强制记录执行法院" );
		this.setCaseNo( "20190010234" );
		this.setCaseSubject( "老是不还钱" );
		this.setFilingTime(  "2019-06-05T03:57:00.000Z");
		this.setTarget( "执行的标的内容" );
		this.setTargetValue( new BigDecimal( 123 ) );
		this.setSettletime(  "2019-06-05T03:57:00.000Z" );
		this.setSettleType( "测试结案方式" );
		this.setCaseStatus( "已经处理" );
		this.setExecutionTarget( "已经执行的标的" );
		this.setExecutionTargetValue( new BigDecimal( 444 ) );
	}

	/**
	 * 执行法院
	 */
	private String court;

	/**
	 * 案号
	 */
	private String caseNo;

	/**
	 * 执行案由
	 */
	private String caseSubject;

	/**
	 * 立案时间
	 */
	private String filingTime;

	/**
	 * 申请执行标的
	 */
	private String target;

	/**
	 * 申请执行标的金额
	 */
	private BigDecimal targetValue;

	/**
	 * 结案日期
	 */
	private String settletime;

	/**
	 * 结案方式
	 */
	private String settleType;

	/**
	 * 案件状态
	 */
	private String caseStatus;

	/**
	 * 已执行标的
	 */
	private String executionTarget;

	public String getCourt()
	{
		return court;
	}

	public void setCourt(String court)
	{
		this.court = court;
	}

	public String getCaseNo()
	{
		return caseNo;
	}

	public void setCaseNo(String caseNo)
	{
		this.caseNo = caseNo;
	}

	public String getCaseSubject()
	{
		return caseSubject;
	}

	public void setCaseSubject(String caseSubject)
	{
		this.caseSubject = caseSubject;
	}

	public String getFilingTime()
	{
		return filingTime;
	}

	public void setFilingTime(String filingTime)
	{
		this.filingTime = filingTime;
	}

	public String getTarget()
	{
		return target;
	}

	public void setTarget(String target)
	{
		this.target = target;
	}

	public BigDecimal getTargetValue()
	{
		return targetValue;
	}

	public void setTargetValue(BigDecimal targetValue)
	{
		this.targetValue = targetValue;
	}

	public String getSettletime()
	{
		return settletime;
	}

	public void setSettletime(String settletime)
	{
		this.settletime = settletime;
	}

	public String getSettleType()
	{
		return settleType;
	}

	public void setSettleType(String settleType)
	{
		this.settleType = settleType;
	}

	public String getCaseStatus()
	{
		return caseStatus;
	}

	public void setCaseStatus(String caseStatus)
	{
		this.caseStatus = caseStatus;
	}

	public String getExecutionTarget()
	{
		return executionTarget;
	}

	public void setExecutionTarget(String executionTarget)
	{
		this.executionTarget = executionTarget;
	}

	public BigDecimal getExecutionTargetValue()
	{
		return executionTargetValue;
	}

	public void setExecutionTargetValue(BigDecimal executionTargetValue)
	{
		this.executionTargetValue = executionTargetValue;
	}

	/**
	 * 已执行标的金额
	 */
	private BigDecimal executionTargetValue;
}
