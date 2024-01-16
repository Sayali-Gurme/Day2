import java.util.*;
class TwoSumDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target");
		int target=sc.nextInt();
		int ans[]=fun(arr,target);
		System.out.println(ans[0]+","+ans[1]);
	}
	static int[] fun(int[] nums, int target) {
	        for(int i=0;i<nums.length;i++){
			 for(int j=i+1;j<nums.length;j++){
			 	if(nums[i]+nums[j]==target){
					 return new int[]{i, j};
				}
			 }
		}
	        return new int[]{};
	    }
}
