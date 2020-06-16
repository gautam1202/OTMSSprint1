//import static org.junit.Assert.assertEquals;
//
//import java.math.BigDecimal;
//import java.math.BigInteger;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import org.junit.Test;
//
//import com.capgemini.OnlineTest.dto.QuestionsDTO;
//import com.capgemini.OnlineTest.dto.TestsDTO;
//import com.capgemini.OnlineTest.services.ResultsServicesImplementation;
//
//public class TestCaseGetResult {
//	@Test
//    public void getResultTest()
//    {
//		HashMap<Integer,TestsDTO> tests=new HashMap<Integer,TestsDTO>();
//		Set<QuestionsDTO> questions=new HashSet<QuestionsDTO>();
//		Set<QuestionsDTO> questions2=new HashSet<QuestionsDTO>();
//		List<String> questionOptions=new ArrayList<String>();
//			TestsDTO tests1 = new TestsDTO(new BigInteger("10001"),questions,new BigDecimal(20),new BigDecimal(16));
//			TestsDTO tests2 = new TestsDTO(new BigInteger("10002"),questions2,new BigDecimal(20),new BigDecimal(12));
//			QuestionsDTO ques1=new QuestionsDTO(new BigInteger("1111"), questionOptions,"Ques1",2,new BigDecimal (4),1,new BigDecimal (0));
//			QuestionsDTO ques2=new QuestionsDTO(new BigInteger("1112"), questionOptions,"Ques2",1, new BigDecimal(4), 1,new BigDecimal (4));
//			QuestionsDTO ques3=new QuestionsDTO(new BigInteger("1113"), questionOptions,"Ques3",2,new BigDecimal (4),2,new BigDecimal (4));
//			QuestionsDTO ques4=new QuestionsDTO(new BigInteger("1114"), questionOptions,"Ques4",1, new BigDecimal(4),1,new BigDecimal (4));
//			QuestionsDTO ques5=new QuestionsDTO(new BigInteger("1115"), questionOptions,"Ques5",2,new BigDecimal(4),2,new BigDecimal (4));			
//			questions.add(ques1);
//			questions.add(ques2);
//			questions.add(ques3);
//			questions.add(ques4);
//			questions.add(ques5);	
//			QuestionsDTO ques6=new QuestionsDTO(new BigInteger("1116"), questionOptions,"Ques6",2,new BigDecimal (4),1,new BigDecimal (0));
//			QuestionsDTO ques7=new QuestionsDTO(new BigInteger("1117"), questionOptions,"Ques7",1, new BigDecimal(4), 2,new BigDecimal (0));
//			QuestionsDTO ques8=new QuestionsDTO(new BigInteger("1118"), questionOptions,"Ques8",2,new BigDecimal (4),2,new BigDecimal (4));
//			QuestionsDTO ques9=new QuestionsDTO(new BigInteger("1119"), questionOptions,"Ques9",1, new BigDecimal(4),1,new BigDecimal (4));
//			QuestionsDTO ques10=new QuestionsDTO(new BigInteger("1110"), questionOptions,"Ques10",2,new BigDecimal(4),2,new BigDecimal (4));		
//			questions2.add(ques6);
//			questions2.add(ques7);
//			questions2.add(ques8);
//			questions2.add(ques9);
//			questions2.add(ques10);
//			
//			tests.put(10001, tests1);
//			tests.put(10002, tests2);
//			
//			ResultsServicesImplementation resultobj=new ResultsServicesImplementation(); //.addTest(tests);
//			resultobj.getResult(tests.get(testId));
////			BigDecimal ob= Examination.getResult(test.getTestId());
//        assertEquals(new BigDecimal(16),resultobj);
//    }
//}
