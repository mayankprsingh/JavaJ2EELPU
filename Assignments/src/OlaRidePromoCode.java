// Assignment: Integrate PromoCoode Coupon Snippet in this program w.r.t. OLA Ride Booking Program :

import java.util.Scanner;

public class OlaRidePromoCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int baseFare = 50;
		int kmCharge = 20;
		
		int distanceTravlled = 27;
		
		int olaMicro = 1;
		int olaMini = 2;
		int olaSedan = 3;
		int olaBike = 4;
		int olaShared = 5;

		int amountToPay = 0;
		
		// VIEW
		System.out.println("=========================");
		System.out.println("Select the Type of Cab:");
		System.out.println("1. OLA MICRO");
		System.out.println("2. OLA MINI");
		System.out.println("3. OLA SEDAN");
		System.out.println("4. OLA BIKE");
		System.out.println("5. OLA SHARED");
		System.out.println("=========================");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Choice:");
		int choice = scanner.nextInt();
		
		/*
		switch(choice) {
		
			case 1:
				baseFare += 10;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				System.out.println("OLA MICRO BOOKED. PLEASE PAY: \u20b9"+amountToPay);
				break;
				
			case 2:
				baseFare += 20;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				System.out.println("OLA MINI BOOKED. PLEASE PAY: \u20b9"+amountToPay);
				break;
			
			case 3:
				baseFare += 50;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				System.out.println("OLA SEDAN BOOKED. PLEASE PAY: \u20b9"+amountToPay);
				break;
				
			case 4:
				baseFare += 5;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				System.out.println("OLA BIKE BOOKED. PLEASE PAY: \u20b9"+amountToPay);
				break;
				
			case 5:
				baseFare += 8;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				System.out.println("OLA SHARED BOOKED. PLEASE PAY: \u20b9"+amountToPay);
				break;
				
			default:
				System.out.println("Please Select Cab to Porceed");
				break;
				
		}
		*/
		
		//Assignment
		
		switch(choice) {
		
		case 1:
			baseFare += 25;
			amountToPay = baseFare + (kmCharge*distanceTravlled);
			break;
			
		case 2:
			baseFare += 50;
			amountToPay = baseFare + (kmCharge*distanceTravlled);
			break;
		
		case 3:
			baseFare += 100;
			amountToPay = baseFare + (kmCharge*distanceTravlled);
			break;
			
		case 4:
			baseFare += 10;
			amountToPay = baseFare + (kmCharge*distanceTravlled);
			break;
			
		case 5:
			baseFare += 15;
			amountToPay = baseFare + (kmCharge*distanceTravlled);
			break;
			
		default:
			System.out.println("Please Select Cab to Porceed");
			break;
			
		}
		
		int FIRSTRIDE = 1;
		int AUGUST15 = 2;
		int COVID19 = 3;
		
		if(amountToPay>=200) {
			System.out.println("Total Amount to Pay \u20b9 "+amountToPay);
			System.out.println("You are eligible for cashbacks");
			System.out.println("Choose a Promo Code");
			System.out.println("1. FIRSTRIDE To get a discount of FLAT 15% on your first ride");
			System.out.println("2. AUGUST15 To get a discount of 25% upto \u20b9 1947");
			System.out.println("3. COVID19 To get a discount of 20% upto \u20b9 300 on rides above \u20b9 630");
			
			int promoCode = scanner.nextInt();
			scanner.close();
			
			if(promoCode == 1) {
				System.out.println("Promo Code FIRSTRIDE applied. You got a discount worth \u20b9 "+(0.15*amountToPay));
				System.out.println("Discounted price \u20b9 "+(amountToPay - 0.15*amountToPay));
			}
			else if(promoCode == 2) {
				System.out.println("Promo Code AUGUST15 applied. You got a discount worth \u20b9 "+(0.25*amountToPay));
				System.out.println("Discounted price \u20b9 "+(amountToPay - 0.25*amountToPay));
			}
			else if(promoCode == 3 && amountToPay >= 630) {
				System.out.println("Promo Code COVID19 applied. You got a discount worth \u20b9 "+(0.20*amountToPay));
				System.out.println("Discounted price \u20b9 "+(amountToPay - 0.20*amountToPay));
			}
			else {
				System.out.println("Invalid Promo Code");
				System.out.println("Proceed To Pay \u20b9 "+ amountToPay);
			}
		}
		else {
			System.out.println("You are not eligible for any cashback");
			System.out.println("Please Pay \u20b9 "+amountToPay);
		}

	}

}
