package dataStructure;

public class QueueusingArray {
 
 private int capacity;
 int rear;
 int front;
 int currentSize=0;
 int quearr[];
 
 public QueueusingArray(int sizeOfQueue) {
	 this.capacity=sizeOfQueue;
	 front=0;
	 rear=-1;
	 quearr=new int[this.capacity];
 }
 public void enqueue(int data)
 {
	 if(isFull()) {
		 System.out.println("Queue if full can not add more elememt");
	 }
	 else {
		 rear++;
		 if(rear==capacity-1) {
			 rear=0;
		 }
		 quearr[rear]=data;
		 currentSize++;
		 System.out.println("added in queue");
	 }
 }
 
 public void deQueue() {
	 if(isEmpty()) {
		 System.out.println("queue is empty can not dequee");
	 }
	 else {
		 front++;
		 if(front==capacity-1) {
			 System.out.println(quearr[front-1]+"removed from the queue");
			 front=0;
		 }else {
			 System.out.println(quearr[front-1]+"removed from the queue");
		 }
		 currentSize--;
	 }
 }
 public boolean isFull() {
	 if(currentSize==capacity)
		 return true;
	 return false;
 }
 
 public boolean isEmpty() {
	 if(currentSize==0)
		 return true;
	 return false;
 }

	public static void main(String[] args) {
		

	}

}
