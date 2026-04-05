package forGit.Arrays;

public class moveZero {
    public static void swap(int a, int b, int [] nums)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    static void main(String [] args) {
        int [] nums = {0,1,0,3,12};
        int n = nums.length;
        int a = 0;
        int b = 0;
        while(b < n)
        {
            if(nums[b] == 0) b++;
            else{
                swap(a,b, nums);
                a++;b++;
            }
        }

        for(int elements: nums){
            System.out.print(elements + " ");
        }
    }
}
