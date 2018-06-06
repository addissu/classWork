
public class SortingOfJava {

	public static void main(String[] args) {
		
		int [] numbers = {12,15,84,24,23,20,46,47,29,37,66};
		
		selectionSort(numbers);
		System.out.println(isSorted(numbers));

	}
	
	//selection sort algorithm 
	//places the elements of the array into sorted order
	
	public static void selectionSort(int[] a){
		//find index of smallest element 
		for(int i=0; i<a.length-1;i++){
			int smallest = i;
			for(int j=i+1; j<a.length; j++){
				if(a[j] < a[smallest]){
					smallest = j;
				}
			}
			
			swap(a,i,smallest);//swaps the smallest to the front 
			
			
		}
	}
		
		//swapa[i] with a [j]
		
		public static void swap (int[] a, int i, int j){
			if(i!=j){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		//return true if array is in assorted order 
		
		public static boolean isSorted(int[]a){
			for (int i =0;i<a.length -1;i++){
				if(a[i]> a[i+1]){
					return false;
				}
			}
			return true;
		}
	
	}


