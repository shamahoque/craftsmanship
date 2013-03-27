public class Rover {
	private int[] location = new int[2];
	private char direction;
	private char[] possibleDirections = { 'N', 'E', 'S', 'W' };

	Rover(int[] location, char direction) {
		this.location = location;
		this.direction = direction;

	}

	public int[] getLocation() {
		for (int i : location) {
			System.out.println(i);
		}
		return location;
	}

	public void setLocation(int[] location) {
		this.location = location;
	}

	public char getDirection() {
		return direction;
	}

	public int[] newLocation(char moveCommand) {
		int[] newLocation = new int[2];
		newLocation[0] = location[0];
		newLocation[1] = location[1];
		if (direction == 'N') {
			if (moveCommand == 'f')
				newLocation[1]++;
			else
				newLocation[1]--;
		}
		if (direction == 'S') {
			if (moveCommand == 'f')
				newLocation[1]--;
			else
				newLocation[1]++;
		}
		if (direction == 'E') {
			if (moveCommand == 'f')
				newLocation[0]++;
			else
				newLocation[0]--;
		}
		if (direction == 'W') {
			if (moveCommand == 'f')
				newLocation[0]--;
			else
				newLocation[0]++;
		}
		return newLocation;

	}

	public void changeDirection(char turnCommand) {
		int index = 0;
		for (int i = 0; i < possibleDirections.length; i++) {
			if (direction == possibleDirections[i]) {
				index = i;
				break;
			}

		}
		if (turnCommand == 'r') {

			if (index == 3)
				index = -1;
			direction = possibleDirections[++index];

		} else {
			if (index == 0)
				index = 4;
			direction = possibleDirections[--index];

		}

	}

}
