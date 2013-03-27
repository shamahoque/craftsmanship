import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class GridTest {
	
	Grid testGrid;
	
	@Before
	public void initObjects(){
		testGrid = new Grid(new int[]{10,10});
		
	}
	
	@Test
	public void checkCrossedEdge(){		
		assertEquals(true,testGrid.crossedEdge(new int[]{-1,0}));		
		assertEquals(true,testGrid.crossedEdge(new int[]{1,11}));
		assertEquals(false,testGrid.crossedEdge(new int[]{0,0}));
	}
	
	@Test
	public void checkObstacleCell(){
		int[] cell = {2,1};
		testGrid.setObstacle(cell);
		assertEquals(true, testGrid.isObstacle(cell));
		assertEquals(false, testGrid.isObstacle(new int[]{0,1}));
	}
	
	@Test
	public void cellAfterWrap(){
		assertArrayEquals(new int[]{10,0},testGrid.wrappedEdge(new int[]{-1,0}));
		assertArrayEquals(new int[]{1,0},testGrid.wrappedEdge(new int[]{1,11}));
	}

}
