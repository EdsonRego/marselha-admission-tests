package application;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Map<String, String> phoneBook = new TreeMap<>();

		//System.out.println("============ The Phone Book =============");

		//System.out.print("Tape the phone quantity: ");
		Integer N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			//System.out.print("Tape the phone name: ");
			String x = sc.nextLine();
			String phoneName = sc.nextLine();
			
			//System.out.print("Tape the phone number: ");
			String phoneNumber = sc.next();
			
			if (valPhoneName(phoneName) && valPhoneNumber(phoneNumber)) {
				phoneBook.put(phoneName, phoneNumber);
			} else {
				System.out.println("Invalid");
				System.exit(0);
			}
		}
		
		//System.out.println("============ Complete Phone Book Names =============");	
		for (Map.Entry<String, String> m : phoneBook.entrySet()) {
			System.out.println(m.getKey());
			}

		System.out.println();
		//System.out.print("Tape a person fone name: ");
		String x = sc.nextLine();
		String name = sc.nextLine().toLowerCase();
		System.out.println(name);

		if (phoneBook.containsKey(name)) {
			
		//System.out.println("============ Complete Phone Book =============");

			for (Map.Entry<String, String> m : phoneBook.entrySet()) {
				System.out.println(m.getKey()+"="+m.getValue());
				}
			
		} else 	{
			
			System.out.println("Null");
		}

		sc.close();

	}
	
	public static boolean valPhoneName(String pname) {
		return pname.matches("[a-z ]+");
	}

	public static boolean valPhoneNumber(String pnumber) {
		return pnumber.charAt(0) != '0' && pnumber.length() == 8 && pnumber.matches("[0-9]+");
	}
}
