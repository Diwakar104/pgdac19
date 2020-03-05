package dataStructure;

class GFG {
    Node head;
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public void push(int newdata){
    	Node newNode=new Node(newdata);
        
             newNode.next=head;
             head=newNode;
        	 return;
        	 
         
 
    }
    public void printList(){
        Node traverse=head;
        while(traverse!=null)
        {
            System.out.println(traverse.data+"");
            traverse=traverse.next;
        }
    }
	public static void main (String[] args) {
	
		GFG list=new GFG();
		list.push(11);
		list.push(22);
		list.push(33);
		list.push(44);
		System.out.println("linked list");
		list.printList();
	}
}
