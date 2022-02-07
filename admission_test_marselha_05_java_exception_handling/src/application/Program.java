package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	
		Scanner sc = new Scanner(System.in);
    
        try{
        	//System.out.println("Enter 2 numbers: ");
            int x = (sc.nextInt());
            int y = (sc.nextInt());
            System.out.println("Result = "+(x/y));
            
        }catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
            
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        
        sc.close();
        
    }
}