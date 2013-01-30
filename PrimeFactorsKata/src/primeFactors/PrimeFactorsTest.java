package primeFactors;
import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;
import static primeFactors.PrimeFactors.generate;

public class PrimeFactorsTest {
	private List<Integer> list(int...is){
		List<Integer> list = new ArrayList<Integer>();
		for(int i:is){
			list.add(i);
		}
		return list;
	}
	@Test
	public void testOne(){
		assertEquals(list(), generate(1));
		System.out.println(generate(-1));
	}
	
	@Test
	public void testThirty(){
		assertEquals(list(2,3,5), generate(30));
	}
	
}
