package services;

import java.util.Scanner;

public class MyCalculator implements AdvancedArithmetic {

	@Override
	public Integer divisorSum(Integer n) {
		Scanner sc = new Scanner(System.in);

		//System.out.print("Tape a number: ");
		n = sc.nextInt();
		
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.printf("%d ", i);
				sum+=i;
			}
		}

		sc.close();
		return sum;
	}
}
