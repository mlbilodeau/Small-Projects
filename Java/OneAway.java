package practice;


public class OneAway{
	
	public static void main(String[] args) {
		OneAway m = new OneAway();
		System.out.println(m.oneAway("pale", "ple"));
		System.out.println(m.oneAway("pales", "pale"));
		System.out.println(m.oneAway("pale", "bale"));
		System.out.println(m.oneAway("pale", "bae"));
	}

	public boolean oneAway(String a, String b) {
		if(a==b) return true;
		
		//check for deletion
		if(a.length() > b.length()) {
			return isDelete(a, b);
		}else if(a.length() < b.length()) {
			return isDelete(b, a);
		} else { // the lengths are equal.
			return isReplace(a,b);
		}
	}
	
	public boolean isDelete(String s1, String s2) {
		for(int i=0; i<s1.length(); i++) {
			StringBuilder sb = new StringBuilder(s1);
			sb.deleteCharAt(i);
			if(sb.toString().equals(s2)){
				return true;
			}
		}
		return false;	
	}
	public boolean isReplace(String s1, String s2) {
		boolean found=false;
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				if(found) {
					return false;
				}
				found=true;
			}
		}
		return found;
		
	}
}