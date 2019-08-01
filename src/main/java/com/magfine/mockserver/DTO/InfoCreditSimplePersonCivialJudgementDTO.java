package com.magfine.mockserver.DTO;

import com.magfine.mockserver.Utils.DateUtil;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

public class InfoCreditSimplePersonCivialJudgementDTO {
//民事判决记录， 详见下面"民事判决记录" 部分
	public InfoCreditSimplePersonCivialJudgementDTO(){
		this.setCourt( "浦东新区测试高级法院" );
		this.setCaseNo( "201906250001" );
		this.setCaseSubject( "民事纠纷" );
		this.setFilingTime( "2019-06-05T03:57:00.000Z");
		this.setTarget( "诉讼标的" );
		this.setTargetValue( new BigDecimal( 15000 ) );
		this.setSettleType( "赔偿" );
		this.setSettleResult( "调节成功" );
		this.setEffectiveDate( "2019-06-05T03:57:00.000Z" );
	}

	public String getCourt()
	{
		return court;
	}

	public void setCourt(String court)
	{
		this.court = court;
	}

	/**
	 * 立案法院
	 */
	private String court;

	/**
	 * 案号
	 */
	private String caseNo;

	/**
	 * 案由
	 */
	private String caseSubject;

	/**
	 * 立案时间
	 */
	private String filingTime;

	/**
	 * 诉讼标的
	 */
	private String target;

	/**
	 * 诉讼标的金额
	 */
	private BigDecimal targetValue;

	/**
	 * 结案方式
	 */
	private String settleType;

	/**
	 * 判决,调解结果
	 */
	private String settleResult;

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

	public String getSettleType()
	{
		return settleType;
	}

	public void setSettleType(String settleType)
	{
		this.settleType = settleType;
	}

	public String getSettleResult()
	{
		return settleResult;
	}

	public void setSettleResult(String settleResult)
	{
		this.settleResult = settleResult;
	}

	public String getEffectiveDate()
	{
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate)
	{
		this.effectiveDate = effectiveDate;
	}

	/**
	 * 生效日期
	 */
	private String effectiveDate;


}
