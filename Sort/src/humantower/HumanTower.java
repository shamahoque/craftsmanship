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

	public void build(List<int[]> humanList) {
		int[] tinyestPerson;
		int[] nextTinyPerson;
		int[] lastPerson;

		if (!humanList.isEmpty()) {
			tinyestPerson = findTinyestPerson(humanList);
			orderedHumanList.add(tinyestPerson);
			humanList.remove(tinyestPerson);
			System.out.println(tinyestPerson[0] + "," + tinyestPerson[1]);
			while (!humanList.isEmpty()) {
				nextTinyPerson = findTinyestPerson(humanList);
				lastPerson = orderedHumanList.get(orderedHumanList.size() - 1);

				if (nextTinyPerson[height] > lastPerson[height]
						&& nextTinyPerson[weight] > lastPerson[weight]) {
					System.out.println(nextTinyPerson[0] + ","
							+ nextTinyPerson[1]);
					orderedHumanList.add(nextTinyPerson);
				}
				humanList.remove(nextTinyPerson);

			}

			largestNumberOfPeople = orderedHumanList.size();

		}
	}

	public int[] findTinyestPerson(List<int[]> humanList) {
		int minSize = 2000;
		int[] tinyestPerson = new int[2];
		for (int[] person : humanList) {
			if ((person[height] + person[weight]) < minSize) {
				tinyestPerson = person;
				minSize = person[height] + person[weight];
			}

		}
		return tinyestPerson;

	}

	public int getLargestNumberOfPeople() {
		return largestNumberOfPeople;
	}

	public List<int[]> getOrderedHumanList() {

		return orderedHumanList;
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
		fancyTower.build(humanList);
	}

}
