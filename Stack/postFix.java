package forGit.Stack;
import java.util.*;
public class postFix {
    /* isEmpty(), isFull(), push(int) and int pop() functions available on Stack. */
    public static int evalPostfix(String exp) {
        // Write your code here
        Stack<Integer> s = new Stack<>();
         for(char ch : exp.toCharArray()){
            if(ch > '0' && ch <= '9'){
                s.push(ch - '0');
            }else{
                int val2 = s.pop();
                int val1 = s.pop();
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
        String s = "8425+-*";
        System.out.println(evalPostfix(s));

    }
}
