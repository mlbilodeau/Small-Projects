package practice;

public class URLify {

	public static void main(String[] args) {
		URLify m = new URLify();
		System.out.println(m.test("Mr John Smith    "));
		System.out.println(m.test("monica bilodeau eats food      "));
		System.out.println(m.test("let's eat some grub      "));
		System.out.println(m.test("corners are for chumps      "));
		System.out.println(m.test("moms are cool    "));
	}
	
	
	public String url(char[] s) {
		
		int i = s.length-1;
		int j = i;
		while(s[j]==' ') {
			j--;
		}
		
		while(j>=0) {
			if(s[j] == ' ') {
				//insert %20 in reverse
				s[i--] = '0';
				s[i--] = '2';
				s[i--] = '%';
			}
			else {
				s[i--] = s[j];
			}
			j--;
		}
		
		return String.valueOf(s);
	}
	
	
	public String test(String s) {
		char[] s_arr = s.toCharArray();
		return url(s_arr);
	}
}
