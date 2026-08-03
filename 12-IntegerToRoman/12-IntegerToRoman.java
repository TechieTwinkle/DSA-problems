// Last updated: 04/08/2026, 01:39:13
import java.lang.StringBuilder;
class Solution {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        //StringBuilder sb = new StringBuilder();
        String s="";
        for (int i = 0; i < values.length; i++){
            while (num >= values[i]){
                num -= values[i];
                s+=symbols[i];
            }
        }
        return s;

    }
}