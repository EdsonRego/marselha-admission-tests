package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Make the list into a string: ");
		int N = sc.nextInt();

		List<Integer> L = new ArrayList<Integer>(N);

		for (int i = 0; i < N; i++) {
			System.out.print("Enter the element " + i + ": ");
			L.add(sc.nextInt());
			
		}

		//System.out.print("Define the queries quantity:");
		int Q = sc.nextInt();
		//System.out.println("Queries: " + Integer.toString(Q));

		for (int i = 0; i < Q; i++) {
			String operation = sc.next();
			//System.out.println("Current operation is: " + operation);

			if (operation.equals("Insert")) {
				//System.out.print("Enter index: ");
				int index = sc.nextInt();
				//System.out.print("Enter value: ");
				int value = sc.nextInt();
				//System.out.println("Inserting element: " + Integer.toString(value) + " intoindex: " + Integer.toString(index));
				L.add(index, value);
			}

			else if (operation.equals("Delete")) {
				int index = sc.nextInt();
				//System.out.println("Removing element at index: " + Integer.toString(index));
				L.remove(index);
			}
		}

		for (int element : L)

		{
			System.out.print(element + " ");
		}

		sc.close();
	}

}
