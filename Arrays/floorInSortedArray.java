package forGit.Arrays;

public class floorInSortedArray {
    public static int floor(int arr[] , int x){
        int n = arr.length;
        int cnt = 0;
        if(x < arr[0]) return -1;
        for(int i = 0; i<n; i++){
            if(arr[i] <= x){
                cnt++;
            }
        }
        return cnt;
    }

    static void main() {
        int [] arr = {2,4,5,7,9,10};
        int x = 11;
        System.out.println(floor(arr,x));

    }
}
