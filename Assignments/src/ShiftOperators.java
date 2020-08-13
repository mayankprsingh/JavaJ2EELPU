
public class ShiftOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//(>>) signed right shift operator
		// (>>>)unsigned right shift operator
		//The operator ‘>>’ uses the sign bit (left most bit)
		//to fill the trailing positions after shift
						
		int i = -16,j=-8,k=-16,m=16;
		long n = -32;
						
		System.out.println(i>>-4);     //1 is used as a filler
		System.out.println(j>>-31);    // 32 bits , 32-31=1, >>1	
		System.out.println(n>>-61);    // 64 bits , 64-61=3, >>3
		System.out.println(m>>>-4);
		System.out.println(k>>>-4);    //fills 0 irrespective of the sign of the number
		System.out.println(m>>>-4);
		System.out.println(k>>>-29);    
		System.out.println(m>>>-29);

	}

}
