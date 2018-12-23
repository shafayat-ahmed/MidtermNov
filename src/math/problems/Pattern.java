package math.problems;

import java.util.ArrayList;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
		ArrayList<Integer> numbers = new ArrayList<>();
		int x = 100;
		numbers.add(x);
		int c = 10;
		int y = 1;
		do {
			for (int i = 0; i < c; i++) {
				x = x - y;
				numbers.add(x);
			}
			y++;
		} while (x > 0);
		System.out.println("list according to pattern:");
		for (Integer z : numbers) System.out.println(z);
		System.out.println();





	}
}
