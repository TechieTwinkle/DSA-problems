// Last updated: 13/08/2026, 18:51:12
class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxA = 0;
        Stack<Integer> st = new Stack<>();
        for(int i =0; i<=n ; i++){
            int currH;
            if(i==n) currH = 0;
            else currH = heights[i];
            
            while(!st.isEmpty() && heights[st.peek()] > currH){
                int h = heights[st.pop()];

                int w;
                if(st.isEmpty()){
                    w = i;
                }else{
                    w = i - st.peek() - 1;
                }
                int a = h*w;

                maxA = Math.max(maxA,a);
            }
            if(i<n) st.push(i);
        }
        return maxA;
    }
}