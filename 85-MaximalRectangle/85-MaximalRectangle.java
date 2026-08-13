// Last updated: 13/08/2026, 18:51:09
class Solution {
    public int largestH(int[] arr){
        int n = arr.length;
        int maxAr = 0;

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<=n; i++){
            int currH;
            if(i == n)currH = 0;
            else currH = arr[i];

            while(!st.isEmpty() && arr[st.peek()] > currH){
                int h = arr[st.pop()];

                int w;

                if(st.isEmpty()){
                    w = i;
                }
                else{
                    w = i - st.peek() - 1;
                }

                int a = h*w;

                maxAr = Math.max(maxAr , a);
            }
            if(i<n) st.push(i);
        }
        return maxAr;
    }
    public int maximalRectangle(char[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int maxA = 0;
        int[][] pSum = new int[n][m];

        for(int j = 0; j<m; j++){
            int sum = 0;
            for(int i = 0; i<n; i++){
                if(mat[i][j] == '1') sum++;
                else sum = 0;
                pSum[i][j] = sum;
            }
        }
        for(int i =0; i<n; i++){
            maxA = Math.max(maxA,largestH(pSum[i]));
        }
        return maxA;
    }
}