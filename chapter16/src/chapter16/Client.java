package chapter16;

public class Client {

	public static void main(String[] args) {
			
		
		LinkedListInt list = new LinkedListInt();
		
		list.add(22);
		list.add(23);
		list.add(42);
		list.add(299);
		System.out.println(list.toString());
		
		list.add(1);
		System.out.println(list.toString());
		
		list.indexOf(42);
		System.out.println(list.toString());
	}

}
