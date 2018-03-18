package martens.nico.uni.test;

public class EA {
	
	public static int gcd(int element, int modulus) {
		int a = element;
		int b = modulus;
		int r = a % b;
		System.out.println("e\tmod\tr");
		System.out.println(a + "\t" + b + "\t" + r);
				
		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
			System.out.println(a + "\t" + b + "\t" + r);
		}
		
		return b;
	}

}
