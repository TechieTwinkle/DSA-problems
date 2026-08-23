// Last updated: 23/08/2026, 22:44:15
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int [] candy = new int[n];
        Arrays.fill(candy,1); // every child gets atleast 1 candy

        // left to right;
        for(int i = 1; i < n;i++)
        {
            if(ratings[i] > ratings[i-1]) candy[i] = candy[i-1]+1;
        }

        // right to left
        for(int i = n-2;i>=0;i--)
        {
            if(ratings[i] > ratings[i+1]) candy[i] = Math.max(candy[i], candy[i+1]+1);
        }
        int total = 0;
        for(int ele:candy) total += ele;
        return total;

    }
}