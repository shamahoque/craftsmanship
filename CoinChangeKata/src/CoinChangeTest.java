import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Test;

public class CoinChangeTest {
	@Test
	public void SingleCoinChange() {
		Assert.assertTrue(Arrays.equals(new int[] { 1, 0, 0, 0 },
				CoinChange.dispense(1, new int[] { 1, 3, 4, 5 })));

		Assert.assertTrue(Arrays.equals(new int[] { 0, 1, 0, 0 },
				CoinChange.dispense(3, new int[] { 1, 3, 4, 5 })));

		Assert.assertTrue(Arrays.equals(new int[] { 0, 0, 1, 0 },
				CoinChange.dispense(4, new int[] { 1, 3, 4, 5 })));

		Assert.assertTrue(Arrays.equals(new int[] { 0, 0, 0, 1 },
				CoinChange.dispense(5, new int[] { 1, 3, 4, 5 })));
	}

	@Test
	public void MultipleCoins() {
		Assert.assertTrue(Arrays.equals(new int[] { 2, 0, 0, 0 },
				CoinChange.dispense(2, new int[] { 1, 3, 4, 5 })));

		Assert.assertTrue(Arrays.equals(new int[] { 0, 1, 1, 0, 0 },
				CoinChange.dispense(15, new int[] { 1, 5, 10, 25, 100 })));

		Assert.assertTrue(Arrays.equals(new int[] { 0, 1, 1, 1, 0 },
				CoinChange.dispense(40, new int[] { 1, 5, 10, 25, 100 })));

		Assert.assertTrue(Arrays.equals(new int[] { 1, 2, 0, 0, 1 },
				CoinChange.dispense(121, new int[] { 1, 10, 15, 25, 100 })));

	}

}
