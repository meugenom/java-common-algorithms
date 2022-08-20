package codewars;

/**
 * A bookseller has lots of books classified in 26 categories labeled A, B, ...
 * Z.
 * Each book has a code c of 3, 4, 5 or more characters.
 * The 1st character of a code is a capital letter which defines the book
 * category.
 * In the bookseller's stocklist each code c is followed by a space and by a
 * positive integer n (int n >= 0)
 * which indicates the quantity of books of this code in stock.
 * 
 * For example an extract of a stocklist could be:
 * L = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"}.
 * or
 * L = ["ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"] or ....
 * You will be given a stocklist (e.g. : L) and a list of categories in capital
 * letters e.g :
 * M = {"A", "B", "C", "W"}
 * or
 * M = ["A", "B", "C", "W"] or ...
 * and your task is to find all the books of L with codes belonging to each
 * category of M and to sum their
 * quantity according to each category.
 * 
 * For the lists L and M of example you have to return the string (in
 * Haskell/Clojure/Racket a list of pairs):
 * (A : 20) - (B : 114) - (C : 50) - (W : 0)
 * where A, B, C, W are the categories, 20 is the sum of the unique book of
 * category A,
 * 114 the sum corresponding to "BKWRK" and "BTSQZ", 50 corresponding to "CDXEF"
 * and 0 to category 'W'
 * since there are no code beginning with W.
 * 
 * If L or M are empty return string is "" (Clojure and Racket should return an
 * empty array/list instead).
 * 
 * Note: In the result codes and their values are in the same order as in M.
 */

public class HelpTheBookSeller {

	// 1st parameter is the stocklist (L in example),
	// 2nd parameter is list of categories (M in example)
	public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) throws NumberFormatException {

		String result = "";
		int step_letter = 0;
		int length_letter = lstOf1stLetter.length;
		int maxAccum = 0;

		while (step_letter < length_letter) {

			// System.out.println(lstOf1stLetter[step_letter]);

			int step_art = 0;
			final int length_art = lstOfArt.length;
			int accum = 0;

			while (step_art < length_art) {

				if (lstOf1stLetter[step_letter].equals(lstOfArt[step_art].substring(0, 1))) {
					// System.out.println(lstOfArt[step_art].substring(0, 1));
					try {
						accum = accum + Integer.parseInt(lstOfArt[step_art].split(" ")[1]);
					} catch (NumberFormatException ex) {
						ex.printStackTrace();
					}
				}
				step_art++;
			}

			// need check list on null values
			if (accum > maxAccum)
				maxAccum = accum;

			// System.out.println("Summ : " + accum);
			if (result == "") {
				result = result + "(" + lstOf1stLetter[step_letter] + " : " + accum + ")";
			} else {
				result = result + " - " + "(" + lstOf1stLetter[step_letter] + " : " + accum + ")";
			}

			step_letter++;
		}

		return (maxAccum > 0) ? result : "";
	}

	public static void main(String[] args) {
		// System.out.println("");
		String art[] = new String[] { "ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600" };
		String cd[] = new String[] { "A", "B", "F" };
		System.out.println(stockSummary(art, cd));
	}

}