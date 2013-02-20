package sortingkata;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SortingBallsTest {
	private List<Integer> testList(int...is){
		List<Integer> list = new ArrayList<Integer>();
		for(int i:is){
			list.add(i);
		}
		return list;
	}
	
	@Test
	public void emptyRack(){	
		assertEquals(testList(), new SortingBalls().winningNumbers);
	}
	
	@Test
	public void drawMultipleBalls(){
		SortingBalls balls = new SortingBalls();
		
		assertEquals(testList(10),balls.drawAndDisplaySortedBalls(10));
		assertEquals(testList(10,20),balls.drawAndDisplaySortedBalls(20));
		assertEquals(testList(10,15,20),balls.drawAndDisplaySortedBalls(15));
		assertEquals(testList(10,15,20,90),balls.drawAndDisplaySortedBalls(90));
		assertEquals(testList(2,10,15,20,90),balls.drawAndDisplaySortedBalls(2));	
		
	}
}
