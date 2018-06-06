package chapter16;
//store list of integers 
public class LinkedListInt {
	//first value in the list 
	private ListNode front;
	
	public LinkedListInt(){
		front=null;
	}
	
	public int size(){
		int count=0;
		ListNode current = front;
		
		while(current!=null){
			current = current.next;
			count++;
		}
		return count;
	}
	
	
	//return int with given index in the list 
	
	public int get(int index){
		return nodeAt(index).data;
	}

	private ListNode nodeAt(int index) {
		ListNode current = front;
		for(int i=0;i <index;i++){
			current = current.next;
		}
		return current;
	}
	
	//create a comma seperated bracketed version of the list
	
	
	public String toString(){
		if(front == null){
			return "[]";
		}else{
			String result = "[" + front.data;
			ListNode current = front.next;
			
			while(current != null){
				result+=", " + current.data;
				current=current.next;
			}
			result += "]";
			return result;
		}
		
	}
	
	//return position of first occurance 
	
	public int indexOf(int value){
		int index = 0;
		ListNode current = front;
		while(current != null){
			if(current.data==value){
				return index;
			}
			
			
			index++;
			current = current.next;
			
			
		}
		
		return -1;
		
		
		
		
	}
	
	//append given value to end of the list 
	
	public void add(int value){
		
		if(front==null){
			front= new ListNode(value);
		}else {
			ListNode current = front;
			while(current.next != null){
				current = current.next;
			}
			current.next = new ListNode(value);
		}
		
			
		}
	//insert the value at the given index
			public void add(int index, int value){
				
				if(index==0){
					front = new ListNode(value, front);
				}else {
					ListNode current = nodeAt(index-1);
					current.next = new ListNode(value, current.next);
				}
		
	}
			
			
			//remove value at given index 
			
			public void remove(int index){
				if(index==0){
					front = front.next;
				}else{
					ListNode current = nodeAt(index -1);
					current.next = current.next.next;
				}
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
