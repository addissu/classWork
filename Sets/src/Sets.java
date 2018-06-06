import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Sets {

	public static void main(String[] args) throws FileNotFoundException {
		
		//create set 
		Set<String> stooges = new HashSet<String>();
		stooges.add("Larry");
		stooges.add("Curley");
		stooges.add("Moe");
		stooges.add("Curley");
		stooges.add("Curley");
		
		System.out.println(stooges.toString());
		
		//find the unique words in a book using set 
		
		Set <String> words = new HashSet<String>();
		Scanner in = new Scanner(new File("mobydick.txt"));
		
		while(in.hasNext()){
			String word = in.next();
			word = word.toLowerCase();
			words.add(word);
		}
		System.out.println("Number of unique words " + words.size());
		List<Integer>list = new LinkedList<Integer>();
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(6);
		list.add(3);
		
		for(String name: stooges){
			System.out.println("way to iterate" + name);
		}
		
		
	}
	
	//check of list has duplicate entries 
	
	public static boolean hasDuplicates(List<Integer> list){
		Iterator itr =  list.iterator();
		Set<Integer> set = new HashSet<Integer>();
		while(itr.hasNext()){
			int i = (int) itr.next();
			set.add(i);
		}
		return set.size()<list.size();
		
		
	}
	
	

}
