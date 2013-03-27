public class MoveOnGrid {
	private Grid currentGrid;
	private Rover movingRover;
	private int[] newPosition;
	private boolean obstacleFound;

	public void move(String command) {
		char[] commands = command.toCharArray();
		for (char c : commands) {
			if (c == 'b' || c == 'f') {
				newPosition = movingRover.newLocation(c);
				setCheckedLocation(newPosition);
			}

			if (c == 'r' || c == 'l') {
				movingRover.changeDirection(c);
			}
		}
	}

	public void setCheckedLocation(int[] cell) {
		if (currentGrid.crossedEdge(newPosition)) {
			newPosition = currentGrid.wrappedEdge(newPosition);
		}
		if (currentGrid.isObstacle(newPosition)) {
			obstacleFound = true;
		} else {
			movingRover.setLocation(newPosition);
		}
	}

	public void setRover(Rover movingRover) {
		this.movingRover = movingRover;
	}

	public void setGrid(Grid currentGrid) {
		this.currentGrid = currentGrid;
	}

}
