import java.util.Stack;

public class Ch14TestQ {
	
	public static void main (String[] args){
		Integer[] data = {1,5,8,4,7,6,3,4,8,9,};
		
		Stack<Integer> s = new Stack<Integer>();
		
		
		for(Integer num : data){
			s.push(num);
		}
		
		
		
		System.out.println("Stack " + s);
		
		System.out.println(max2(s));
	}
	public static int max1(Stack<Integer>s){
		int maxValue = s.pop();
		
		while(!s.isEmpty()){
			int next = s.pop();
			maxValue = Math.max(maxValue, next);
		}
		return maxValue;
	}
	
	public static int max2(Stack<Integer>s){
		
		Stack<Integer>backup = new Stack<Integer>();
		int maxValue= s.pop();
		backup.push(maxValue);
		
		while(!s.isEmpty()){
			int next = s.pop();
			backup.push(next);
			maxValue = Math.max(maxValue, next);
		}
		while(!backup.isEmpty()){
			s.push(backup.pop());
		}
		return maxValue;
	}

}
