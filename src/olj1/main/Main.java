package olj1.main;

import java.util.ArrayList;

public class Main {
	// private static final char[] CHARS = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
	// 'i', 'j', 'k', 'l', 'm', 'n', 'o',
	// 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	private static final String CHARS = "abcdefghijklmnopqrstuvwxyz";
	
	public static ArrayList<Integer> findLetterNumber(char letter) {
		// char letter = 'z';

		ArrayList<Integer> outputList = new ArrayList<>();
		
		for (int i = 0; i < CHARS.length(); i++) { // i++ <=> i = i + 1 <=> i += 1;
			if (letter == CHARS.toCharArray()[i]) {
				outputList.add(i);
				System.out.print((i + 1) + " ");
			}
		}
		return outputList;
	}

	public static void main(String[] args) {
		// findLetterNumber('z');
		// String input = "abrsecdo";

		// for(int iterator = 1; iterator < 11; iterator++) {
		// System.out.println(iterator);
		// }

		// for(int i = 0; i < input.length(); i++) {
		// findLetterNumber(input.charAt(i));
		// }

		InputManager inputGetter = InputManager.getInstance();
		String input;
		ArrayList<Integer> numberList = new ArrayList<>();
		long sum;
		
		do {
			input = inputGetter.nextLine();
			
			sum = 0;
			
			for (char currentChar : input.toCharArray()) {
				numberList.addAll(findLetterNumber(currentChar));
			}
			
			for(int iterator : numberList) {
				sum += iterator;
			}
			System.out.println();
			System.out.println("Suma numerelor este " + sum);
		} while (!input.equals("exit") && !input.equals(""));
	}
}
