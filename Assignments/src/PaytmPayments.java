//Assignment: Implement payment section in paytm app with inheritance
import java.util.Scanner;
class Payment{
	String customer;
	String date;
	double amountToPay;
	int paymentMethod;
	
	Payment() {
	}
	
	Payment(String customer, double amountToPay) {
		this.customer = customer;
		this.amountToPay = amountToPay;
	}
	
	void showPayDetails() {
		System.out.println("---AURIBISES---");
		System.out.println("Payment Details");
		System.out.println("---------------");
		System.out.println("Payment to be made by: "+customer);
		System.out.println("Amount to be paid: \u20b9 "+amountToPay);
	}
	Scanner scanner = new Scanner(System.in);
	void choosePaymentMethod() {
		System.out.println("Choose a payment method: ");
		System.out.println("1. Wallet");
		System.out.println("2. UPI");
		paymentMethod = scanner.nextInt();
	}
}

class Wallet extends Payment{
	double walletBalance;
	double updatedWalletBalance;
	
	Wallet() {
	}
	
	Wallet(String customer,double amountToPay,double walletBalance) {
		super(customer,amountToPay);
		this.walletBalance = walletBalance;
	}

	void showWalletDetails() {
		System.out.println("Current wallet balance: \u20b9 "+walletBalance);
		System.out.println("Proceed to pay: \u20b9 "+amountToPay);
		String pay = scanner.nextLine();
	}
	
	boolean checkBalance() {
		if(amountToPay<=walletBalance) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void paymentSuccess() {
		System.out.println("PAYMENT SUCCESSFULL");
		System.out.println("Amout of \u20b9 "+amountToPay+" deducted from your paytm wallet");
		System.out.println("Updated wallet balance: \u20b9 "+(walletBalance-amountToPay));
	}
}

class UPI extends Payment{
	double accountBalance;
	double updatedaccountBalance;
	
	UPI() {
	}
	
	UPI(String customer,double amountToPay,double accountBalance) {
		super(customer,amountToPay);
		this.accountBalance = accountBalance ;
	}

	void showUPIDetails() {
		System.out.println("Current account balance: \u20b9 "+accountBalance);
		System.out.println("Proceed to pay: \u20b9 "+amountToPay);
		String pay = scanner.nextLine();
	}
	
	boolean checkBalance() {
		if(amountToPay<=accountBalance) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void paymentSuccess() {
		System.out.println("PAYMENT SUCCESSFULL");
		System.out.println("Amout of \u20b9 "+amountToPay+" deducted from your paytm wallet");
		System.out.println("Updated wallet balance: \u20b9 "+(accountBalance-amountToPay));
	}
}

public class PaytmPayments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment opRef = new Payment("Mayank Pratap Singh",967.53);
		Wallet owRef = new Wallet("Mayank Pratap Singh",967.53,2222.22);
		UPI ouRef = new UPI("Mayank Pratap Singh",967.53,6857.391);
		
		opRef.showPayDetails();
		opRef.choosePaymentMethod();
		
		if(opRef.paymentMethod == 1) {
			System.out.println("Paying via Wallet");
			owRef.showWalletDetails();
			if(owRef.checkBalance()==true) {
				owRef.paymentSuccess();
			}
			else {
				System.out.println("Insufficient Balance!");
			}
		}
		else if(opRef.paymentMethod == 2) {
			System.out.println("Paying via UPI");
			ouRef.showUPIDetails();
			if(ouRef.checkBalance()==true) {
				ouRef.paymentSuccess();
			}
			else {
				System.out.println("Insufficient Balance!");
			}
		}
		else {
			System.out.println("Please choose a valid method");
		}

	}

}
