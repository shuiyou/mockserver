package com.magfine.mockserver;

import com.itextpdf.text.DocumentException;
import com.magfine.mockserver.DTO.*;
import com.magfine.mockserver.Utils.JSONUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import static com.magfine.mockserver.Utils.Common.getTxt;
import static com.magfine.mockserver.Utils.createFileUtil.createAllPdf;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MockserverApplicationTests {

	@Test
	public void contextLoads() {
		String params = getTxt( "CallbackParm.txt" );
		System.out.println(params);
	}

	@Test
	public void Calnum(){

	}


	@Test
	public void createJsonData(){
		ArrayList<InfoCreditSimplePersonAssetDisposalDTO> AssetDisposal_detail = new ArrayList<InfoCreditSimplePersonAssetDisposalDTO>();
		AssetDisposal_detail.add( new InfoCreditSimplePersonAssetDisposalDTO() );

		ArrayList<InfoCreditSimplePersonCivialJudgementDTO> CivialJudgement_detail = new ArrayList<InfoCreditSimplePersonCivialJudgementDTO>();
		CivialJudgement_detail.add( new  InfoCreditSimplePersonCivialJudgementDTO());

		ArrayList<InfoCreditSimplePersonCompensationDTO>  Compenstion_detail = new ArrayList<InfoCreditSimplePersonCompensationDTO>();
		Compenstion_detail.add( new InfoCreditSimplePersonCompensationDTO() );



		ArrayList<InfoCreditSimplePersonCreditCardDTO> creditCard_detail  =new ArrayList<InfoCreditSimplePersonCreditCardDTO>();
		creditCard_detail.add( new  InfoCreditSimplePersonCreditCardDTO());

		ArrayList<InfoCreditSimplePersonExecutionDTO> execution_detail = new ArrayList<InfoCreditSimplePersonExecutionDTO>();
		execution_detail.add( new InfoCreditSimplePersonExecutionDTO());

		ArrayList<InfoCreditSimplePersonGuaranteeDTO> guarantee_detail = new ArrayList<InfoCreditSimplePersonGuaranteeDTO>();
		guarantee_detail.add( null);

		ArrayList<InfoCreditSimplePersonHouseLoanDTO> houseLoan_detail = new ArrayList<InfoCreditSimplePersonHouseLoanDTO>();
		houseLoan_detail.add( new InfoCreditSimplePersonHouseLoanDTO() );


		ArrayList<InfoCreditSimplePersonInstituteQueryDTO> instituteQuery_detail = new ArrayList<InfoCreditSimplePersonInstituteQueryDTO>(  );
		instituteQuery_detail.add( new InfoCreditSimplePersonInstituteQueryDTO() );

		ArrayList<InfoCreditSimplePersonOtherLoanDTO> otherLoan_detail = new ArrayList<InfoCreditSimplePersonOtherLoanDTO>();
		otherLoan_detail.add( new InfoCreditSimplePersonOtherLoanDTO() );


		ArrayList<InfoCreditSimplePersonPenaltyDTO> penalty_detail = new ArrayList<InfoCreditSimplePersonPenaltyDTO>();
		penalty_detail.add( new InfoCreditSimplePersonPenaltyDTO() );

		ArrayList<InfoCreditSimplePersonPersonalQueryDTO> personalQuery_detail = new ArrayList<InfoCreditSimplePersonPersonalQueryDTO>();
		personalQuery_detail.add( new InfoCreditSimplePersonPersonalQueryDTO() );

		ArrayList<InfoCreditSimplePersonTelDefaultDTO> tel_detail = new ArrayList<InfoCreditSimplePersonTelDefaultDTO>();
		tel_detail.add( new InfoCreditSimplePersonTelDefaultDTO() );

		ArrayList<InfoCreditSimplePersonUnpaidTaxDTO> unpaid_detail = new ArrayList<InfoCreditSimplePersonUnpaidTaxDTO>();
		unpaid_detail.add( new InfoCreditSimplePersonUnpaidTaxDTO() );



		HashMap<String,Object> mockReturnContext = new HashMap();
		HashMap<String,Object> resultContext = new HashMap<>();
		resultContext.put( "reportNo" ,"42349234921");

		resultContext.put( "queryTime" , "2019-06-05T03:57:00.000Z");

		resultContext.put( "reportTime" ,"2019-06-05T03:57:00.000Z");

		resultContext.put( "name" ,"韩小弟");

		resultContext.put( "IDType" ,"身份证");

		resultContext.put( "marriage" ,"已婚");

		resultContext.put( "ID" ,"31011519910503253X");

		resultContext.put( "summary" ,new InfoCreditSimplePersonSummaryDTO());

		resultContext.put( "assetDisposalDetails" ,AssetDisposal_detail);

		resultContext.put( "houseLoanDetails" ,houseLoan_detail);

		resultContext.put( "otherLoanDetails" ,otherLoan_detail);

		resultContext.put( "unpaidTaxDetails" ,unpaid_detail);

		resultContext.put( "guaranteeDetails" ,guarantee_detail);

		resultContext.put( "compensationDetails",Compenstion_detail );

		resultContext.put( "creditCardDetails",creditCard_detail );

		resultContext.put( "civialJudgementDetails" ,CivialJudgement_detail);

		resultContext.put( "executionDetails" ,execution_detail);

		resultContext.put( "penaltyDetails" ,penalty_detail);

		resultContext.put( "telDefaultDetails" ,tel_detail);

		resultContext.put( "personalQueryDetails" ,personalQuery_detail);

		resultContext.put( "instituteQueryDetails" ,instituteQuery_detail);

		resultContext.put( "source" ,"42349234921");





		mockReturnContext.put( "tid","tid" );
		mockReturnContext.put("tid", "credit" );
		mockReturnContext.put("subType","applyOrQuery");
		mockReturnContext.put("status","done");
		mockReturnContext.put("lastUpdateTime","2019-06-05T03:57:00.784Z");
		mockReturnContext.put("phase","querying");

		mockReturnContext.put("result",resultContext);
		String a = JSONUtil.toJson(mockReturnContext);
		System.out.println( a );
	}

	@Test public void pdf(){
		try
		{
			createAllPdf("123");
			System.out.println( "S" );
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (DocumentException e)
		{
			e.printStackTrace();
		}
	}
}
