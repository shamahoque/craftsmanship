package sortingkata;

import java.util.ArrayList;
import java.util.List;

public class SortingBalls {
	public List<Integer> winningNumbers;
	
	public SortingBalls(){
		winningNumbers = new ArrayList<Integer>();
	}
	
	public List<Integer> drawAndDisplaySortedBalls(int newBall){
		
		
		if(winningNumbers.isEmpty() || winningNumbers.get(winningNumbers.size()-1)<newBall){
			winningNumbers.add(newBall);
		}
		else{
			for(int ball : winningNumbers){
				if(ball>=newBall){
					winningNumbers.set(winningNumbers.indexOf(ball), newBall);
					newBall=ball;
				}
			}
			winningNumbers.add(newBall);
		}
		return winningNumbers;
		
	}
	
}
