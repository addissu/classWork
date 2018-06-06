
public class Searching {

	public static void main(String[] args) {
		
		String [] a = {"a","b","c","d"};
		
		int [] numbers = {12,15,84,24,23,20,46,47,29,37,66};
		
		System.out.println(indexOf(numbers,45));
		System.out.println(indexOf(numbers,42));
		
		System.out.println();
		
		System.out.println(binarySearch(numbers,45));
		System.out.println(binarySearch(numbers,45));
		
		System.out.println(binarySearchR(numbers,45));
		System.out.println(binarySearchR(numbers,42));
		System.out.println();
		System.out.println(binarySearchS(a,"a"));
		System.out.println(binarySearchS(a,"z"));
		

	}
	
	//sequnctial search algorithm
	//returns index for the first time target appears in the unput, otherwise return -1
	
	public static int indexOf(int[] numbers, int target){
		for(int i=0; i < numbers.length;i++){
			if(numbers[i] ==target){
				return i;
			}     
		}
		 return -1; //not found
	}
	//binary search algorithm 
	//binary search algorithm
		//returns index for the first time target appears in the unput, otherwise return -1
	public static int binarySearch(int[] numbers,int target){
		int min = 0;
		int max = numbers.length -1;
		
		while (min <=max){
			int mid =(max +min)/2;
			if(numbers[mid]==target){
				return mid;
			}else if (numbers[mid]<target){
				min = mid+1;
			}else{
				max = mid-1;
			}
		}return -1;
	}
	
	
	//recurssive binary search 
	//returns index for the first time target appears in the unput, otherwise return -1
	
	public static int binarySearchR(int[] numbers, int target){
		return binarySearchR(numbers, target,0,numbers.length-1);
	}
	public static int binarySearchR(int[] numbers, int target, int min, int max){
		if(min>max){
			return -1;
		}else {
			//recurssive case 
			int mid = (max+min)/2;
		if(numbers[mid]==target){
			return mid;
		}else if(numbers[mid]<target){
			return binarySearchR(numbers, target, mid+1,max);
		}else{
			return binarySearchR(numbers, target, min, mid-1);
		}
		}
	}
	
	
	public static int binarySearchS(String [] strings, String target){
		int min =0;
		int max = strings.length -1;
		
		while (min<=max){
			int mid = (min+max)/2;
			int compare = strings[mid].compareTo(target);
			if(compare == 0){
				return mid;
			}else if (compare <0){
				min = mid+1;
			}else //compare > 0 
				max = mid -1;
		}
		  return -1;
	}    
	
	
	
	
	
	
	
	
	

}
