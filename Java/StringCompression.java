package practice;

public class StringCompression {

	public static void main(String[] args) {
		StringCompression sc = new StringCompression();
		System.out.println(sc.compressString("aabcccccaaaaff"));
	}
	
	public String compressString(String x) {
		StringBuilder sb = new StringBuilder();
		int num=1;
		for(int i=0; i<x.length()-1; i++) {
			if(x.charAt(i)==x.charAt(i+1)) {
				num++;
			}
			else {
				sb.append(x.charAt(i));
				sb.append(num);
				num=1;
			}
		}
		sb.append(x.charAt(x.length()-1));
		sb.append(num);
		
		
		return sb.toString();
	}
}
