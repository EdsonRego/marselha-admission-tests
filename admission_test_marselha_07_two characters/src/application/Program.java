package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// System.out.print("Enter the String size: ");
		int stringLength = sc.nextInt();

		// System.out.print("Enter the String: ");
		String string = sc.next();

		int maxPattern = 0;

		if (string.length() == 1) {
			System.out.println(maxPattern);
			System.exit(0);
		}

		for (int i = 0; i < stringLength; i++) {
			nextLetter:

			for (int j = i + 1; j < stringLength; j++) {
				char one = (char) ('a' + i);
				char two = (char) ('a' + j);
				char lastSeen = '\u0000';
				int patternLength = 0;

				for (char letter : string.toCharArray()) {
					if (letter == one || letter == two) {
						if (letter == lastSeen) {
							continue nextLetter;
						}

						patternLength++;
						lastSeen = letter;
					}
				}

				maxPattern = (patternLength > maxPattern) ? patternLength : maxPattern;

			}
		}

		// System.out.print("Maximum alternating string character size: ");
		System.out.println(maxPattern);

		sc.close();
	}
}
