package recursson;

public class ArrayRecurssion {

	public static void main(String[] args) {
	
		int[] list = {7,8,12,3,5};
		int sum=0;
		for(int i =0;i<list.length;i++){
			sum+=list[i];
			
		}
		System.out.println(sum);
		System.out.println(sum(list));
	}
	//sum of numbers in a given array
	public static int sum (int [] list){
		return sum(list,0);
	}
	//sum of numbers in a given array - private
	private static int sum (int[] list, int index){
		if(index==list.length){
			return 0;
		}else{
			return list[index] + sum(list,index + 1);
		}
		
	}
	
	

}
