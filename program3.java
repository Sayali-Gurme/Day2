import java.util.*;
class GFGDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		fun(arr);
	}
        static void fun(int num[]){
		if(num.length<2){
			System.out.println("-1");
			return;
		}
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;

		for(int i=0;i<num.length;i++){
			if(num[i]<smallest){
				secondSmallest=smallest;
				smallest=num[i];
			}else if(num[i]<secondSmallest && num[i] !=smallest){
				secondSmallest=num[i];
			}
		}
		if(secondSmallest== Integer.MAX_VALUE){
			System.out.println(smallest);
		}else{
			System.out.println(smallest+","+secondSmallest);
		}

	}	
}
