package forGit.recurrsion;
// sorted and reversing an Array
public class reverseArray {
    public static void swap(int arr[] , int i, int n){
        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;

    }
        public static void reverse(int i, int arr[], int n){
        if(i>=n) return;
        swap(arr, i, n);
        reverse(i+1,arr,n-1);
    }
    static void main(String[] args) {
        int [] arr = {9,2,10,4};
        int n = arr.length;
        reverse(0,arr,n-1
        );
//        swap(arr,0,n-1);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
//        System.out.println();
    }
}
