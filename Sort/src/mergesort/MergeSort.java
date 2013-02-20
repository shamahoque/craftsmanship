package mergesort;

public class MergeSort {
	public static int[] sort(int[] unsortedNumbers){
		return mergeSort(unsortedNumbers, 0, unsortedNumbers.length-1);	
	}
	
	public static int[] mergeSort(int[] numberList,int low, int high){
		  if (low >= high) {
		  return numberList;
		  }

		  int middle = (low + high) / 2;
		  mergeSort(numberList, low, middle);
		  mergeSort(numberList, middle + 1, high);
		  int end_low = middle;
		  int start_high = middle + 1;
		  while ((low <= end_low) && (start_high <= high)) {
			  if (numberList[low] < numberList[start_high]) {
				  low++;
			  } else {
				  int Temp = numberList[start_high];
				  for (int k = start_high- 1; k >= low; k--) {
					  numberList[k+1] = numberList[k];
				  }
				  numberList[low] = Temp;
			 low++;
			 end_low++;
			 start_high++;
			 }
		  }
		
		return numberList;
	}

}
