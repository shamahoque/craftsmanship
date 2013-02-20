import static org.junit.Assert.*;

import org.junit.Test;
public class PotterKataTest {
	
	//Basic Test Cases
	@Test
	public void emptyBookCart() {
		assertEquals(0.0, new BookCart().bestPrice(),0);
	}

	@Test
	public void oneBook() {
		assertEquals(8.0, new BookCart(0).bestPrice(),0);
		assertEquals(8.0, new BookCart(1).bestPrice(),0);
		assertEquals(8.0, new BookCart(2).bestPrice(),0);
		assertEquals(8.0, new BookCart(3).bestPrice(),0);
		assertEquals(8.0, new BookCart(4).bestPrice(),0);
	}

	@Test
	public void twoSameBooks() {
		assertEquals(16.0, new BookCart(0, 0).bestPrice(),0);
	}

	@Test
	public void threeSameBooks() {
		assertEquals(24.0, new BookCart(1, 1, 1).bestPrice(),0);
	}
	
	//Simple Discount Test Cases
	@Test
	public void twoDifferentBooks() {
		assertEquals(8 * 2 * 0.95, new BookCart(0, 1).bestPrice(),0);
	}

	@Test
	public void threeDifferentBooks() {
		assertEquals(8 * 3 * 0.9, new BookCart(0, 2, 4).bestPrice(),0);
	}

	@Test
	public void fourDifferentBooks() {
		assertEquals(8 * 4 * 0.8, new BookCart(0, 1, 2, 4).bestPrice(),0);
	}

	@Test
	public void fiveDifferentBooks() {
		assertEquals(8 * 5 * 0.75, new BookCart(0, 1, 2, 3, 4).bestPrice(),0);
	}
	
	//Several Discounts Test Cases
	@Test
	public void onePairPlusOne() {
		assertEquals(8 + (8 * 2 * 0.95), new BookCart(0, 0, 1).bestPrice(),0);
	}

	@Test
	public void twoPairs() {
		assertEquals(2 * (8 * 2 * 0.95), new BookCart(0, 0, 1, 1).bestPrice(),0);
	}

	@Test
	public void fourAndTwo() {
		assertEquals((8 * 4 * 0.8) + (8 * 2 * 0.95), new BookCart(0, 0, 1, 2, 2, 3).bestPrice(),0);
	}

	@Test
	public void fiveAndOne() {
		assertEquals(8 + (8 * 5 * 0.75), new BookCart(0, 1, 1, 2, 3, 4).bestPrice(),0);
	}
	
	//Edge Cases
	@Test
	public void twoFoursBetterThanFiveAndThree() {
		assertEquals(2 * (8 * 4 * 0.8), new BookCart(0, 0, 1, 1, 2, 2, 3, 4).bestPrice(),0);
	}

	@Test
	public void threeFivesAndTwoFours() {
		assertEquals(3 * (8 * 5 * 0.75) + 2 * (8 * 4 * 0.8), 
			    new BookCart(0, 0, 0, 0, 0, 
			           1, 1, 1, 1, 1, 
			           2, 2, 2, 2, 
			           3, 3, 3, 3, 3, 
			           4, 4, 4, 4).bestPrice(), 0);
	}
}
