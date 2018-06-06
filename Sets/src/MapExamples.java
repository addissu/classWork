import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapExamples {

	public static void main(String[] args) {
		
		//creating a map 
		Map<String, Double> salaryMap = new HashMap <String, Double>();
		salaryMap.put("addissu tamru", 100000.00);
		salaryMap.put("sososos", 10020.30);
		salaryMap.put("jordan", 56000.00);
		salaryMap.put("tamruaddissu", 45000.00);
		//get value based on value 
		double dSalary = salaryMap.get("addissu tamru");
		System.out.printf(" addissu's salary is $%.2f\n" , dSalary );
		//look for person salary (value) based on name (key)
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a persons name " );
		String name = console.nextLine();
		
		//search the map for a name 
		
		if (salaryMap.containsKey(name)){
			double salary = salaryMap.get(name);
			System.out.printf("%s\'s salary is: $%.2f\n ", name, salary);
			
		}else{
			System.out.println("no records found for " + name);
		}
		
		//print the map 
		System.out.println(salaryMap);
			//map views(key set and values)
		
		Map<Integer, String> ssnMap = new HashMap<Integer, String>();
		
		ssnMap.put(223232323, "Addissu");
		ssnMap.put(7894564, "Jordan");
		ssnMap.put(2255553, "Payton");
		ssnMap.put(666666555, "Kemp");
		//return a set view of the map
		//print all keys 
		Set<Integer> ssnSet = ssnMap.keySet();
		
		for(int ssn: ssnSet){
			System.out.println("SSN " + ssn);
		}
		//print all values 
		
		Collection<String> names = ssnMap.values();
		for(String name1 : names){
			System.out.println("Name " + name1);
		}
		
		//combine the keys and values for looping over the key
		//and getting values 
		for(int ssn: ssnMap.keySet()){
			String name2 = ssnMap.get(ssn);
			System.out.println(name2 + " " + ssn);
			
		}
		// treemap example 
		
		Map<Integer, String> ssnMap1 = new TreeMap<Integer, String>();
		ssnMap1.put(223232323, "green");
		ssnMap1.put(7894564, "blue");
		ssnMap1.put(2255553, "yes");
		ssnMap1.put(666666555, "Sosi");
		//will print sorted keys
		
		System.out.println(ssnMap1.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
