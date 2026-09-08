// Last updated: 08/09/2026, 21:29:46
class StockSpanner {
    Stack<int[]> st;
    int ind;
    public StockSpanner() {
       st = new Stack<>(); 
       ind = -1;
    }
    
    public int next(int price) {
       ind++;
       while(!st.isEmpty() && st.peek()[0] <= price){
            st.pop();
       }
       int cnt;
       if(st.isEmpty()){
        cnt = ind - (-1);
       }else{
        cnt = ind - st.peek()[1];
       }
       st.push(new int[]{price, ind});
       return cnt; 
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */