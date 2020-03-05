package dataStructure;

public class LinkedListOperation {
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	public void push(int newdata) {
		Node newNode=new Node(newdata);
		
		//make next of new node as head
		newNode.next=head;
		
		//move the head to point to new node
		head=newNode;
	}
	
    public void insertEnd(int newdata) {
    	Node newNode=new Node(newdata);
    	
    	if(head==null) {
    		head=new Node(newdata);
    		return;
    	}
    	newNode.next=null;
    	
    	Node last=head;
    	while(last.next!=null) {
    		last=last.next;
    		last.next=newNode;
    		return;
    	}
    }
    
    public void insertAfter(Node previous,int newdata) {
    
    	if(previous==null) {
    		System.out.println("The given previous node cannot be null");
    	     return;
    	}
    	 Node newnode=new Node(newdata);
    	 newnode.next=previous.next;
    	 previous.next=newnode;
    }
    void deleteNode(int pos)
    {
    	if(head==null)
    		return;
    	Node temp=head;
    	
    	if(pos==0)
    	{
    		head=temp.next;
    		return;
    	}
    	for (int i = 0;temp!=null&&i<pos-1; i++) 
			temp=temp.next;
			
    	if(temp==null||temp.next==null) {
    		return;
    	}
    	Node next=temp.next.next;
    	temp.next=next;//unlink the delet
    }
    
    public void printList() {
    	Node tnode=head;
    	while(tnode!=null)
    	{
    		System.out.println(tnode.data+"");
    		tnode=tnode.next;
    	}
    }
	public static void main(String[] args) {
	LinkedListOperation list=new LinkedListOperation();
	list.insertEnd(7);
	list.push(6);
	list.push(5);
	list.push(4);
	System.out.println("create linked list");
	list.printList();
	System.out.println("insert after operation ");
	list.insertAfter(list.head.next.next, 22);
	list.printList();
	System.out.println("delete pos 2");
    list.deleteNode(2);
    list.printList();
	}

}
