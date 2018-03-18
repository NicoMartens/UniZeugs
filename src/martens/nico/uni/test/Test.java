package martens.nico.uni.test;

public class Test {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {9,1,8,2,7,3,6,4,5,0};

		//print unsorted numbers		
		System.out.print("Unsorted Array with length " + numbers.length + ": \t" );
		for (int i : numbers) {
			System.out.print(i + " ");
		}
		
		//sort numbers by insertion mode
		int[] result = Sort.insertion(numbers);
		
		//print sorted numbers
		System.out.println("\n");
		System.out.print("Sorted Array with length " + result.length + ", sorted by insertion mode: \t");
		for (int i : result) {
			System.out.print(i + " ");
		}
		
		//sort numbers by bubble mode
		result = Sort.bubble(numbers);
		
		//print sorted numbers
		System.out.println("\n");
		System.out.print("Sorted Array with length " + result.length + ", sorted by bubble mode: \t");
		for (int i : result) {
			System.out.print(i + " ");
		}
		
		//sort numbers by merge mode
		result = Sort.merge(numbers);
		
		//pint sorted numbers
		System.out.println("\n");
		System.out.print("Sorted Array with length " + result.length + ", sorted by merge mode: \t");
		for (int i : result) {
			System.out.print(i + " ");
		}
		
		
		
		
		
		//------------------------------------------------------------------
		System.out.println("\n\n\n");
		//------------------------------------------------------------------
		
		
		
		
		
		//integer multiplication by double and add
		int r = DOUBLEandADD.IntegerMultiplication(14, 10);
		
		//print result by double and add
		System.out.println("Result with double and add: " + r);
		
		
		
		
		//---------------------------------------------------------------
		System.out.println("\n\n\n");
		//---------------------------------------------------------------
		
		
		
		
		//compute gcd by euclidean algorithm
		int modulus = 14;
		int element = 19;
				
		int gcd = EA.gcd(element,modulus);
		
		//print gcd
		System.out.println("The greates common divisor from " + modulus + " und " + element + " ist: " + gcd);
		
	
		
		//---------------------------------------------------------------
		System.out.println("\n\n\n");
		//---------------------------------------------------------------
		
		
		
		
		

	}

}
