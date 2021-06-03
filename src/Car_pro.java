import java.util.Scanner;

public class Car_pro {

	public static void main(String[] args) {

		int choice;
		int A, L, D, Q;
		Scanner input = new Scanner(System.in);
		while (true) {
			// Take inputs
			System.out.println("Enter A for ADD.");
			System.out.println("Enter L for LIST.");
			System.out.println("Enter D for Delete.");
			System.out.println("Enter Q for Quit.");

			String s = input.next();
			choice = s.charAt(0);

			if (choice == 'Q') {
				System.out.println("you ente the quit option THnakYOu");
				break;
			}

			switch (choice) {
			case 'A':
				// System.out.println("Enter MAke:");
				// A = (int) input.next();
				//
				// String str = input.nextLine();
				//
				// System.out.println("Enter model:");
				// A = (int) input.nextFloat();
				//
				// System.out.println("Enter year:");
				// A = (int) input.nextInt();
				//
				// System.out.println("Enter saleprice:");
				// A = (int) input.nextInt();
				//
				// System.out.println("Insert complete----checkDB");
				System.out.println("add details");

				break;

			case 'L':
				System.out.println("Listed add details");
				break;

			case 'D':
				System.out.println("Delete the deatils added");
				break;

			case 'Q':
				System.out.println("Quit from application");
				break;

			default:
				System.out.println("enter proper command");
			}
		}
	}
}
