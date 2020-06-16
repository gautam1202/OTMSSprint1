package com.capgemini.OnlineTest.services;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.capgemini.OnlineTest.Exceptions.ResultException;
import com.capgemini.OnlineTest.TestDao.GetTestResultDaoImplementation;
import com.capgemini.OnlineTest.dto.QuestionsDTO;
import com.capgemini.OnlineTest.dto.TestsDTO;

public class ResultsServicesImplementation implements IResultsServices {
	 GetTestResultDaoImplementation testDAO=new GetTestResultDaoImplementation();
	TestsDTO testDTO;
	
	
	public BigDecimal getResult(BigInteger testId) throws ResultException 
	{   //takes the TestId and passes all the objects of the TestDTO class
		if(testId==null)
		{
			
			throw new ResultException("test object is null");
		}
		else{
			testDTO=testDAO.getTest(testId);
		Set<QuestionsDTO>question=testDTO.getTestQuestions();

		Iterator<QuestionsDTO> it=question.iterator();
		BigDecimal sum=new BigDecimal(0);

		while(it.hasNext())
			{   sum=sum.add(it.next().getMarksScored());
			}
		testDTO.setTestMarksScored(sum);

		return sum;
		
		}
		
		
	}
	
	public BigDecimal calculateTotalMarks(BigInteger testId) throws ResultException
	{
		if(testId==null)
		{
			throw new ResultException("test object is null");

			
		}
		else{
			testDTO=testDAO.getTest(testId);

			Set<QuestionsDTO>questionSet=testDTO.getTestQuestions();

			Iterator<QuestionsDTO> it=questionSet.iterator();
		
			
			while(it.hasNext())
				{   QuestionsDTO question=it.next();
	
					if(question.getChosenAnswer().equals(question.getQuestionAnswer()))
					{
						question.setMarksScored(question.getQuestionMarks());
						
					}
					else 
					{
						question.setMarksScored(new BigDecimal(0));

					}
				}
			return getResult(testId);
	}
	}
	
}