package com.magfine.mockserver.DTO;

import java.math.BigDecimal;
import java.time.Instant;

public class InfoCreditSimplePersonPenaltyDTO {
//行政处罚记录, 详见下面 "行政处罚记录" 部分
	public InfoCreditSimplePersonPenaltyDTO(){
		this.setInstitute( "测试部门处罚机构" );
		this.setRecordNo( "test13213213" );
		this.setPenaltyContent( "测试处罚内容" );
		this.setPenaltyAmount( new BigDecimal( 232 ) );
		this.setEffectiveDate(  "2019-06-05T03:57:00.000Z" );
		this.setDueDate(  "2019-06-05T03:57:00.000Z" );
		this.setReview( true );
		this.setReviewResult( "pass" );
	}

	/**
	 * 处罚机构
	 */
	private String institute;

	/**
	 * 文书编号
	 */
	private String recordNo;

	/**
	 * 处罚内容
	 */
	private String penaltyContent;

	/**
	 * 处罚金额
	 */
	private BigDecimal penaltyAmount;

	/**
	 * 处罚生效时间
	 */
	private String effectiveDate;

	/**
	 * 处罚截止时间
	 */
	private String dueDate;

	/**
	 * 是否行政复议
	 */
	private Boolean review;

	public String getInstitute()
	{
		return institute;
	}

	public void setInstitute(String institute)
	{
		this.institute = institute;
	}

	public String getRecordNo()
	{
		return recordNo;
	}

	public void setRecordNo(String recordNo)
	{
		this.recordNo = recordNo;
	}

	public String getPenaltyContent()
	{
		return penaltyContent;
	}

	public void setPenaltyContent(String penaltyContent)
	{
		this.penaltyContent = penaltyContent;
	}

	public BigDecimal getPenaltyAmount()
	{
		return penaltyAmount;
	}

	public void setPenaltyAmount(BigDecimal penaltyAmount)
	{
		this.penaltyAmount = penaltyAmount;
	}

	public String getEffectiveDate()
	{
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate)
	{
		this.effectiveDate = effectiveDate;
	}

	public String getDueDate()
	{
		return dueDate;
	}

	public void setDueDate(String dueDate)
	{
		this.dueDate = dueDate;
	}

	public Boolean getReview()
	{
		return review;
	}

	public void setReview(Boolean review)
	{
		this.review = review;
	}

	public String getReviewResult()
	{
		return reviewResult;
	}

	public void setReviewResult(String reviewResult)
	{
		this.reviewResult = reviewResult;
	}

	/**
	 * 行政复议结果
	 */
	private String reviewResult;

}
