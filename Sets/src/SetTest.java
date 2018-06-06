import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		//use a tree to work with an ordered set
		//use it to print a sorted set of 3 letterwords starting with "A"
		
		Set<String> words1 = new TreeSet<String>();
		Scanner console = new Scanner(new File("mobydick.txt"));
		
		while (console.hasNext()){
			String word = console.next();
			word = word.toLowerCase();
			
			if(word.startsWith("a")&& word.length()==3){
				words1.add(word);
			}
		}
			System.out.println("3 letter words starting with a:" + words1);
	}

}
