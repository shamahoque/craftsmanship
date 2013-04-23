package humantower;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class HumanTowerTest {
	HumanTower testTower;
	int[] testPerson1 = { 5, 6 };
	int[] testPerson2 = { 6, 7 };
	int[] testPerson3 = { 9, 12 };
	int[] testPerson4 = { 4, 14 };
	int[] testPerson5 = { 6, 5 };
	int[] testPerson6 = { 4, 16 };
	int[] testPerson7 = { 4, 7 };

	public List<int[]> makeHumanList(int[]... people) {
		List<int[]> humanList = new ArrayList<int[]>();

		for (int[] person : people) {
			humanList.add(person);
		}
		return humanList;

	}

	@Before
	public void initTestObjects() {
		testTower = new HumanTower();
	}

	@Test
	public void towerWithNobody() {
		testTower.build(makeHumanList());
		assertEquals(0, testTower.getLargestNumberOfPeople());
		assertEquals(new ArrayList<int[]>(), testTower.getOrderedHumanList());
	}

	@Test
	public void towerWithOnePerson() {
		int[] testPerson1 = { 5, 6 };
		testTower.build(makeHumanList(testPerson1));
		assertEquals(1, testTower.getLargestNumberOfPeople());
		assertEquals(makeHumanList(testPerson1),
				testTower.getOrderedHumanList());
	}

	@Test
	public void towerWithTwoDifferentPeople() {

		testTower.build(makeHumanList(testPerson1, testPerson2));
		assertEquals(2, testTower.getLargestNumberOfPeople());
		assertEquals(makeHumanList(testPerson1, testPerson2),
				testTower.getOrderedHumanList());
	}

	@Test
	public void towerWithThreeDifferentPeople() {

		testTower.build(makeHumanList(testPerson1, testPerson2, testPerson3));
		assertEquals(3, testTower.getLargestNumberOfPeople());
		assertEquals(makeHumanList(testPerson1, testPerson2, testPerson3),
				testTower.getOrderedHumanList());
	}

	@Test
	public void twoSameSizedPeopleOutOfThree() {

		testTower.build(makeHumanList(testPerson1, testPerson2, testPerson5));
		assertEquals(2, testTower.getLargestNumberOfPeople());
		assertEquals(makeHumanList(testPerson1, testPerson2),
				testTower.getOrderedHumanList());
	}

	@Test
	public void ThreeOutOfFour() {
		testTower.build(makeHumanList(testPerson1, testPerson2, testPerson3,
				testPerson4));
		assertEquals(3, testTower.getLargestNumberOfPeople());
		assertEquals(makeHumanList(testPerson1, testPerson2, testPerson3),
				testTower.getOrderedHumanList());
	}
	
	@Test
	public void ThreeOutOfSeven() {
		testTower.build(makeHumanList(testPerson1, testPerson3, testPerson5,
				testPerson4, testPerson2, testPerson7, testPerson6));
		assertEquals(3, testTower.getLargestNumberOfPeople());
		assertEquals(makeHumanList(testPerson1, testPerson2, testPerson3),
				testTower.getOrderedHumanList());
	}



}
