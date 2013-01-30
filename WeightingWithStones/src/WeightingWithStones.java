public class WeightingWithStones {

	/**
	 * @param args
	 */
	// a = stone1 + stone2 + stone3 + stone4
	static final int[] sign = { -1, 0, 1 };

	public static void main(String[] args) {

		int stone1, stone2, stone3, stone4;
		int a;

		for (stone1 = 1; stone1 <= 39; stone1++) {

			for (stone2 = 1; stone2 <= 39 - stone1; stone2++) {

				stone3: for (stone3 = 1; stone3 <= 39 - stone1 - stone2; stone3++) {

					stone4 = 40 - stone1 - stone2 - stone3;
					// System.out.println(""+stone1+stone2+stone3+stone4);

					stone: for (a = 1; a <= 40; a++) {
						for (int s1 : sign)
							for (int s2 : sign)
								for (int s3 : sign)
									for (int s4 : sign)
										if (a == s1 * stone1 + s2 * stone2
												+ stone3 * s3 + s4 * stone4)
											continue stone;

						continue stone3;

					}
					System.out.println(stone1 + " " + stone2 + " " + stone3
							+ " " + stone4);
				}

			}
		}

	}

}
