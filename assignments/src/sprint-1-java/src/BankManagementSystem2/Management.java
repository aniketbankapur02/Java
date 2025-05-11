package BankManagementSystem2;

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

		System.out.println("Enter aadhar number (alphanumeric):");
		String aadhar = sc.nextLine();
		if (!aadhar.matches("[a-zA-Z0-9]+")) {
			System.out.println("Invalid Aadhar (should be alphanumeric)");
			return;
		}

		System.out.println("Enter name (max 50 characters): ");
		String name = sc.nextLine();
		if (name.length() > 50) {
			System.out.println("Name too long");
			return;
		}

		System.out.println("Enter email: ");
		String email = sc.nextLine();

		System.out.println("Enter address (max 100 characters): ");
		String address = sc.nextLine();
		if (address.length() > 100) {
			System.out.println("Address too long");
			return;
		}

		System.out.println("Enter contact number (10 digits): ");
		String contact = sc.nextLine();
		if (!contact.matches("\\d{10}")) {
			System.out.println("Invalid contact number");
			return;
		}

		System.out.println("Enter PAN (max 10 characters): ");
		String pan = sc.nextLine();
		if (pan.length() > 10) {
			System.out.println("PAN too long");
			return;
		}

		System.out.println("Enter deposit amount (>500 rupees): ");
		double deposit = sc.nextDouble();
		sc.nextLine();
		if (deposit < 500) {
			System.out.println("Minimum deposit should be > 500");
			return;
		}

		System.out.println("Enter password (min 8 chars, 1 upper, 1 lower, 1 special char): ");
		String password = sc.nextLine();
		if (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\W).{8,}$")) {
			System.out.println("Password does not meet criteria");
			return;
		}

		System.out.println("Confirm password: ");
		String pass2 = sc.nextLine();
		if (!password.equals(pass2)) {
			System.out.println("Passwords do not match");
			return;
		}

		int accountNo = new Random().nextInt(9000) + 1000;

		Customer c = new Customer(aadhar, name, email, address, contact, pan, password, accountNo, deposit);
		customers.add(c);

		System.out.println("Account is created successfully! Your account number is: " + accountNo);
	}

	/////// view accounts
	public static void viewAccount() {
		System.out.println("1. View a single customer\n2. View all customers");
		int choice = sc.nextInt();
		sc.nextLine();

		if (choice == 1) {
			System.out.print("Enter Account Number: ");
			int accNo = sc.nextInt();
			sc.nextLine();

			Customer found = null;
			for (Customer c : customers) {
				if (c.getAccountNumber() == accNo) {
					found = c;
					break;
				}
			}

			if (found != null) {
				displayCustomer(found);
			} else {
				System.out.println("Customer not found.");
			}
		} else if (choice == 2) {
			if (customers.isEmpty()) {
				System.out.println("No customers found.");
			} else {
				for (Customer c : customers) {
					displayCustomer(c);
					System.out.println("----------------------------");
				}
			}
		} else {
			System.out.println("Invalid choice.");
		}
	}

	private static void displayCustomer(Customer c) {
		System.out.println("Account No: " + c.getAccountNumber());
		System.out.println("Name: " + c.name);
		System.out.println("Email: " + c.email);
		System.out.println("Address: " + c.address);
		System.out.println("Contact Number: " + c.contact);
		System.out.println("PAN: " + c.pan);
		System.out.println("Balance: ₹" + c.getBalance());
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

				System.out.print("Enter new Address: ");
				String address = sc.nextLine();
				c.setAddress(address);

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
		Customer cust = null;

		// Find customer by account number
		for (Customer c : customers) {
			if (c.getAccountNumber() == accno) {
				cust = c;
				break;
			}
		}
		if (cust == null) {
			System.out.println("Customer not found!");
			return;
		}

		while (true) {
			System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Logout");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
				case 1:
					System.out.print("Enter deposit amount: ");
					int dep = sc.nextInt();
					sc.nextLine();
					if (dep > 0) {
						cust.balance += dep;
						System.out.println("Deposit successful. Your balance is ₹" + cust.getBalance());
					} else {
						System.out.println("Deposit amount must be positive.");
					}

					break;

				case 2:
					System.out.print("Enter withdrawal amount: ");
					int draw = sc.nextInt();
					sc.nextLine();
					if (draw <= cust.getBalance() - 500) {
						cust.balance -= draw;
						System.out.println("Withdrawal successful. Your balance is ₹" + cust.getBalance());
					} else {
						System.out.println("Insufficient balance. Your balance is ₹" + cust.getBalance());
					}
					break;

				case 3:
					System.out.println("Your balance is ₹" + cust.getBalance());
					break;

				case 4:
					System.out.println("Logged out.");
					return;

				default:
					System.out.println("Invalid choice.");
			}
		}
	}

}
