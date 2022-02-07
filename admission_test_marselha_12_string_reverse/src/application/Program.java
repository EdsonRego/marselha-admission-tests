package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(str.equals(reversed) ? "Yes" : "No");

	}

}
