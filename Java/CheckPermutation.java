package practice;
/**
 * Given two strings, write a method to decide if one is a permutation of the other.
 * @author monicabilodeau
 *
 */
public class CheckPermutation {

	public static void main(String[] args) {
		CheckPermutation m = new CheckPermutation();
		System.out.println(m.isPermutation("rugrats", "trruasg")); //true
		System.out.println(m.isPermutation("rugrats", "trrduasg")); //false
		System.out.println(m.isPermutation("rugs", "rugd")); //false
		System.out.println(m.isPermutation("hiwuheafjhawkjefhiwuheafjhawkjefhiwuheafjhawkjefhiwuheafjhawkjefhiwuheafjhawkjef", "hiwuheafjhawkjefhiweuheawkjedfhiwuheafjhawkjefhkiwuheafjhawkjefhaiwuheafjhawkjef")); // false (pretty sure)
		System.out.println(m.isPermutation("","")); //true
		System.out.println(m.isPermutation("asaa","saaa")); //true
		
	}
	
	public boolean isPermutation(String s1, String s2) {
		if(s1.length()!= s2.length()) return false;
		
		int x=0;
		for(int i=0; i<s1.length(); i++) {
			x^=s1.charAt(i);
			x^=s2.charAt(i);
		}
		return x==0;
	}
}
