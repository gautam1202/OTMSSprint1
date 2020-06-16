package com.capgemini.OnlineTest.ui;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.capgemini.OnlineTest.Exceptions.ResultException;
import com.capgemini.OnlineTest.TestDao.GetTestResultDaoImplementation;
import com.capgemini.OnlineTest.dto.QuestionsDTO;
import com.capgemini.OnlineTest.dto.TestsDTO;
import com.capgemini.OnlineTest.services.IResultsServices;
import com.capgemini.OnlineTest.services.ResultsServicesImplementation;
import com.capgemini.OnlineTest.util.TestRepository;
public class MainFunction {
	static ResultsServicesImplementation resultsobj=new ResultsServicesImplementation();
	
	public static void main(String[] args) {

		int choice=0;
        Scanner input=new Scanner(System.in);
        
        System.out.println("SELECT ACTION \n");
        System.out.println("1. Get Result");
        System.out.println("2. Calculate Marks");
        
		BigInteger testId;
        
        try { 
        	choice=input.nextInt();
        switch(choice){
                case 1: 
            	 	
                	System.out.println("Enter testId");
                	testId = input.nextBigInteger();
           	 		System.out.println( resultsobj.getResult(testId));
                                break;
                                
                case 2: 
                	System.out.println("Enter testId");
                	testId = input.nextBigInteger();
                	System.out.println(resultsobj.calculateTotalMarks(testId));
                                break;    
        			  }
	}
    catch(ResultException exception)
        {
    	System.out.println(exception.getMessage());
        }
	}}

    		
    		
	