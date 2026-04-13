package forGit.recurrsion;
// sorted and reversing an Array
public class reverseArray {
    public static void swap(int arr[] , int i, int n){
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

    }
        public static void reverse(int i, int arr[], int n){
        if(i>=n/2) return;
        swap(arr, i, n);
        reverse(i+1,arr,n);
    }
    static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int n = arr.length;
        reverse(0,arr,n);
//        swap(arr,0,n-1);
        for(int ele : arr){
            System.out.println(ele + " ");
        }
//        System.out.println();
    }
}
