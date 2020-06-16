  
package com.capgemini.OnlineTest.util;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.capgemini.OnlineTest.dto.QuestionsDTO;
import com.capgemini.OnlineTest.dto.TestsDTO;


public class TestRepository 
{	
	
	public static Set<QuestionsDTO> questions=new HashSet<QuestionsDTO>();
	public static Set<QuestionsDTO> questions2=new HashSet<QuestionsDTO>();
	public static List<String> questionOptions=new ArrayList<String>();
	public static HashMap<BigInteger,TestsDTO> tests=new HashMap<BigInteger,TestsDTO>();
	
	static {
		QuestionsDTO ques1=new QuestionsDTO(new BigInteger("1111"), questionOptions,"Ques1",2,new BigDecimal (4),1,new BigDecimal (0));
		QuestionsDTO ques2=new QuestionsDTO(new BigInteger("1112"), questionOptions,"Ques2",1, new BigDecimal(4), 1,new BigDecimal (4));
		QuestionsDTO ques3=new QuestionsDTO(new BigInteger("1113"), questionOptions,"Ques3",2,new BigDecimal (4),2,new BigDecimal (4));
		QuestionsDTO ques4=new QuestionsDTO(new BigInteger("1114"), questionOptions,"Ques4",1, new BigDecimal(4),1,new BigDecimal (4));
		QuestionsDTO ques5=new QuestionsDTO(new BigInteger("1115"), questionOptions,"Ques5",2,new BigDecimal(4),2,new BigDecimal (4));			
		questions.add(ques1);
		questions.add(ques2);
		questions.add(ques3);
		questions.add(ques4);
		questions.add(ques5);	
		QuestionsDTO ques6=new QuestionsDTO(new BigInteger("1116"), questionOptions,"Ques6",2,new BigDecimal (4),1,new BigDecimal (0));
		QuestionsDTO ques7=new QuestionsDTO(new BigInteger("1117"), questionOptions,"Ques7",1, new BigDecimal(4), 2,new BigDecimal (0));
		QuestionsDTO ques8=new QuestionsDTO(new BigInteger("1118"), questionOptions,"Ques8",2,new BigDecimal (4),2,new BigDecimal (4));
		QuestionsDTO ques9=new QuestionsDTO(new BigInteger("1119"), questionOptions,"Ques9",1, new BigDecimal(4),1,new BigDecimal (4));
		QuestionsDTO ques10=new QuestionsDTO(new BigInteger("1110"), questionOptions,"Ques10",2,new BigDecimal(4),2,new BigDecimal (4));		
		questions2.add(ques6);
		questions2.add(ques7);
		questions2.add(ques8);
		questions2.add(ques9);
		questions2.add(ques10);
		
		
		TestsDTO tests1 = new TestsDTO(new BigInteger("10001"),questions,new BigDecimal(20),new BigDecimal(0));
		TestsDTO tests2 = new TestsDTO(new BigInteger("10002"),questions2,new BigDecimal(20),new BigDecimal(0));
		tests.put(tests1.getTestId(), tests1);
		tests.put(tests1.getTestId(), tests2);
		}

	

	
	public static Set<QuestionsDTO> getQuestions() {
		return questions;
	}




	public static Set<QuestionsDTO> getQuestions2() {
		return questions2;
	}




	public static List<String> getQuestionOptions() {
		return questionOptions;
	}




	public static HashMap<BigInteger, TestsDTO> getTests() {
		return tests;
	}




	public static void setQuestions(Set<QuestionsDTO> questions) {
		TestRepository.questions = questions;
	}




	public static void setQuestions2(Set<QuestionsDTO> questions2) {
		TestRepository.questions2 = questions2;
	}




	public static void setQuestionOptions(List<String> questionOptions) {
		TestRepository.questionOptions = questionOptions;
	}




	public static void setTests(HashMap<BigInteger, TestsDTO> tests) {
		TestRepository.tests = tests;
	}



	public TestRepository()
	{
		
		
	}
	
}