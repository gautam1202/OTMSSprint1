package com.capgemini.OnlineTest.services;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.capgemini.OnlineTest.Exceptions.ResultException;
import com.capgemini.OnlineTest.dto.TestsDTO;

public interface IResultsServices {
	
	 public BigDecimal getResult(TestsDTO testId) throws ResultException;
	 public BigDecimal calculateTotalMarks(TestsDTO testId) throws ResultException;
}