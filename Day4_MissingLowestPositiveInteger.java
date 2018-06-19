import java.util.*;

class Day4_MissingLowestPositiveInteger 
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n]; 

    int max = Integer.MIN_VALUE ; 
    for(int i =0; i<n ; i++){
      arr[i] = sc.nextInt();
      if (arr[i] >= max ){
          max = arr[i];
      }
    }

    // int temp[] = new int[max];
    // int f = 0; 
    // for ( int i = 0; i < max ; i++){
    //     if( arr[arr[i] - 1] > 0)
    //         temp[arr[i]-1] = 1 ;
    // }

    // for (int i = 0; i < max ; i++) {
    //   if(temp[i]==0){
    //     System.out.println(i+1);
    //     f=1;
    //     break;
    //   }
    // }
    // if (f==0){
    //   System.out.println(max+1);
    // }

    int flag = 0;
    for (int i = 0 ; i< n ; i++) {
      if(Math.abs(arr[i])-1 < n && arr[Math.abs(arr[i])-1] > 0 ) {
        arr[Math.abs(arr[i])-1] = - arr[Math.abs(arr[i]) - 1] ; 
      }
    }
    int i; 
    for ( i = 0 ; i<n ; i++) {
      if (arr[i]>0){
        flag = 1;
        break; 
      }
    }

    if(flag == 1) {
      System.out.println (i+1);
    } else {
      System.out.println (n+1);      
    }
  }
}