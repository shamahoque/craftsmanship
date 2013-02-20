
public class BookCart {
	
	private final int[] books;
	private final double[] discounts = new double[] {1, 1, 0.95, 0.9, 0.8, 0.75};


	public BookCart(int... books) {
		this.books = books;
	}

	public double bestPrice(){
		double bestPrice=0.0;
		double totalPrice1=priceFor(countBookTitles(books));
		double totalPrice2=firstFourSetPrice(countBookTitles(books));
		
		if(totalPrice1>totalPrice2)
			bestPrice=totalPrice2;
		else
			bestPrice=totalPrice1;
		return bestPrice;
	}
	
	
	public double priceFor(BookTitle titles){
		
		double result = 0.0;
		int differentTitles = 0;
		
/*		BookTitle titles = new BookTitle();
		for (int id : books)
			titles.recordBook(id);
		
		if (titles.numberOfDifferentTitles() >= 4) {
			result += 8 * 4 * discountFor(4);
			titles.removeOneSet(4);
		}
*/		while (!titles.empty()) {
			differentTitles = titles.numberOfDifferentTitles();
			titles.removeOneSet(differentTitles);
			result += 8 * differentTitles * discounts[differentTitles];
		}
		return result;
	}
	
	public double firstFourSetPrice(BookTitle titles){
		double result=0.0;
		if (titles.numberOfDifferentTitles() >= 4) {
			result += 8 * 4 * discounts[4];
			titles.removeOneSet(4);
		}
		result+=priceFor(titles);
		return result;
		
	}
	public BookTitle countBookTitles(int...books){
		BookTitle titles = new BookTitle();
		for (int id : books)
			titles.recordBook(id);
		
		return titles;
		
	}
}
