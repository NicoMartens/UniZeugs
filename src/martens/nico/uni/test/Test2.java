package martens.nico.uni.test;

public class Test2 {

	public static void main(String[] args) {
		
		int m = 19;
		
		int result = 0;
		
		for (int i = 1; i < (m); i++) {
			result = result + (i-1);
			System.out.println("result: " + result);
		}
		
		System.out.println("final result: " + result);
		
		
		
		int result2 = 0;
		
		for (int i = 1; i < (m); i++) {
			result2 = result2 + (i-(m-1));
			System.out.println("result2: " + result2);
		}
		
		System.out.println("final result2: " + result2);
		
		System.out.println("(m-1)(m-2)/2 = " + (m-1)*(m-2)/2);
		
		int[] x = new int[] {0,1,2,3,4,5,6,7,8,9};
		int[] y = new int[] {0,1,2,3,4};
		
		x = y;
		
		for (int i : y) {
			System.out.print(i);
		}
		
		System.out.println("\n\n\n");
		
		int number = 45;
		
		String s = Integer.toBinaryString(number);
		System.out.println(s);
		

	}

}
