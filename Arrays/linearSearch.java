package forGit.Arrays;

public class linearSearch {
    //linear Search Function
    public static void linearSearch(int nums[], int key){
        int n = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == key){
               n = i;
            }
        }
        System.out.println(n);
    }
    public static void main(String[] args) {
        int nums[] = {1,4,5,8,2,9};
        int key = 2;
        System.out.println(nums.length);
        System.out.println(key);
        linearSearch(nums,key);
        System.out.println();
    }
}
