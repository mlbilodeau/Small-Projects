package practice;

public class DeleteMiddleNode {

	public static void main(String[] args) {
		// 1->1->3->2->6->3->1->6->3
		Node root = new Node(1); //9
		root.add(1); //8
		root.add(3); //7
		root.add(2); //6
		root.add(6); //5
		root.add(3); //4
		root.add(1); //3
		root.add(6); //2
		root.add(3); //1
		
		DeleteMiddleNode dmn = new DeleteMiddleNode();
		
		
		while(root.next.next.next!=null) {
			root = dmn.deleteMiddle(root);
			//root = res;
			Node res = root;
			while(res!=null) {
				System.out.println(res.val);
				res=res.next;
			}
		}
		
	}
	
	public Node deleteMiddle(Node root) {
		Node slow = root;
		Node middle = root.next;
		Node end = root.next.next;
		
		while(end.next!=null) {
			middle = middle.next;
			end = end.next.next;
		}
		
		while(slow.next!=middle) {
			slow=slow.next;
		}
		
		//delete middle.
		slow.next=slow.next.next;
		
		return root;
	}

}
