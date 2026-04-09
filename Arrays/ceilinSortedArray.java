package forGit.Arrays;

public class ceilinSortedArray {
    public static int ceilInSorted(int arr[], int x){
        int n = arr.length;
        int cnt = 0;

        for(int i = 0; i<n; i++){
            if(arr[i] >= x){
                cnt++;
            }
        }
        return cnt;
    }

    static void main(String[] args) {
        int [] arr = {2,5,6,9,17};
        int x = 7;
        System.out.println(ceilInSorted(arr,x));
    }
}
