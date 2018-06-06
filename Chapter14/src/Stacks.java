
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//basic stack operations 


public class Stacks {

	public static void main(String[] args) {
		String [] data = {"eat", "more","fruit", "and","plants"};
		
		Stack<String> s = new Stack<String>();
		
		//que adding and taking out from stack 
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(5);
		q.add(7);
		
		Stack<Integer> s1 = new Stack<Integer>();
		
		while(!q.isEmpty()){
			s1.push(q.remove());
		}
		
		while(!s1.isEmpty()){
			q.add(s1.pop());
		}
		
		System.out.println("Que after " + q);
		
		
		
		
		
		
		
		
		
		
		
		
		for(String str : data){
			s.push(str);
		}
		System.out.println("stack = " + s);
		System.out.println("size = " + s.size());
		System.out.println("peek = " + s.peek());
		
		while(!s.isEmpty()){
			System.out.println(s.pop() + " ");
		}
		System.out.println();
		System.out.println("after... stack = " + s);
	}

}
