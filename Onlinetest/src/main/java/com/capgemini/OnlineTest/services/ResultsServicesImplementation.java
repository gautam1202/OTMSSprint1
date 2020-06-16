package com.capgemini.OnlineTest.services;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Set;

import com.capgemini.OnlineTest.Exceptions.ResultException;
import com.capgemini.OnlineTest.TestDao.GetTestResultDaoImplementation;
import com.capgemini.OnlineTest.dto.QuestionsDTO;
import com.capgemini.OnlineTest.dto.TestsDTO;

public class ResultsServicesImplementation implements IResultsServices {
	static GetTestResultDaoImplementation tests;
	public BigDecimal getResult(TestsDTO testId) throws ResultException 
	{   
		if(testId!=null)
		{
		Set<QuestionsDTO>question=testId.getTestQuestions();
		Iterator<QuestionsDTO> it=question.iterator();
		BigDecimal sum=new BigDecimal(0);
		while(it.hasNext())
			{   sum=sum.add(it.next().getMarksScored());
			}
		testId.setTestMarksScored(sum);
		return sum;}
		else throw new ResultException("test object is null");
		
		
	}
	
	public BigDecimal calculateTotalMarks(TestsDTO testId) throws ResultException
	{
		if(testId!=null)
		{
			Set<QuestionsDTO>questionSet=testId.getTestQuestions();
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
		else throw new ResultException("test object is null");
	}

	
}