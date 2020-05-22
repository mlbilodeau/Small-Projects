package practice;

/**
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures?
 * @author monicabilodeau
 *
 */
public class IsUnique {

	public static void main(String[] args) {
		IsUnique m = new IsUnique();
		
		//TEST:
		System.out.println(m.isUnique(""));//true
		System.out.println(m.isUnique("babar")); //false
		System.out.println(m.isUnique("monica")); //true
		System.out.println(m.isUnique("cultpractice")); //false
		System.out.println(m.isUnique("12333jdnaoincq")); //false
	}
	
	public boolean isUnique(String s) {
		
		if(s.length()==0 || s==null) {
			return true;
		}
		
		int check = 0;
		for(int i=0; i<s.length(); i++) {
			if((check & 1<<s.charAt(i)) > 0){
				return false;
			}
			check |= 1<<s.charAt(i);
		}
		return true;
	}
	

}
