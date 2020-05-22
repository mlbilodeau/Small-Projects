package practice;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * I palindrome is a word or phrase that is the same forwards and backwards. 
 * A permutation is a rearrangement  of letters. The palindrome does not need to 
 * be limited to just dictionary words.
 * 
 * @author monicabilodeau
 *
 */
public class PalindromePermutation {
	public static void main(String[] args) {
		PalindromePermutation m = new PalindromePermutation();
		System.out.println(m.palPerm("tact coa"));
		System.out.println(m.palPerm("tacst coa"));
	}
	
	public boolean palPerm(String s) {
		int[] alpha = new int[128];
		int oddFound=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				alpha[s.charAt(i)]++;
				if(alpha[s.charAt(i)]%2!=0) {
					oddFound++;
				} 
				else {
					oddFound--;
				}
			}
			
		}
		return oddFound<=1;
	}
	

}
