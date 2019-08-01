package com.magfine.mockserver.DTO;

public class InfoCreditSimplePersonSummaryDTO {
//信息概要， 详见下面 “信息概要" 部分
	public InfoCreditSimplePersonSummaryDTO()
	{
		this.setAssetDisposals( 1 );
		this.setCompensations( 1 );
		this.setCreditCards( new creditCards() );
		this.setHouseLoans( new houseLoans() );
		this.setOtherLoans( new otherLoans() );
	}

	private houseLoans houseLoans;

	private creditCards creditCards;

	private otherLoans otherLoans;


	/**
	 * 资产处置笔数
	 */

	private Integer assetDisposals;

	public houseLoans getHouseLoans()
	{
		return houseLoans;
	}

	public void setHouseLoans(houseLoans houseLoans)
	{
		this.houseLoans = houseLoans;
	}

	public creditCards getCreditCards()
	{
		return creditCards;
	}

	public void setCreditCards(creditCards creditCards)
	{
		this.creditCards = creditCards;
	}

	public otherLoans getOtherLoans()
	{
		return otherLoans;
	}

	public void setOtherLoans(otherLoans otherLoans)
	{
		this.otherLoans = otherLoans;
	}

	public Integer getAssetDisposals()
	{
		return assetDisposals;
	}

	public void setAssetDisposals(Integer assetDisposals)
	{
		this.assetDisposals = assetDisposals;
	}

	public Integer getCompensations()
	{
		return compensations;
	}

	public void setCompensations(Integer compensations)
	{
		this.compensations = compensations;
	}

	/**
	 * 保证人代偿笔数
	 */

	private Integer compensations;




}
