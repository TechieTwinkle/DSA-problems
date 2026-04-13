package forGit.Arrays;

public class  majority {
    static void main() {
        int [] arr = {2,2,1,1,1,2,2};
        int n = arr.length;
        int res = 0;
        for(int i =0; i<n ; i++){
            int count = 0;
            for(int j = 0; j<n; j++){
                if(arr[i] == arr[j]){
                    count ++;
                }
            }
            if(count > n/2){
                res = arr[i];
            }
        }
        System.out.println(res);
    }
}
