package quicksort;

public class QuickSort {
	public static int[] sort(int[] unsortedNumbers){
		return quickSort(unsortedNumbers,0,unsortedNumbers.length-1);
		
	}
	public static int[] quickSort(int[] numberList, int low, int n){
		int lo = low;
		  int hi = n;
		  if (lo >= n) {
		  return numberList;
		  }
		  int mid = numberList[(lo + hi) / 2];
		  while (lo < hi) {
		  while (lo<hi && numberList[lo] < mid) {
		  lo++;
		  }
		  while (lo<hi && numberList[hi] > mid) {
		  hi--;
		  }
		  if (lo < hi) {
		  int T = numberList[lo];
		  numberList[lo] = numberList[hi];
		  numberList[hi] = T;
		  }
		  }
		  if (hi < lo) {
		  int T = hi;
		  hi = lo;
		  lo = T;
		  }
		  quickSort(numberList, low, lo);
		  quickSort(numberList, lo == low ? lo+1 : lo, n);
		  
		 return numberList; 
	}
}
