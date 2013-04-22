package karatechopthree;
//Binary Search version 3
public class KarateChop {

	public static int chop(int findNum, int[] numArray) {
		if (numArray.length == 0)
			return -1;
		else
			return chop(findNum, numArray, -1, numArray.length);
	}

	public static int chop(int findNum, int[] numArray, int minIndex, int maxIndex) {

		if (maxIndex - minIndex <= 1)
			return -1;

		int midIndex = (minIndex + maxIndex) / 2;

		if (findNum < numArray[midIndex])
			return chop(findNum, numArray, minIndex, midIndex);

		else if (findNum > numArray[midIndex])
			return chop(findNum, numArray, midIndex, maxIndex);

		else
			return midIndex;

	}

}
