import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//play lottery game with the user
//read lottery numbers and print
//matching lottery tickets numbers
public class Lottery {
	//constant 
	public static final int NUMBERS = 6;
	public static final int MAX_NUMBERS= 40;
	
	
	
	public static void main(String[] args) {
		//get winning number and ticket sets
		
		Set <Integer> winningNumbers = createWinningNumbers();
		Set<Integer> ticket = getTicket();
		
		//keep the winning numbers from the user ticket
		Set<Integer> intersections = new TreeSet<Integer>(ticket);
		intersections.retainAll(winningNumbers);
		System.out.println(" your ticket numbers are " + ticket);
		System.out.println(" winning numbers are  " + winningNumbers);
		
		System.out.println(" your had  " + intersections.size() + "matching numbers");
		
		if (intersections.size()>0){
			double prize = 100 * Math.pow(2, intersections.size());
			System.out.println("the matched numbers are " + intersections);
			System.out.println(" your  prize is " + prize);
		}

	}
	
	//generate a set of winning lotto numbers
	
	public static Set<Integer> createWinningNumbers(){
		Set<Integer> winningNumbers = new TreeSet<Integer>();
		Random r = new Random();
		
		while(winningNumbers.size()< NUMBERS){
			int number = r.nextInt(MAX_NUMBERS + 1);
			winningNumbers.add(number);
		}
		return winningNumbers;
	}
	//read the players lottery ticket from console 
	
	public static Set<Integer> getTicket(){
		Set<Integer> ticket = new TreeSet<Integer>();
		Scanner console = new Scanner(System.in);
		System.out.print("type your " + NUMBERS + "unique lotto numbers");
		while (ticket.size()<NUMBERS){
			int number = console.nextInt();
			ticket.add(number);
		}
		console.close();
		return ticket;
		
	}

}
