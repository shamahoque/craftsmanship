import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RoverTest {
	int[] testLocation;
	Rover testRover;

	@Before
	public void initObjects() {
		testLocation = new int[] { 1, 2 };
		testRover = new Rover(testLocation, 'N');
	}

	@Test
	public void initialLocation() {
		assertArrayEquals(testLocation, testRover.getLocation());
	}

	@Test
	public void initialDirection() {
		assertEquals('N', testRover.getDirection());
	}

	@Test
	public void moveRover() {
		testRover.setLocation(testRover.newLocation('b'));
		assertArrayEquals(new int[] { 1, 1 }, testRover.getLocation());
		testRover.setLocation(testRover.newLocation('f'));
		assertArrayEquals(new int[] { 1, 2 }, testRover.getLocation());
	}

	@Test
	public void turnRover() {
		testRover.changeDirection('r');
		assertEquals('E', testRover.getDirection());
		testRover.changeDirection('l');
		assertEquals('N', testRover.getDirection());

	}
}
