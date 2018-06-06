import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test13 {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		
		list.add("cat");
		list.add("dog");
		list.add("hot");
		list.add("boy");
		list.add("you");
		list.add("ouch");
		
		int index = list.indexOf("h");
		
		if(index>0){
			System.out.println(" h is the string with index " + index);
		}else{
			System.out.println(" h is not here ");
		}	//binary search for array
			int[] numbers = {22,32,42,52,62,72,82};
			int index1=Arrays.binarySearch(numbers, 52);
			System.out.println("52 was found at index " + index1);
			
			//collection binary search
			
			List<Integer>intList=new ArrayList<Integer>();
			
			intList.add(1);
			intList.add(5);
			intList.add(3);
			intList.add(55);
			intList.add(6);
			
			Collections.sort(intList);
			
			int index2 = Collections.binarySearch(intList, 5);
			System.out.println("5 was found " + index2); 
			
			Collections.sort(list);
			
			//collections shuffle 
			
			String[] ranks = {"2", " 5"," 7","9 ","8 ","jack", " king","queen"};
			String[] suits = {"clubs", "Diamond", "heart","spade"};
			
			List<String>deck= new ArrayList<String>();
			
			for(String rank : ranks){
				for(String suit :  suits){
					deck.add(rank + " of " + suit);
				}
			}
			
			Collections.shuffle(deck);
			System.out.println("Top card = " + deck.get(0));
			
			
			//sort strings with case insensitive comparer 
			
			String[]strings1={"addissu", "can", "eating ", "basketball","Super", "Delta"};
			
			Arrays.sort(strings1, String.CASE_INSENSITIVE_ORDER);
			System.out.println(Arrays.toString(strings1));
			
			Arrays.sort(strings1, new LengthComparator());
			System.out.println(Arrays.toString(strings1));
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
