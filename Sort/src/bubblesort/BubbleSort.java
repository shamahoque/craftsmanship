package bubblesort;

public class BubbleSort {
	public static int[] sort(int[] unsortedIntegers){
		 int i, j,k=0;
		  for(i = 0; i < unsortedIntegers.length; i++){
			  for(j = 1; j < (unsortedIntegers.length-i); j++){
				  	if(unsortedIntegers[j-1] > unsortedIntegers[j]){
				  		k = unsortedIntegers[j-1];
				  		unsortedIntegers[j-1]=unsortedIntegers[j];
				  		unsortedIntegers[j]=k;
				  	}
			  }
		  }
		return unsortedIntegers;
	}

}
