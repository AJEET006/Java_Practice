package dataStructure;

public class MiddleLinkedList {
	private Node head;

	public void insert(int data)
	{
		Node temp= new Node(data);
		if(head==null) {
			head=temp;
		}
		else
		{
			temp.next=head;
			head=temp;
		}
	}
	public void print()
	{
		Node itr=head;
		if(head==null)
		{
			System.out.println("LinkedList is empty");
		}
		while(itr!=null)
		{
			System.out.print(itr.data+" ");
			itr=itr.next;
		}
	}

	private int middle()
	{
		Node itr=head;
		int cnt=0;
		if(head==null)
		{
			System.out.println("length is 0");
			return 0;
		}
		while(itr!=null)
		{		cnt++;	
			itr=itr.next;
			
		}
		System.out.println("\nLength of LL is  " + cnt);
		return cnt;
	}
	public void mid()
	{
		Node itr=head;
		int cnt = middle();
		int mid=0;
		int cnt1=0;
		while(itr!=null)
		{			
			itr=itr.next;
			cnt1++;
			if(cnt1==cnt/2)
			{
				mid=itr.data;
				System.out.println("data is  "+ mid);
			}
		}
	}


	public static void main(String[] args) {
		MiddleLinkedList ll = new MiddleLinkedList();
		ll.insert(45);
		ll.insert(89);
		ll.insert(66);
		ll.insert(32);
		ll.insert(88);
		ll.print();
		ll.mid();

	}

}
class Node{
	Node next;
	int data;

	public Node()
	{
		this.next=null;
		this.data=0;
	}
	public Node(Node next,int data)
	{
		this.next=next;
		this.data=data;
	}
	public Node(Node next)
	{
		this.next=next;
		this.data=0;
	}
	public Node(int data)
	{
		this.next=null;
		this.data=data;
	}
}