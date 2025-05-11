package BankManagementSystem;

import java.util.*;

public class Management {

	public static Scanner sc = new Scanner(System.in);

	public static ArrayList<Customer> customers = new ArrayList<>();
	public static int accountCounter = 1001;

	public static void main(String[] args) {

		while (true) {
			System.out.println("1.admin Login \n 2.Customer Login \n 3.Exit");
			int role = sc.nextInt();
			sc.nextLine();

			if (role == 1) {
				if (adminLogin()) {
					adminMenu();
				}
			} else if (role == 2) {
				customerLogin();

			} else if (role == 3) {
				break;
			} else {
				System.out.println("invalid input re try");
			}

		}

		/// ArrayList containing data of customers

	}

	/// admin login
	public static boolean adminLogin() {
		System.out.println("Enter admin user id : ");
		String user = sc.nextLine();
		System.out.println("Enter admin password : ");
		String pass = sc.nextLine();

		if (user.equals("admin1") && pass.equals("admin@123")) {
			return true;
		} else {
			System.out.println("invalid credentials !!  ");
			return false;
		}

	}

	/// admin menu
	public static void adminMenu() {
		boolean exit = true;
		while (exit) {
			System.out.println("--------- Admin Menu ---------- ");
			System.out.println("1. Create Account ");
			System.out.println(" 2. View Accounts  ");
			System.out.println("3. Update Account ");
			System.out.println(" 4. Delete Account  ");
			System.out.println(" 5> Logout  ");

			System.out.println(" Enter your choice :  ");

			int choice = sc.nextInt();

			switch (choice) {

				case 1:
					createAccount();
					break;

				case 2:
					viewAccount();
					break;

				case 3:
					updateAccount();
					break;

				case 4:
					deleteAccount();
					break;

				case 5:
					System.out.println("Logged out");
					exit = false;
					break;

				default:
					System.out.println("Invalid option");

			}

		}

	}

	///// create account
	public static void createAccount() {
		sc.nextLine();
		System.out.println("Enter aadhar number :");
		String aadhar = sc.nextLine();

		System.out.println("Enter name : ");
		String name = sc.nextLine();

		System.out.println("Enter email  : ");
		String email = sc.nextLine();

		System.out.println("Enter address : ");
		String address = sc.nextLine();

		System.out.println("Enter contact : ");
		String contact = sc.nextLine();

		System.out.println("Enter pan : ");
		String pan = sc.nextLine();

		System.out.println("Enter deposit amount (>500 rupees )  : ");
		double deposit = sc.nextDouble();
		sc.nextLine();
		if (deposit < 500) {
			System.out.println("minimum should be > 500  ");
			return;
		}
		System.out.println("Enter password  : ");
		String password = sc.nextLine();

		// System.out.println("Set password : ");
		// String pass1 = sc.nextLine();
		System.out.println("Comfirm  password :  ");
		String pass2 = sc.nextLine();
		if (!password.equals(pass2)) {
			System.out.println("password does not match !!!!  ");
			return;
		}

		Customer c = new Customer(aadhar, name, email, address, contact, pan, password, accountCounter++, deposit);

		customers.add(c);

		System.out.println("Account created successfully !! your account number is : " + (accountCounter - 1));

	}

	/////// view accounts
	public static void viewAccount() {
		if (customers.isEmpty()) {
			System.out.println(" No Customers !!");
		} else {
			for (Customer c : customers) {
				System.out.println(c);
			}
		}

	}

	//// update account

	public static void updateAccount() {
		System.out.println(" Enter account number : ");
		int accno = sc.nextInt();
		sc.nextLine();
		for (Customer c : customers) {
			if (c.getAccountNumber() == accno) {
				System.out.println(" Enter new email :  ");
				String nemail = sc.nextLine();
				c.setEmail(nemail);

				System.out.println(" Enter contact number :   ");
				String ncontact = sc.nextLine();
				c.setContact(ncontact);

				System.out.println(" details updated successfully    ");
				return;
			}
		}
		System.out.println("Account not found ");
	}

	///// delete account
	public static void deleteAccount() {
		System.out.println(" Enter account number :  ");
		int account = sc.nextInt();
		sc.nextLine();

		System.out.println("enter pasword : ");
		String pass = sc.nextLine();

		Customer toRemove = null;
		for (Customer c : customers) {
			if (c.accountNumber == account && c.getPassword().equals(pass)) {
				toRemove = c;
				break;
			}
		}

		if (toRemove != null) {
			customers.remove(toRemove);
			System.out.println(" account deleted  ");
		} else {
			System.out.println(" account not found ");
		}

	}

	////////// customer login

	private static void customerLogin() {

		System.out.println(" Enter account number : ");
		int accno = sc.nextInt();
		sc.nextLine();

		System.out.println(" Enter pass : ");
		String pass = sc.nextLine();

		for (Customer c : customers) {
			if (c.getAccountNumber() == accno && c.getPassword().equals(pass)) {
				System.out.println(" login successful ");
				customerMenu(accno);
				return;
			}
		}
		System.out.println(" wrong credentials  ");
	}

	public static void customerMenu(int accno) {
		while (true) {
			System.out.println("\n1.Deposit\n2. Withdraw\n3. Check Balance\n4. logout");

			int choice = sc.nextInt();
			sc.nextLine();

			Customer cust = customers.get(accno - 1001);

			switch (choice) {
				case 1:
					System.out.println(" Enter deposit amount:   ");
					int dep = sc.nextInt();
					sc.nextLine();

					cust.balance += dep;
					System.out.println(" deposit successful  your balance is  " + cust.getBalance());
					break;

				case 2:
					System.out.println(" Enter withdraw  amount:   ");
					int draw = sc.nextInt();
					sc.nextLine();
					if (draw <= cust.getBalance()) {
						cust.balance -= draw;
						System.out.println(" withdraw successful  your balance is  " + cust.getBalance());
					} else {
						System.out.println("insufficient balance   " + cust.getBalance());
					}
					break;

				case 3:
					System.out.println("   your balance is  " + cust.getBalance());
					break;
				case 4:
					System.out.println(" logged out ");
					return;

				default:
					System.out.println(" invalid  ");

			}
		}

	}

}
