package karatechoptwo;
//Binary Search version 2
public class KarateChop {

	public static int chop(int findNum, int[] numArray) {
		int found = -1;
		int maxIndex = numArray.length;
		int minIndex = -1;

		while (maxIndex - minIndex > 1) {
			int midIndex = (minIndex + maxIndex) / 2;
			System.out.print(midIndex);
			if (findNum < numArray[midIndex])
				maxIndex = midIndex;
			else if (findNum > numArray[midIndex])
				minIndex = midIndex;

			else {
				found = midIndex;
				return found;
			}
		}

		return found;
	}

}
