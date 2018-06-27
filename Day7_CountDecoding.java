import java.util.*;

class Day7_CountDecoding
{
	static int countDecoding(int arr[], int n) {
		// base cases
    	if (n == 0 || n == 1)
    		return 1;
		
		int count = 0 ; 
		if(arr[n-1]>0) {
			count = countDecoding(arr, n-1);
		}

		if(arr[n-2]==1 || (arr[n-2]==2 && arr[n-1]<7 )) {
			count += countDecoding(arr, n-2);
		}

		return count;
	}

	public static void main(String[] args) {
		int arr [] = {1,2,3,4};

		System.out.println(countDecoding(arr,4));
	}
	
}