package com.capgemini.OnlineTest.dto;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class QuestionsDTO {
	private BigInteger questionId;
	private List<String> questionOptions;
	private String questionTitle;
	private Integer questionAnswer;
	private BigDecimal questionMarks;
	private Integer chosenAnswer;
	private BigDecimal marksScored;
	public QuestionsDTO(BigInteger questionId, List<String> questionOptions, String questionTitle, Integer questionAnswer,
			BigDecimal questionMarks, Integer chosenAnswer, BigDecimal marksScored) {
		super();
		this.questionId = questionId;
		this.questionOptions = questionOptions;
		this.questionTitle = questionTitle;
		this.questionAnswer = questionAnswer;
		this.questionMarks = questionMarks;
		this.chosenAnswer = chosenAnswer;
		this.marksScored = marksScored;
	}
	public BigInteger getQuestionId() {
		return questionId;
	}
	public List<String> getQuestionOptions() {
		return questionOptions;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public Integer getQuestionAnswer() {
		return questionAnswer;
	}
	public BigDecimal getQuestionMarks() {
		return questionMarks;
	}
	public Integer getChosenAnswer() {
		return chosenAnswer;
	}
	public BigDecimal getMarksScored() {
		return marksScored;
	}
	public void setQuestionId(BigInteger questionId) {
		this.questionId = questionId;
	}
	public void setQuestionOptions(List<String> questionOptions) {
		this.questionOptions = questionOptions;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public void setQuestionAnswer(Integer questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	public void setQuestionMarks(BigDecimal questionMarks) {
		this.questionMarks = questionMarks;
	}
	public void setChosenAnswer(Integer chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}
	public void setMarksScored(BigDecimal marksScored) {
		this.marksScored = marksScored;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}

	
	