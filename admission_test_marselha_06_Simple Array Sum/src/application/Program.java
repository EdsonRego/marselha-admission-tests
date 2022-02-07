package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String path = "c:\\EdsonRego\\tests\\out.txt";

		//System.out.print("Enter the array size: ");
		int arCount = Integer.parseInt(sc.nextLine().trim());
		int[] N = new int[arCount];

		//System.out.print("Enter space-separated integers array's elements.: ");
		String[] S = sc.nextLine().split(" ");

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path));) {

			for (int i = 0; i < arCount; i++) {
				int arItem = Integer.parseInt(S[i].trim());
				N[i] = arItem;

			}

			int result = simpleArraySum(N);
			bw.write(String.valueOf(result));
			bw.newLine();
			System.out.println(result);

		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();

	}

	static int simpleArraySum(int[] ar) {
		return Arrays.stream(ar).sum();
	}

}
