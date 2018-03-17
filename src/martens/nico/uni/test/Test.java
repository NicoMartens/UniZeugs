package martens.nico.uni.test;

public class Test {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {9,1,8,2,7,3,6,4,5,0};

		
		System.out.print("Unsorted Array with length " + numbers.length + ": \t" );
		for (int i : numbers) {
			System.out.print(i + " ");
		}
		
		int[] result = Sort.insertion(numbers);
		
		System.out.println("\n");
		System.out.print("Sorted Array with length " + result.length + ", sorted by insertion mode: \t");
		for (int i : result) {
			System.out.print(i + " ");
		}
		
		result = Sort.bubble(numbers);
		
		System.out.println("\n");
		System.out.print("Sorted Array with length " + result.length + ", sorted by bubble mode: \t");
		for (int i : result) {
			System.out.print(i + " ");
		}
		
		result = Sort.merge(numbers);
		
		System.out.println("\n");
		System.out.print("Sorted Array with length " + result.length + ", sorted by merge mode: \t");
		for (int i : result) {
			System.out.print(i + " ");
		}
		
		
		System.out.println("\n\n\n");
		int r = DOUBLEandADD.IntegerMultiplication(14, 10);
		
		System.out.println("Result with double and add: " + r);
		
		
		
		
		
	

	}

}
