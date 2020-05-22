package practice;
import java.util.LinkedList;


public class RemoveDuplicates {

	public static void main(String[] args) {
		Node root = new Node(1);
		
		root.add(1);
		root.add(3);
		root.add(2);
		root.add(6);
		root.add(3);
		root.add(1);
		root.add(6);
		root.add(3);
		
		RemoveDuplicates rd = new RemoveDuplicates();
		Node n = rd.rmDup(root);
		
		while(n!=null) {
			System.out.println(n.val);
			n = n.next;
		}
		
		
	}
	
	public Node rmDup(Node root) {
		
		Node current = root;
		
		while(current!=null) {
			Node runner = current;
			while(runner.next!=null){
				if(current.val == runner.next.val) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
		return root;
	}

}
