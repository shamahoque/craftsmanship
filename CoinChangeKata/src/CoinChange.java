import java.util.Arrays;
import java.util.Collections;

public class CoinChange {

	public static int[] dispense(int amount, int[] denomination) {
		int[] coinsArray = new int[denomination.length];

		for (int index = denomination.length - 1; index >= 0; index--) {
			int count = amount / denomination[index];
			if (count >= 1) {
				coinsArray[index] = count;
				amount = amount - denomination[index] * count;
			} else
				coinsArray[index] = 0;
		}
		return coinsArray;
	}

}
