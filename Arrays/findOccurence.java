package forGit.Arrays;

public class findOccurence{
   public static int countFreq(int[] arr, int target) {
        // code here
        int n = arr.length;
        int low = 0;
       int high = n - 1;

// it only searches left smaller than mid matlab
       int first = -1;
       while(low<=high){
           int mid = low + (high-low)/2;

           if(arr[mid] < target){
               low = mid+1;
           }
           else if(arr[mid] > target){
               high = mid-1;

           }
           else if(arr[mid] == target){
               first = mid;
               high = mid - 1;// main line toh ye thi na jo search kar rhi h
           }
       }
       if(first == -1) return 0;

       // it searches only right matlab greater than mid
       int last = -1;
       while(low<=high){
           int mid = low + (high-low)/2;

           if(arr[mid] < target){
               low = mid+1;
           }
           else if(arr[mid] > target){
               high = mid-1;
           }
           else if (arr[mid] == target){
               last = mid;
               low = mid + 1;// jo search karti h left
           }
       }


       return last - first + 1;
   }

    static void main(String[] args) {
        int [] arr = {1 ,1, 2, 2, 2, 2, 3};
        int x = 2 ;
        System.out.println(countFreq(arr,x));
    }
}



// while(low<=high)
//        {
    //        int mid = low + (high - low) / 2;
    //        if(nums[mid]<target) low = mid+1;
    //        else if(nums[mid] > target) high = mid-1;
    //        else if(nums[mid] == target)
//        {
                //first = mid;
                //high = mid-1;
//        }
//        }
//int second = -1;
//low = 0;
//high = n-1;
//        while(low<=high)
//        {
//int mid = low + (high - low) / 2;
//            if(nums[mid]<target) low = mid+1;
//        else if(nums[mid] > target) high = mid-1;
//        else if(nums[mid] == target)
//        {
//second = mid;
//low = mid+1;
//        }