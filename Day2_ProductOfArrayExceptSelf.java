import java.util.* ;

class Day2_ProductOfArrayExceptSelf 
{
      public static void main (String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n]; 
            int left[] = new int[n];
            int right[] = new int[n];
            left[0] = 1; 
            right[n-1] = 1; 

            for (int i =0; i<n ; i++ ){
                  arr[i] = sc.nextInt();
                  if(i>0){
                        left[i] = left[i-1]*arr[i-1];
                  }
            }

            for(int i=n-2; i>=0 ; i--) {
                  right[i] = right[i+1]*arr[i+1];
            }

            for (int i= 0 ; i<n; i++){
                  System.out.println(left[i]*right[i]);
            }
      }
}