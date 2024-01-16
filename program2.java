import java.util.*;
class removeDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter val");
		int val=sc.nextInt();
		int ans=fun(arr,val);
		System.out.println(ans);
		System.out.println("array after operation");
		for(int j=0;j<ans;j++){
			System.out.print(arr[j]+" ");
		}
		for(int k=ans;k<arr.length;k++){
			System.out.print("_"+" ");
		}
		
	}
	static int fun(int arr[],int val){
		int k=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] !=val){
				arr[k]=arr[i];
				k++;
			}
		}
		return k;
	}
}
