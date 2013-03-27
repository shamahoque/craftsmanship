import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grid {
	int[] size;
	List<int[]> obstacleCells = new ArrayList<int[]>();

	Grid(int[] size) {
		this.size = size;
	}

	public boolean crossedEdge(int[] cell) {

		if (cell[0] == -1 || cell[0] > size[0] || cell[1] == -1
				|| cell[1] > size[1])
			return true;
		else
			return false;
	}

	public boolean isObstacle(int[] cell) {
		boolean obstacleFound = false;
		for (int[] c : obstacleCells) {
			if (Arrays.equals(c, cell)) {
				obstacleFound = true;
			}
		}
		return obstacleFound;
	}

	public void setObstacle(int[] cell) {
		obstacleCells.add(cell);
	}

	public int[] wrappedEdge(int[] cell) {
		if (cell[0] > size[0])
			cell[0] = 0;
		if (cell[0] == -1)
			cell[0] = size[0];
		if (cell[1] > size[1])
			cell[1] = 0;
		if (cell[1] == -1)
			cell[1] = size[1];
		return cell;
	}
}
