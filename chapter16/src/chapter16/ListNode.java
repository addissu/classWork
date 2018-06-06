package chapter16;
//list node class, storing single node 
public class ListNode {
	//instance vars 
	//data stored in the node 
	
	
	public int data;
	//link to the next node in the list
	public ListNode next;
	
	//constructor 1 
	
	public ListNode(){
		this(0, null);
	}

	public ListNode(int data) {
		this(data, null);
	}
	
	public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
	
	

}
