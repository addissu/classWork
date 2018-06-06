package recursson;

import java.io.File;
import java.util.Scanner;

public class DirectoryCrawler {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		
		System.out.println("Directory or file name? ");
		
		String name = console.nextLine();
		File f = new File(name);
		if(!f.exists()){
			System.out.println("file not found ");
			
		}else print(f, 0);

	}
	//print info about the file with indentation levels 
	
	private static void print(File f, int level) {
		for(int i = 0; i<level; i++){
			System.out.println("    ");
		}
		System.out.println(f.getName());
		if(f.isDirectory()){
			for(File subF: f.listFiles()){
				print(subF, level + 1);
			}
		}
		
	}

}
