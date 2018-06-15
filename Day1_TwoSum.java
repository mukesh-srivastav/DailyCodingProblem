import java.util.*;

class Day1_TwoSum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		int arr[] =new int [n];
		for(int i = 0 ; i <n ; i++){
			arr[i] = sc.nextInt();
		}

		int res [] = two_sum (arr, n , s);

		if (res[0]!=-1){
			System.out.println(res[0]+ " " + res[1]);
		} else {
			System.out.println("No sum found : " + res[0]);
		}

	}

	public static int [] two_sum (int [] arr, int n , int s )
	{
		int hash[] = new int[n];
		for(int i = 0 ; i<n ; i++){
			if ( hash[s-arr[i]] != 0 ) {
				int a[] =  {arr[i], s-arr[i]};
				return a;
			} else {
				hash[arr[i]] = 1 ; 
			}
		}

		int a[] = {-1};
		return a;  
	}
}