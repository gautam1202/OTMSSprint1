import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.Assert;
import com.capgemini.OnlineTest.Exceptions.ResultException;
import com.capgemini.OnlineTest.dto.QuestionsDTO;
import com.capgemini.OnlineTest.dto.TestsDTO;
import com.capgemini.OnlineTest.services.ResultsServicesImplementation;
import org.junit.*;

public class TestCaseGetResult {
	
	public TestCaseGetResult() {
		// TODO Auto-generated constructor stub
	}
	 ResultsServicesImplementation resultobj=new ResultsServicesImplementation();
	 TestsDTO testDTO;

	 @Test
	    void TC_01()
	 {	        
		 ResultsServicesImplementation resultobj=new ResultsServicesImplementation();
		 assertThrows(ResultException.class,()->{resultobj.getResult(null);});
	 }


	@Test
	  public void TC_03() throws ResultException
	  {	
		  
		  System.out.println("Verifying obtained marks");
		  assertEquals("12" , resultobj.getResult(BigInteger.valueOf(10001)));
		  
	  }
	
	@Test
	  public void TC_02()
	  {
		  
		  System.out.println("Verifying Test title");
		  
		  
		  
		  assertEquals("Core Java Test", testService.showTest(BigInteger.valueOf(101)).getTestTitle());
		  
		  System.out.println("Verifying obtained marks");
		  assertEquals(BigDecimal.valueOf(80), testService.showTest(BigInteger.valueOf(101)).getTestMarksScored());
		  
	  }
}
