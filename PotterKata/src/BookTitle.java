import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class BookTitle {
	private final Map<Integer, Integer> titles = new HashMap<Integer, Integer>();

	public void recordBook(int title) {
		int count = 1;
		if (titles.containsKey(title))
			count = titles.get(title) + 1;
		titles.put(title, count);
	}

	public void removeOneSet(int count) {
		removeBooks(count);
		removeTitles(emptyTitles());
	}

	private void removeBooks(int count) {
		for (Iterator<Integer> it = titles.keySet().iterator(); it.hasNext(); ) {
			Integer key = it.next();
			titles.put(key, titles.get(key)-1);
			if (--count <= 0) return;
		}
	}

	private void removeTitles(List<Integer> keysToRemove) {
		for (Iterator<Integer> it = keysToRemove.iterator(); it.hasNext(); ) {
			titles.remove(it.next());
		}
	}

	private List<Integer> emptyTitles() {
		List<Integer> result = new ArrayList<Integer>();
		for (Iterator<Integer> it = titles.keySet().iterator(); it.hasNext(); ) {
			Integer key = it.next();
			if (titles.get(key) <= 0)
				result.add(key);
		}
		return result;
	}

	public boolean empty() {
		return numberOfDifferentTitles() == 0;
	}

	public int numberOfDifferentTitles() {
		return titles.size();
	}

}