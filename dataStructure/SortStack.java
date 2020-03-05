package dataStructure;

import java.util.Stack;

public class SortStack {
	public static Stack<Integer> sortStack(Stack<Integer> input){
		Stack<Integer> tmpstack=new Stack<Integer>();
		while(!input.isEmpty()) {
			
			//pop out the first element
			int tmp=input.pop();
			while(!tmpstack.isEmpty()&&tmpstack.peek()>tmp) {
				//pop from tmp stack 
				//and push it in input stack
				input.push(tmpstack.pop());
				
			}
			tmpstack.push(tmp);
		}
		return tmpstack;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stack<Integer> input =new Stack<Integer>();
       input.push(10);
       input.push(23);
       input.push(33);
       input.push(11);
       input.push(43);
       
       //this is temporary stack
       Stack<Integer> tmpStack=sortStack(input);
       System.out.println("sorted numbers are");
       while(!tmpStack.empty()) {
    	   System.out.println(tmpStack.pop()+" ");
       }
	}

}
