package forGit.Arrays;
//import java.util.scanner;

public class largest {
//    public static void main(String[] args){
//        scanner sc = new scanner(System.in);
//        int [] arr = {1,4,7,2,5};
//        int maxV = 0;
//        int maxS =0;
//        int n = arr.length;
//        for(int i=0; i<n;i++){
//            if(maxV < arr[i]){
//                maxV = arr[i];
//            }
//        }
//        for(int j =0;j<n;j++){
//            if(maxS < arr[j] && arr[j]!=maxV){
//                maxS = arr[j];
//            }
//        }
//        System.out.println(maxS);
//    }

    public static void larger(int nums[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxS = Integer.MIN_VALUE;

        for(int i = 0; i< nums.length;i++){
            if(min > nums[i]){
                min = nums[i];
            }
        }

        for(int j = 0; j< nums.length;j++){
            if(max < nums[j]){
                max = nums[j];
            }
        }

        for(int k = 0; k<nums.length;k++){
            if(maxS < nums[k] && nums[k]!= max){
                maxS = nums[k];
            }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(maxS);
    }
    public static void main(String[] args) {
        int [] nums = {1,4,6,2,9};
        larger(nums);
        System.out.println();
    }

}
