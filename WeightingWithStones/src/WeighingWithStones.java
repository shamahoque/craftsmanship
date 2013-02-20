public class WeighingWithStones {

	/**
	 * @param args
	 */
	// weighingObject = stone1 + stone2 + stone3 + stone4
	static final int[] sideOnScale = { -1, 0, 1 };

	public static void main(String[] args) {

		int stone1, stone2, stone3, stone4, weighingObject;

		for (stone1 = 1; stone1 <= 39; stone1++) {

			for (stone2 = 1; stone2 <= 39 - stone1; stone2++) {

				stone3: for (stone3 = 1; stone3 <= 39 - stone1 - stone2; stone3++) {

					stone4 = 40 - stone1 - stone2 - stone3;

					stone: for (weighingObject = 1; weighingObject <= 40; weighingObject++) {

						if (weightsMatch(weighingObject,stone1, stone2, stone3, stone4))	
							continue stone;
						

						continue stone3;

					}
					System.out.println(stone1 + " " + stone2 + " " + stone3+ " " + stone4);
				}

			}
		}

	}
	
	public static boolean weightsMatch(int object_to_weigh, int stone1, int stone2, int stone3, int stone4){
		boolean matchFound=false;
		for (int s1 : sideOnScale)
			for (int s2 : sideOnScale)
				for (int s3 : sideOnScale)
					for (int s4 : sideOnScale)
						if(object_to_weigh == s1 * stone1 + s2 * stone2
						+ stone3 * s3 + s4 * stone4)
							matchFound=true;
		return matchFound;
	}

}
