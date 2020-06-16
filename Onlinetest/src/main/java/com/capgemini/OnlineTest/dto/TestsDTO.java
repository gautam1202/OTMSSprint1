package com.capgemini.OnlineTest.dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;

import com.capgemini.OnlineTest.dto.QuestionsDTO;

public class TestsDTO 
{
private BigInteger testId;
private Set<QuestionsDTO> testQuestions;
private BigDecimal testTotalMarks;
private BigDecimal testMarksScored;
public TestsDTO(BigInteger testId, Set<QuestionsDTO> testQuestions, BigDecimal testTotalMarks, BigDecimal testMarksScored) {
	super();
	this.testId = testId;
	this.testQuestions = testQuestions;
	this.testTotalMarks = testTotalMarks;
	this.testMarksScored = testMarksScored;
}
public BigInteger getTestId() {
	return testId;
}
public Set<QuestionsDTO> getTestQuestions() {
	return testQuestions;
}
public BigDecimal getTestTotalMarks() {
	return testTotalMarks;
}
public BigDecimal getTestMarksScored() {
	return testMarksScored;
}
public void setTestId(BigInteger testId) {
	this.testId = testId;
}
public void setTestQuestions(Set<QuestionsDTO> testQuestions) {
	this.testQuestions = testQuestions;
}
public void setTestTotalMarks(BigDecimal testTotalMarks) {
	this.testTotalMarks = testTotalMarks;
}
public void setTestMarksScored(BigDecimal testMarksScored) {
	this.testMarksScored = testMarksScored;
}
@Override
public int hashCode() {
	return super.hashCode();
}
@Override
public boolean equals(Object obj) {
	return super.equals(obj);
}
}