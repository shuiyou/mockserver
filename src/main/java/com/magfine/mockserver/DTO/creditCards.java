package com.magfine.mockserver.DTO;

public class creditCards
{


	public creditCards(){
		this.setTotalAccounts( 1 );
		this.setActiveAccounts( 1 );
		this.setAccountsOverdued( 1 );
		this.setAccountsOverdued90Days( 1 );
		this.setGuarantees( 1 );
	}
	/**
	 * 信用卡总账户数
	 */

	private Integer totalAccounts;

	/**
	 * 信用卡未销户数
	 */

	private Integer activeAccounts;

	/**
	 * 信用卡发生过逾期的账户数
	 */

	private Integer accountsOverdued;

	/**
	 * 信用卡发生过逾期90天以上的账户数
	 */

	private Integer accountsOverdued90Days;

	public Integer getTotalAccounts()
	{
		return totalAccounts;
	}

	public void setTotalAccounts(Integer totalAccounts)
	{
		this.totalAccounts = totalAccounts;
	}

	public Integer getActiveAccounts()
	{
		return activeAccounts;
	}

	public void setActiveAccounts(Integer activeAccounts)
	{
		this.activeAccounts = activeAccounts;
	}

	public Integer getAccountsOverdued()
	{
		return accountsOverdued;
	}

	public void setAccountsOverdued(Integer accountsOverdued)
	{
		this.accountsOverdued = accountsOverdued;
	}

	public Integer getAccountsOverdued90Days()
	{
		return accountsOverdued90Days;
	}

	public void setAccountsOverdued90Days(Integer accountsOverdued90Days)
	{
		this.accountsOverdued90Days = accountsOverdued90Days;
	}

	public Integer getGuarantees()
	{
		return guarantees;
	}

	public void setGuarantees(Integer guarantees)
	{
		this.guarantees = guarantees;
	}

	/**
	 * 信用卡担保数
	 */

	private Integer guarantees;


}
