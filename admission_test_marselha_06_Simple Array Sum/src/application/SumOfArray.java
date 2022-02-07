package application;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Enter the array size: ");
	        int n = sc.nextInt();
	      
	        int[] array = new int[n];
	        for(int i = 0; i < n; i++){
	        	System.out.print("Enter array element " + (i+1) + " = " );
	            array[i] = sc.nextInt();
	        }
	        System.out.println("The sum of the array is :" + sum(array));
	        
	        sc.close();
	    }
	    static int sum(int[] arr){
	        int sum = 0;
	        for (int a = 0; a < arr.length; a++){
	            sum = sum + arr[a];
	        }
	        return sum;
	    }

}
