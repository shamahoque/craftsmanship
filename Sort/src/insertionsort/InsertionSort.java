package insertionsort;

public class InsertionSort {
	
	public static int[] sort(int[] unsortedIntegers){
		for (int i = 1; i < unsortedIntegers.length; i++){
			  int j = i;
			  int B = unsortedIntegers[i];
			  while ((j > 0) && (unsortedIntegers[j-1] > B)){
				  unsortedIntegers[j] = unsortedIntegers[j-1];
				  j--;
			  }
			  unsortedIntegers[j] = B;
			  }	
		return unsortedIntegers;
	}

}
