public class LinkedList 
{
	Node head;

	class Node{
		int data;
		Node next;

		Node(int d){
			data=d;
			next=null;

		}

	}
	void Insert_Sorted(Node new_node) {
		Node current;

		if (head==null || head.data >= new_node.data) {
			new_node.next= head;
			head=new_node;
		}
		else {
			current= head;

			while(current.next != null && current.next.data< new_node.data)
				current= current.next;
				new_node.next=current.next;
				current.next=new_node;



		}

	}
	Node newNode(int data) {
		Node a= new Node(data);
		return a;
	}




	void printLinkedList() {
		int count=1;
		Node temp= head;
		while(temp!= null) {
			System.out.println("Rank " +count+" is: "+temp.data+ " ");
			temp= temp.next;
			count++;
		}
	}
	public static void main(String[] args) {
		Node new_node;

		LinkedList list= new LinkedList();
		new_node=list.newNode(99);
		list.Insert_Sorted(new_node);

		new_node=list.newNode(59);
		list.Insert_Sorted(new_node);

		new_node=list.newNode(49);
		list.Insert_Sorted(new_node);

		new_node=list.newNode(23);
		list.Insert_Sorted(new_node);

		new_node=list.newNode(1);
		list.Insert_Sorted(new_node);

		new_node=list.newNode(2);
		list.Insert_Sorted(new_node);

		new_node=list.newNode(69);
		list.Insert_Sorted(new_node);

		new_node=list.newNode(71);
		list.Insert_Sorted(new_node);

		new_node=list.newNode(100);
		list.Insert_Sorted(new_node);

		System.out.println("This is the sorted Linked List with Rankings ");
		list.printLinkedList();




	}


}
