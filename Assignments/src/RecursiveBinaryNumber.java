// Assignment: Implement Recursive Function to Code binary representation of a number
	//			   Also draw its memory execution stack :)

public class RecursiveBinaryNumber {
	
	static int BinaryNumber(int num) {
		
		if(num>0) {
			return (num%2+10*BinaryNumber(num/2));
		}
		else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number  = 129;
		int binaryNumber = RecursiveBinaryNumber.BinaryNumber(number);
		System.out.println("Binary Representation for the given number: "+binaryNumber);
		

	}

}
