/*
class PaytmPaymentGateway{

PaytmPaymentGateway(){
System.out.println("PaytmPaymentGateway Object Constructed");
}

String tokens = "token1, token2, token3";

double transactionCharge = 0.02; // This will be a commission to Paytm for any transaction on their portal

void pay(int amount, String accessToken) {
if(tokens.contains(accessToken)) {
System.out.println("Payment Transaction Done: \u20b9"+amount);
double commision = amount * transactionCharge;
onSuccess(commision, amount-commision);
}else {
System.out.println("Payment Transaction Not Done");
onFailure(101); // 101 means invalid access token
}
}

// For Paytm, to implement these functions is no sense :)
void onSuccess(double commission, double finalAmount) {
System.out.println("Transaction Was Success");
System.out.println("We will Charge: \u20b9"+commission+" for transaction ");
System.out.println("You will be Given a Final Amount of: \u20b9"+finalAmount);
}

void onFailure(int errorCode) {
System.out.println("Transaction Was Failed");
}

}*/


abstract class PaytmPaymentGateway{

PaytmPaymentGateway(){
System.out.println("PaytmPaymentGateway Object Constructed");
}

String tokens = "token1, token2, token3";

double transactionCharge = 0.02; // This will be a commission to Paytm for any transaction on their portal

void pay(int amount, String accessToken) {
if(tokens.contains(accessToken)) {
System.out.println("Payment Transaction Done: \u20b9"+amount);
double commision = amount * transactionCharge;
onSuccess(commision, amount-commision);
}else {
System.out.println("Payment Transaction Not Done");
onFailure(101); // 101 means invalid access token
}
}

// For Paytm, to implement these functions is no sense :)
// we can mark the functions as abstract -> they will have no definition
// They are kind of rules, made by Paytm Payement gateway that children must define these rules :)
abstract void onSuccess(double commission, double finalAmount);
abstract void onFailure(int errorCode);

}

class ZomatoPaymentsPage extends PaytmPaymentGateway{

ZomatoPaymentsPage(){
System.out.println("ZomatoPaymentsPage Object Constructed");
}

void onSuccess(double commission, double finalAmount) {
System.out.println("Transaction Was Success");
System.out.println("Thank You for Paying \u20b9"+(commission+finalAmount));
System.out.println("Your food is on the Way !!");
}

void onFailure(int errorCode) {
System.out.println("Sorry !! Your Payment wasnt a Success");
System.out.println("Your Order is Confirmed. Please retry your Payment");
}
}

class SwiggyPaymentsPage extends PaytmPaymentGateway{

SwiggyPaymentsPage(){
System.out.println("SwiggyPaymentsPage Object Constructed");
}


void onSuccess(double commission, double finalAmount) {
System.out.println("Transaction Was Success");
System.out.println("Thank You for Paying \u20b9"+(commission+finalAmount));
System.out.println("We are Sending you Your hunger Bite !!");
}

void onFailure(int errorCode) {
System.out.println("Sorry !! Your Payment wasnt a Success");
System.out.println("We will book your order on cash. Please confirm in case !!");
}
}

class OlaPaymentsPage extends PaytmPaymentGateway{
OlaPaymentsPage(){
System.out.println("OlaPaymentsPage Object Constructed");
}


void onSuccess(double commission, double finalAmount) {
System.out.println("Transaction Was Success");
System.out.println("Thank You for Paying \u20b9"+(commission+finalAmount));
System.out.println("Your CAB is on the Way !!");
}

void onFailure(int errorCode) {
System.out.println("Sorry !! Your Payment wasnt a Success");
System.out.println("We cant Book a Cab for you. Please Book it on Cash");
}
}


public class AbstractClass {

public static void main(String[] args) {

PaytmPaymentGateway gateway;

gateway = new ZomatoPaymentsPage();
gateway.pay(1200, "token1");

System.out.println();

gateway = new SwiggyPaymentsPage();
gateway.pay(400, "token12");

System.out.println();

gateway = new OlaPaymentsPage();
gateway.pay(200, "token23");

// abstract class cannot have direct objects :)
// gateway = new PaytmPaymentGateway(); // Direct Object Construction is not a good options
}

}