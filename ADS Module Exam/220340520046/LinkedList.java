class LinkedList{
	Node head;
	static class Node{
	int data;
	Node next;
	Node(int d){
	data = d;
	next =null;
		
	}
		
	}
	void display(){
		Node trav = head;
		while(null != trav){
			
			System.out.println(trav.data);
			trav = trav.next;
		}
		
		
	}
	
	public Node reverse(Node head){
		if(head== null){
			return null;
		}
		Node current = head;
		Node prev = null;
		Node next = null;
		while(current!=null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
	
	
	
	public static void main(String args[]){
		LinkedList ll = new LinkedList();
		ll.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		
		ll.head.next = second;
		second.next = third;
		third.next = four;
		four.next = five;
		System.out.println("Nodes Present");
		ll.display();
		System.out.println("Reverse element");
		System.out.println(ll.reverse(ll.head).data);
		ll.display();
		
		
	}
	
	
	
	
	
	
}