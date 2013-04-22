package karatechopone;
//Binary Search version 1
import static org.junit.Assert.*;

import org.junit.Test;

public class KarateChopTest {

	@Test
	public void testCases() {
		assertEquals(-1, KarateChop.chop(3, new int[] {}));
		assertEquals(-1, KarateChop.chop(3, new int[] { 1 }));
		assertEquals(0, KarateChop.chop(1, new int[] { 1 }));

		assertEquals(0, KarateChop.chop(1, new int[] { 1, 3, 5 }));
		assertEquals(1, KarateChop.chop(3, new int[] { 1, 3, 5 }));
		assertEquals(2, KarateChop.chop(5, new int[] { 1, 3, 5 }));
		assertEquals(-1, KarateChop.chop(0, new int[] { 1, 3, 5 }));
		assertEquals(-1, KarateChop.chop(2, new int[] { 1, 3, 5 }));
		assertEquals(-1, KarateChop.chop(4, new int[] { 1, 3, 5 }));
		assertEquals(-1, KarateChop.chop(6, new int[] { 1, 3, 5 }));

		assertEquals(0, KarateChop.chop(1, new int[] { 1, 3, 5, 7 }));
		assertEquals(1, KarateChop.chop(3, new int[] { 1, 3, 5, 7 }));
		assertEquals(2, KarateChop.chop(5, new int[] { 1, 3, 5, 7 }));
		assertEquals(3, KarateChop.chop(7, new int[] { 1, 3, 5, 7 }));
		assertEquals(-1, KarateChop.chop(0, new int[] { 1, 3, 5, 7 }));
		assertEquals(-1, KarateChop.chop(2, new int[] { 1, 3, 5, 7 }));
		assertEquals(-1, KarateChop.chop(4, new int[] { 1, 3, 5, 7 }));
		assertEquals(-1, KarateChop.chop(6, new int[] { 1, 3, 5, 7 }));
		assertEquals(-1, KarateChop.chop(8, new int[] { 1, 3, 5, 7 }));

	}

}
