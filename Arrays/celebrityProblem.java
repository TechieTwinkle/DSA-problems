package forGit.Arrays;

public class celebrityProblem {
//    public static int celebrity(int mat [][]){
//        int r = mat.length;
//        int c = mat[0].length;
//
//        for(int i = 0; i<r; i++){
//            int count = 0;
//            int know = 0;
//            for(int j = 0; j<c; j++){
//                if(mat[i][j] == 1) count++;
//            }
//            for(int j = 0; j<c; j++){
//                if(mat[j][i] == 1) know++;
//            }
//            if(count == 1 && know == r) return i;
//        }
//        return -1;
//    }

    public static int celebrity(int arr[][]){
        int r = arr.length;
        int c = arr[0].length;
         for(int i = 0; i<r; i++){
             boolean flag = true;

             for(int j = 0; j<c; j++){
                 if(arr[i][j] != 0 && i!=j){
                     flag = false;
                     break;
                 }
             }
             if(!flag) continue;
             for(int j = 0; j<c; j++){
                 if(arr[j][i] != 1){
                     flag = false;
                     break;
                 }
             }
            if(flag) return i;
         }
         return -1;
    }


    static void main(String[] args) {
        int mat[][] = {{1,1,0},{0,1,0},{0,1,1}};
        System.out.println(celebrity(mat));
    }
}
