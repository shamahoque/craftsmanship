/*Paper sheets of standard sizes: an expected-value problem.

A printing shop runs 16 batches (jobs) every week and each batch requires a sheet of special colour-proofing paper of size A5.
Every Monday morning, the foreman opens a new envelope, containing a large sheet of the special paper with size A1.
He proceeds to cut it in half, thus getting two sheets of size A2. Then he cuts one of them in half to get two sheets of size A3 and so on until he obtains the A5-size sheet needed for the first batch of the week.
All the unused sheets are placed back in the envelope.
At the beginning of each subsequent batch, he takes from the envelope one sheet of paper at random. If it is of size A5, he uses it. If it is larger, he repeats the 'cut-in-half' procedure until he has what he needs and any remaining sheets are always placed back in the envelope.
Excluding the first and last batch of the week, find the expected number of times (during each week) that the foreman finds a single sheet of paper in the envelope.*/

public class SingleSheets {

	public static double findExpectedNumberOfSingleSheets(int a2, int a3, int a4, int a5) {
		
		double countOfSingleSheetInEnvelope = 0;
		double numberOfSheetsInEnvelope = a2 + a3 + a4 + a5;
		
		if (numberOfSheetsInEnvelope == 0)
			return 0;
		
		if (numberOfSheetsInEnvelope == 1 && a5 == 0)
			countOfSingleSheetInEnvelope = 1;
		
		if (a2 != 0) 
			countOfSingleSheetInEnvelope += a2 * findExpectedNumberOfSingleSheets(a2 - 1, a3 + 1, a4 + 1, a5 + 1);
		
		if (a3 != 0) 
			countOfSingleSheetInEnvelope += a3 * findExpectedNumberOfSingleSheets(a2, a3 - 1, a4 + 1, a5 + 1);
		
		if (a4 != 0) 
			countOfSingleSheetInEnvelope += a4 * findExpectedNumberOfSingleSheets(a2, a3, a4 - 1, a5 + 1);
		
		if (a5 != 0) 
			countOfSingleSheetInEnvelope += a5 * findExpectedNumberOfSingleSheets(a2, a3, a4, a5 - 1);
		
		return (double) countOfSingleSheetInEnvelope / numberOfSheetsInEnvelope;

	}

	public static void main(String args[]) {
		double value = findExpectedNumberOfSingleSheets(0, 0, 0, 1);
		System.out.println(value);
	}


}
