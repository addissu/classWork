package recursson;

public class Recurssion1 {

	public static void main(String[] args) throws Exception {
		
		System.out.print(pow(3,5));
		//collectStars(3);
		System.out.println();
		System.out.println( isPalindrome("radar"));
		System.out.println( isPalindrome("cat"));
		
		System.out.println(gcd(12,80));
		System.out.println(gcd(12,-80));
	}
	
	/*public static void collectStars(int n){
		
		if (n==0){
			System.out.println();
		}else 
		System.out.print("*");
	 collectStars (n - 1);
	}*/
	
	public static int pow(int x, int y) {
		//base case 
		if(y<0){
			throw new IllegalArgumentException("negative");
			//second base case 
		}if(y==0){
			return 1;
			//Recursive case if even 
		}else if (y%2==0){
			return pow(x*x, y/2);
		}
		//recursive case with y>0
		else{
			return x * pow(x,y-1);
		}
	}
	
	//return true if a string is a palmindrome(reads same forwards and backwards) true for 1 letter string
	
	public static boolean isPalindrome(String s){
		if (s.length() < 2){
			return true;
		}else {
			char first = s.charAt(0);
			char last = s.charAt(s.length() -1);
			if(first != last){
				return false;
			}
			String middle = s.substring(1, s.length() -1);
			return isPalindrome(middle);
		}
		
		
	}
	
	
	
		public static boolean isPalindrome1(String s){
			if(s.length()<2){
				return true;
			}else{
				return s.charAt(0)==s.charAt(s.length()-1) &&
				isPalindrome1(s.substring(1, s.length()-1));
			}
		}
	
		
		//gcd 
		
		//create pre conditions    
		//return GCD of x and y 
		
		public static int gcd(int x, int y){
			//recurssive with negative values 
			if (x<0 || y< 0){
				return gcd(Math.abs(x), Math.abs(y));
			}
			if(y==0){
				return x;
			}else {
				return gcd(y, x % y);
			}
		}
	
	
	
	
	

}
