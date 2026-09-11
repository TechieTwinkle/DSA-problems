// Last updated: 11/09/2026, 23:53:38
class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i <digits.length; i++){
            if(digits[i] == 0) continue; // if equal to 0 continue
            for(int j = 0; j<digits.length; j++){
                if(i==j) continue; // i ager equal to j continue
                for(int k = 0; k<digits.length; k++){
                    if(k == j || k == i) continue;
                   if(digits[k] % 2 != 0) continue; // not even continue
                   int num = digits[i]*100 + digits[j]*10 + digits[k];
                   set.add(num);
                }
            }
        }
        return set.size();
    }
}