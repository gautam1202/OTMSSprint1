package com.capgemini.OnlineTest.TestDao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Set;

import com.capgemini.OnlineTest.Exceptions.ResultException;
import com.capgemini.OnlineTest.dto.QuestionsDTO;
import com.capgemini.OnlineTest.dto.TestsDTO;

public interface GetTestResultDao

{
	TestsDTO getTest(BigInteger testId) throws ResultException ;
}

	