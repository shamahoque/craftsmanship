package karatechopone;
//Binary Search version 1
public class KarateChop {

	public static int chop(int findNum, int[] numArray) {
		int found = -1;
		int maxIndex = numArray.length - 1;
		int minIndex = 0;

		while (minIndex <= maxIndex) {
			int midIndex = (minIndex + maxIndex) / 2;
			if (findNum < numArray[midIndex])
				maxIndex = midIndex - 1;
			else if (findNum > numArray[midIndex])
				minIndex = midIndex + 1;

			else {
				found = midIndex;
				return found;
			}
		}

		return found;
	}

}
