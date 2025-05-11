package BankManagementSystem2;

public class Customer {
	
	String aadhar , name , email , address , contact , pan , password;
	int accountNumber;
	double balance;
	public Customer(String aadhar, String name, String email, String address, String contact, String pan,
			String password, int accountNumber, double balance) {
		this.aadhar = aadhar;
		this.name = name; 
		this.email = email;
		this.address = address;
		this.contact = contact;
		this.pan = pan;
		this.password = password;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public Customer() {
		
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

// 	@Override
// public String toString() {
//     return "Customer{" +
//             "Name='" + name + '\'' +
//             ", Aadhar='" + aadhar + '\'' +
//             ", Email='" + email + '\'' +
//             ", Address='" + address + '\'' +
//             ", Contact='" + contact + '\'' +
//             ", PAN='" + pan + '\'' +
//             ", Balance=" + balance +
//             '}';
// }
	
	
	
	
	

}
