package forGit.Arrays;

public class findOccurence{
   public static int countFreq(int[] arr, int target) {
        // code here
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        int cnt = -1;

       while(low<=high){
           int mid = low + (high-low)/2;

           if(arr[mid] == target){
               cnt = mid;
               high = mid - 1;
           }
           if(arr[mid] < target){
               low = mid+1;
           }
           else{
               high = mid-1;
           }
       }

// it only searches right; greater than mid matlab
        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid] == target){
                cnt = mid;
                low = mid + 1;
            }
            if(arr[mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;

            }
        }
        return cnt;
   }

    static void main(String[] args) {
        int [] arr = {1 ,1, 2, 2, 2, 2, 3};
        int x = 2 ;
        System.out.println(countFreq(arr,x));
    }
}
