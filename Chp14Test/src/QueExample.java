import java.util.LinkedList;
import java.util.Queue;

public class QueExample {

	public static void main(String[] args) {
		
		
		String [] data = {"eat", "more","fruit", "and","plants"};
		String [] data1 = {"eat", "more","fruit", "and","plants"};
		
		
		Queue<String> q = new LinkedList<String>();
		
		for(String str: data1){
			q.add(str);
		}
		System.out.println("queue = " + q);
		System.out.println("size = " + q.size());
		System.out.println("peek = " + q.peek());
		
		
		while(!q.isEmpty()){
			System.out.println(q.remove() + " ");
		}
		System.out.println();
	}

}
