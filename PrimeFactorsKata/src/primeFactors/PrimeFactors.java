package primeFactors;
import java.util.*;

public class PrimeFactors {
	
	public static List<Integer> generate(int N){
		List<Integer> primeNumbers = new ArrayList<Integer>();
		
		for(int factor=2;N>1;factor++){
			while(N%factor==0){
				primeNumbers.add(factor);
				N=N/factor;
			}
			
		}
		return primeNumbers;
	}
	
	public static void main(String arg[]){
		//PrimeFactors p = new PrimeFactors();
		System.out.println(generate(16));
		
	}

}
