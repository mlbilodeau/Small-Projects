package practice;

public class Node {
	Node next = null;
	int val;
	
	public Node(int d) {
		val = d;
	}
	
	void add(int d) {
		Node end = new Node(d);
		Node n = this;
		while(n.next !=null) {
			n=n.next;
		}
		n.next=end;
	}
}
