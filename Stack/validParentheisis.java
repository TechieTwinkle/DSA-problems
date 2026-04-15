package forGit.Stack;
import java.util.*;

public class validParentheisis {
    public static boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        char [] arr = s.toCharArray();
        for(char ch : arr){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;
                char top = st.pop();
                if(ch == ')' && top!='(' ||
                        ch == '}' && top!='{' ||
                        ch == ']' && top!='[')
                {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    static void main(String[] args) {
        String s = "({[]})";
        System.out.print(isValid(s));
    }

}
