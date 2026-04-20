package forGit.Stack;

import java.util.Stack;

public class preFix {
        static int evalPrefix(String exp) {
            // Write your code here
            Stack<Integer> s = new Stack<>();
            for(int i=exp.length()-1; i>=0; i--){
                char ch = exp.charAt(i);
                if(ch > '0' && ch <= '9'){
                    s.push(ch - '0');
                }else{
                    int val1 = s.pop();
                    int val2 = s.pop();
                    if(ch == '+') s.push(val1+val2);
                    else if(ch == '-') s.push(val1-val2);
                    else if(ch == '*') s.push(val1*val2);
                    else if(ch == '/') s.push(val1/val2);
                    else s.push((int)Math.pow(val1,val2));
                }
            }
            return s.pop();
        }
    static void main(String[] args) {
        String s = "+-*235/^234";
        System.out.println(evalPrefix(s));

    }
}
