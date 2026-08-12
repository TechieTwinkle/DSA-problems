// Last updated: 12/08/2026, 22:27:13
class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch == '(') st.push(i); 
            else{
                if(ch == ')'){
                    if(!st.isEmpty()){
                        st.pop();
                    }else{
                        sb.setCharAt(i,'*');
                    }
                }
            }
        }
        while(!st.isEmpty()){
            int ind = st.pop();
            sb.setCharAt(ind,'*');
        }

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i<sb.length(); i++){
            if(sb.charAt(i) != '*'){
                ans.append(sb.charAt(i));
            }
        }

        return ans.toString();
    }
}