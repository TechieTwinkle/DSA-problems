// Last updated: 11/08/2026, 15:02:43
class Solution {
    public int countPrimes(int n) {
        //simple approach

        // int cnt = 0;
        // if(n<2) return 0;
        // for(int i = 2; i<n; i++){
        //     boolean prime = true;
        //     for(int j = 2; j*j<=i; j++){
        //         if(i%j == 0) {
        //             prime = false;
        //             break;
        //         }
        //     }
        //     if(prime) cnt++;
        // }
        // return cnt;


        //optimal approch

        int cnt = 0;
        boolean[] comp = new boolean[n];

        for(int i = 2; i<n; i++){
            comp[i] = true;
        }
        for(int i = 2; i*i<n;i++){
            if(comp[i]){
                for(int j = i*i; j<n; j+=i){
                    comp[j] = false;
                }
            }
        }
        
        for(int i = 2; i<n; i++){
            if(comp[i]) cnt++;
        }

        return cnt;
    }
}