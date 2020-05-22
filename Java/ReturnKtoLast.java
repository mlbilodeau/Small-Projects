package practice;

public class ReturnKtoLast {

	public static void main(String[] args) {
		Node root = new Node(1); //9
		root.add(1); //8
		root.add(3); //7
		root.add(2); //6
		root.add(6); //5
		root.add(3); //4
		root.add(1); //3
		root.add(6); //2
		root.add(3); //1
		
		ReturnKtoLast rktl = new ReturnKtoLast();
		int n = rktl.returnKthToLast(root, 1); // 2
		System.out.println(n);
	}
	
	
	public int returnKthToLast(Node root, int k) {
		Node start = root;
		Node kFromStart = root;
		
		for(int i=0; i<k; i++) {
			kFromStart = kFromStart.next;
		}
		
		while(kFromStart!=null) {
			kFromStart = kFromStart.next;
			start = start.next;
		}
		
		return start.val;
	}

}
