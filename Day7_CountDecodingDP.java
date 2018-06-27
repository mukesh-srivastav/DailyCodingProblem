import java.util.*;

class Day7_CountDecodingDP
{
	static int countDecodingDP(int arr[], int n) {
		int count[] = new int[n+1];
		// A table to store result of subproblems.
		count[0] = 1;
		count[1] = 1;
		
		for(int i=2; i<=n; i++) {
			count[i]= 0 ;
			if(arr[i-1]>0) {
				count[i] = count[i-1]; 
			}

			if(arr[i-2] == 1 || (arr[i-2] == 2 && arr[i-1] < 7 )) {
				count[i] += count[i-2];
			}
		}
		return count[n];
	}

	public static void main(String[] args) {
		int arr [] = {1,2,3,4};

		System.out.println(countDecodingDP(arr,4));
	}
	
}