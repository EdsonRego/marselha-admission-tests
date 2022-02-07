package Application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Do_Not_Terminate.forbidExit();

		try {

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			FoodFactory foodFactory = new FoodFactory();

			System.out.print("Choose cake or pizza: ");
			Food food = foodFactory.getFood(sc.nextLine().toLowerCase());

			System.out.println("The factory returned " + food.getClass().getName());
			System.out.println(food.getType());
			
			sc.close();
			
		} catch (Do_Not_Terminate.ExitTrappedException e) {
			
			System.out.println("Unsuccessful Termination!!");
			
		}

	}

}
