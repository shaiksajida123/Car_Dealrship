import java.util.Scanner;
import java.sql.*;
import java.util.Properties;

public class Car_pro {

	public static void main(String[] args) throws SQLException  {

		try {
			// Class.forName("org.apache.derby.jdbc.ClientDriver");
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found " + e);
		}
		String url = "jdbc:mysql://localhost:3306/car_data";
		String user = "root";
		String password = "Sajida@123";

		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet rs = null;
		// stmt = con.createStatement();

		int choice;
		Scanner input = new Scanner(System.in);
		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection(url, user, password);
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
					System.out.println("Enter MAke:");
					String make = input.next();

					System.out.println("Enter model:");
					String model = input.next();

					System.out.println("Enter year:");
					int year = input.nextInt();

					System.out.println("Enter saleprice:");
					int salesprice = input.nextInt();

					System.out.println("Insert complete----checkDB");
					// System.out.println("add details");

					// 2. Create a statement
					String sql = "insert into car_Deal " + " (make,model,year,salesprice)" + " values (?, ?, ?, ?)";
					myStmt = myConn.prepareStatement(sql);

					// set param values
					myStmt.setString(1, make);
					myStmt.setString(2, model);
					myStmt.setInt(3, year);
					myStmt.setInt(4, salesprice);

					// 3. Execute SQL query
					myStmt.executeUpdate();

					// System.out.println("Insert complete.");

					break;

				case 'L':
					rs = myStmt.executeQuery("SELECT * FROM car_deal");
					System.out.println("make  model	year	salesprice");
					while (rs.next()) {
						make = rs.getString("make");
						model = rs.getString("model");
						year = rs.getInt("year");
						salesprice = rs.getInt("salesprice");
						System.out.println(make + "   " + model + "    " + year + "	" + salesprice);
					}
					System.out.println("Listed add details");
					break;

				case 'D':
					System.out.println("enter the make field which you want to del::");
					String makedel = input.next();
					sql = "delete from car_deal where make =  ? " ;	
					myStmt = myConn.prepareStatement(sql);
					myStmt.setString(1,makedel);
					myStmt.executeUpdate();
					System.out.println("Delete Done check the table ");
					break;

				case 'Q':
					System.out.println("Quit from application");
					break;

				default:
					System.out.println("enter proper command");
				}
			}
		} catch (SQLException e) {
			System.out.println("SQL exception occured" + e);
		} finally {

			myStmt.close();
			myConn.close();
			
		}
	}

}
