import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SingleSheetsTest {
	private SingleSheets test;
	@Before
	public void setUp(){
		test = new SingleSheets();
	}
	
	@Test
	public void noSheetsInEnvelope(){
		assertTrue(test.findExpectedNumberOfSingleSheets(0,0,0,0) == 0);
	}
	
	@Test
	public void singleA5InEvnvelope(){
		assertTrue( test.findExpectedNumberOfSingleSheets(0,0,0,1) == 0);
	}
	
	@Test
	public void singleA4InEnvelope(){
		assertTrue( test.findExpectedNumberOfSingleSheets(0,0,1,0) == 1);
	}
	
	@Test
	public void SingleA3Only(){
		assertTrue( test.findExpectedNumberOfSingleSheets(0,1,0,0) == 1.5);
	}
	
	@Test
	public void SingleA2Only(){

	}
	
}
