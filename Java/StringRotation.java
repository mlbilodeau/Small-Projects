package practice;

public class StringRotation {

	public static void main(String[] args) {
		StringRotation sr = new StringRotation();
		System.out.println(sr.isRotation("waterbottle", "erbottlewat")); //true
		System.out.println(sr.isRotation("waterbottle", "bottlewetar")); //false
		System.out.println(sr.isRotation("mlb", "blm")); //false
		System.out.println(sr.isRotation("mlb", "lbm")); //true
		System.out.println(sr.isRotation("mooooooo", "ooomoooo")); //false
	}
	
	public boolean isRotation(String s1, String s2) {
		if(s1==s2) {
			return true;
		} else if(s1.length() == s2.length() && s1.length()>0) {
			String s1s1 = s1.concat(s1);
			return s1s1.contains(s2);
		}
		return false;
	}
}
