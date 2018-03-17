package martens.nico.uni.test;

public class DOUBLEandADD {

	
	public static int IntegerMultiplication(int scalar, int groupelement) {
		
		int doubles = 0;
		int adds = 0;
		
		if(scalar == 0)
			return 0;
		
		String binary_scalar = Integer.toBinaryString(scalar);
		System.out.println("Scalar Binary Representation: " + binary_scalar);
		int result = groupelement;
		
		for (int i = 1; i < binary_scalar.length(); i++) {
			
			result = result*2;
			doubles++;
			
			if(binary_scalar.charAt(i) == '1') {
				result = result + groupelement;
				adds++;
			}
		}
		
		System.out.println("Doubles: " + doubles + "\n" + "adds: " + adds);
		
		return result;
	}
}
