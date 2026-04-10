package forGit.BitMap;

public class singlyElement {
    public static int singleNonDuplicate(int[] nums) {
        int xor = 0;
        for(int ele:nums)
        {
            xor = xor ^ ele;
        }
        return xor;
    }

    static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,4,8,8};
//        int x = 2;
        System.out.println(singleNonDuplicate(arr));
    }
}
