package martens.nico.uni.test;

import java.util.Iterator;

public class Sort {
	
	/**
	 * sort integer array with insertion mode
	 * 
	 * @param unsorted int array
	 * @return sorted int array
	 */
	public static int[] insertion(int[] in){
		
		int[] out = new int[in.length];
		
		out[0] = in[0];
		
		for (int i = 1; i < in.length; i++) {
			
			int currentNumber = in[i];
			int j = i;
		
			while (j > 0 && out[j-1] > currentNumber) {
				out[j] = out[j-1];
				j--;
			}
			
			out[j] = currentNumber;
		}
		
		return out;
	}
	
	/**
	 * sort integer array with bubble mode
	 * 
	 * @param unsorted int array
	 * @return sorted int array
	 */
	public static int[] bubble(int[] in) {
		
		int[] out = new int[in.length];
		
		for (int i = 0; i < out.length; i++) {
			out[i] = in[i];
		}

		for (int i = out.length-1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if(out[j] > out[j+1]) {
					int temp = out[j];
					out[j] = out[j+1];
					out[j+1] = temp;
				}
			}
		}
		
		return out;
	}
	
	
	public static int[] merge(int[] in) {
		
		if(in.length == 1 ) { 
			return in;
		}
		
		int[] lo = cut(in, 0, (in.length/2)-1);
		int[] hi = cut(in, in.length/2, in.length-1);
		
//		System.out.print("Divided array: ");
		
//		for (int i : lo) {
//			System.out.print(i + " ");
//		}
	
//		System.out.print("    |    ");
		
//		for (int i : hi) {
//			System.out.print(i + " ");
//		}
		
//		System.out.println();
		
		lo = merge(lo);
		hi = merge(hi);
		
		
		int[] out = new int[lo.length  + hi.length];
		
		int index_lo = 0;
		int index_hi = 0;
		int index_out = 0;
		
		while (index_lo < lo.length && index_hi < hi.length) {
			
			if(lo[index_lo] < hi[index_hi]) {
				out[index_out] = lo[index_lo];
				index_lo++;
			}
			else {
				out[index_out] = hi[index_hi];
				index_hi++;
			}
			
			index_out++;
			
		}
		
		while (index_lo < lo.length) {
			
			out[index_out] = lo[index_lo];
			index_lo++;
			index_out++;
			
		}
		
		while (index_hi < hi.length) {
			
			out[index_out] = hi[index_hi];
			index_hi++;
			index_out++;
			
		}
		
//		System.out.println();
//		System.out.print("Merged array: ");
//		for (int i : out) {
//			System.out.print(i + " ");
//		}
		
//		System.out.println();

		return out;
	}
	
	
	/**
	 * help method
	 * @param in
	 * @param from
	 * @param to
	 * @return
	 */
	private static int[] cut(int[] in, int from, int to){
		
		int[] out = new int[to-from+1];
		
		for (int i = 0; i < out.length; i++) {
			out[i] = in[i + from];
		}
		
		return out;
	}

}
