package com.capgemini.OnlineTest.TestDao;

import com.capgemini.OnlineTest.util.*;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import com.capgemini.OnlineTest.dto.TestsDTO;

public class GetTestResultDaoImplementation implements GetTestResultDao {



	
		
		TestRepository testRepository;
		public static HashMap<BigInteger, TestsDTO> testTable;
		public GetTestResultDaoImplementation()
		{
			super();
			testRepository = new TestRepository();
			testTable=TestRepository.getTests();
		}
		public TestsDTO getTest(BigInteger testId){
	
			return testTable.get(testId);
		}
}