import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MoveOnGridTest {
	Rover testRover;
	Grid testGrid;
	MoveOnGrid testMovement;

	@Before
	public void initObjects() {
		testRover = new Rover(new int[] { 1, 2 }, 'N');
		testGrid = new Grid(new int[] { 10, 10 });
		testMovement = new MoveOnGrid();
		testMovement.setGrid(testGrid);
		testMovement.setRover(testRover);
	}

	@Test
	public void moveRover() {
		testMovement.move("rfrff");
		assertArrayEquals(new int[] { 2, 0 }, testRover.getLocation());
	}

	@Test
	public void checkObstacle() {
		testGrid.setObstacle(new int[] { 2, 0 });
		testMovement.move("rfrff");
		assertArrayEquals(new int[] { 2, 1 }, testRover.getLocation());
	}

	@Test
	public void checkCrossedEdge() {
		testMovement.move("lffff");
		assertArrayEquals(new int[] { 8, 2 }, testRover.getLocation());
	}

}
