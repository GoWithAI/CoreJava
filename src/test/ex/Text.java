package test.ex;

public class Text {

	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
	Node n = new Node(1);
	n.next = new Node(2);
	
	n.next.next = new Node(3);
	n.next.next.next = new Node(4);
	n.next.next.next.next = new Node(5);
	n.next.next.next.next.next = new Node(6);
	n.next.next.next.next.next.next = new Node(7);
		
	int size = 7;
	int subset = 2;
	
	
	Node currentNode = null;
	Node previous;
	Node next = null;
	
	currentNode = n;
	while(n.next != null) {
		
	n.next = next;	
	next = currentNode;
	
	
	}
	
	
	
	
	}
	


}
