import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordChallenge {

	public static void main(String[] args) throws FileNotFoundException{
		
		System.out.println("Welcome to scrabble");
		
		//read asorted dict. file into list 
		
		Scanner console = new Scanner(new File("words.txt"));
		
		List<String>words = new ArrayList<String>();
		
		while(console.hasNext()){
			String word = console.next();
			words.add(word);
		}
		
		//binary search 
		
		Scanner in = new Scanner(System.in);
		System.out.print(" word to compare (Enter to quit");
		
		String target = in.nextLine();
		while (target.length()>0){
			int index = Collections.binarySearch(words, target);
			
			if(index>=0){
				System.out.println("\"" + target + "\" is word# " + index + "of " + words.size());
			}else{
				System.out.println("\"" + target + "\" is not found");
			}
			
			
			System.out.print(" word to compare (Enter to quit");
			target= in.nextLine();
		}

	}

}
