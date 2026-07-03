package forGit.Strings;

import java.util.*;

public class reverseWords {

    public String reverse(String s) {
        s = s.trim();
        String[] arr = s.split("\\s+");

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            String st = arr[i];
            arr[i] = arr[j];
            arr[j] = st;
            i++;
            j--;
        }

        return String.join(" ", arr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        reverseWords obj = new reverseWords();

        String ans = obj.reverse(s);

        System.out.println("Reversed Words: " + ans);

        sc.close();
    }
}