// Assignment: Write insertionSort method to sort the elements of array :)

public class InsertionSort {
	
	void InsertionSortMethods1(int[] array) {
		
		for(int i = 1; i<array.length; i++) {
			int temp = array[i];
			int j = i-1;
			for(; j>=0 && array[j]>temp; j--) {
				array[j+1] = array[j];
			}
			array[j+1] = temp;
		}
		
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	static void InsertionSortMethods2(int[] array) {
		
		for(int i = 1; i<array.length; i++) {
			int temp = array[i];
			int j = i-1;
			for(; j>=0 && array[j]>temp; j--) {
				array[j+1] = array[j];
			}
			array[j+1] = temp;
		}
		
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {8,2,4,9,3,6};
		int[] arr2 = {1,7,2,9,4,5,2,8,3};
		
		InsertionSort obj = new InsertionSort();
		
		obj.InsertionSortMethods1(arr1);
		System.out.println();
		InsertionSort.InsertionSortMethods2(arr2);

	}

}
