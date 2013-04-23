/*
 * A circus is designing a tower routine consisting of people standing atop one another's shoulders. 
 * For practical and aesthetic reasons, each person must be both shorter and lighter than the person below him or her.
 * 
 * Given the heights and weights of each person in the circus, 
 *  write a method to compute the largest possible number of people in such a tower.
 *  
 *  Example: 
 *  Input (ht, wt): (65, 100), (70, 150), (56, 90), (75, 190), (60, 95), (68, 110)
 *  
 *  Output: The longest tower is length 6 and includes from top to bottom: 
 *  (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190)
 * */

package humantower;

import java.util.ArrayList;
import java.util.List;

public class HumanTower {
	private final int height = 0;
	private final int weight = 1;
	private int largestNumberOfPeople;
	private List<int[]> orderedHumanList;

	HumanTower() {
		orderedHumanList = new ArrayList<int[]>();
		largestNumberOfPeople = 0;
	}

	public List<int[]> buildTower(List<int[]> sortedHumanList) {
		int max;
		int maxNumber_so_far = 0;
		int maxNumber_ending_here = 0;
		int tempHeight = Integer.MIN_VALUE;
		int tempWeight = Integer.MIN_VALUE;
		List<int[]> humanTower = new ArrayList<int[]>();

		for (int[] human : sortedHumanList) {
			if (human[height] > tempHeight && human[weight] > tempWeight) {
				maxNumber_ending_here++;
				tempHeight = human[height];
				tempWeight = human[weight];
				humanTower.add(human);
			} else {
				max = findMaxSubTower(human, sortedHumanList).size();
				if (max > maxNumber_so_far) {
					maxNumber_so_far = max;
					orderedHumanList = findMaxSubTower(human, sortedHumanList);
				}
			}

			if (maxNumber_ending_here > maxNumber_so_far) {
				maxNumber_so_far = maxNumber_ending_here;
			}
		}
		largestNumberOfPeople = maxNumber_so_far;

		if (orderedHumanList.size() < humanTower.size())
			orderedHumanList = humanTower;

		return orderedHumanList;

	}

	public List<int[]> findMaxSubTower(int[] human, List<int[]> sortedList) {
		List<int[]> tempTower = new ArrayList<int[]>();
		int tempHeight = human[height];
		tempTower.add(human);
		for (int i = sortedList.indexOf(human) + 1; i < sortedList.size(); i++) {
			if (sortedList.get(i)[height] > tempHeight) {
				tempTower.add(sortedList.get(i));
				tempHeight = sortedList.get(i)[height];
			}
		}
		return tempTower;
	}

	public List<int[]> build(List<int[]> humanList) {
		return buildTower(sortWithWeight(humanList, 0, humanList.size() - 1));
	}

	public List<int[]> sortList(List<int[]> humanList) {
		return sortWithWeight(humanList, 0, humanList.size() - 1);
	}

	public int getLargestNumberOfPeople() {
		largestNumberOfPeople = orderedHumanList.size();
		return largestNumberOfPeople;
	}

	public List<int[]> getOrderedHumanList() {
		return orderedHumanList;
	}

	public List<int[]> sortWithWeight(List<int[]> humanList, int start, int end) {
		if (start >= end) {
			return humanList;
		}

		int middle = (start + end) / 2;
		sortWithWeight(humanList, start, middle);
		sortWithWeight(humanList, middle + 1, end);

		int end_low = middle;
		int start_high = middle + 1;
		while ((start <= end_low) && (start_high <= end)) {
			if (humanList.get(start)[weight] < humanList.get(start_high)[weight]) {
				start++;
			} else {
				int[] Temp = humanList.get(start_high);
				for (int k = start_high - 1; k >= start; k--) {
					humanList.set(k + 1, humanList.get(k));
				}
				humanList.set(start, Temp);
				start++;
				end_low++;
				start_high++;
			}
		}

		return humanList;
	}

	public static void main(String args[]) {

		HumanTower fancyTower = new HumanTower();
		List<int[]> humanList = new ArrayList<int[]>();
		humanList.add(new int[] { 65, 100 });
		humanList.add(new int[] { 70, 150 });
		humanList.add(new int[] { 56, 90 });
		humanList.add(new int[] { 75, 190 });
		humanList.add(new int[] { 60, 95 });
		humanList.add(new int[] { 68, 110 });

		List<int[]> humanTower = fancyTower.build(humanList);
		for (int[] human : humanTower) {
			System.out.println(human[0] + " " + human[1]);
		}
		System.out.println(fancyTower.largestNumberOfPeople);

	}

}
