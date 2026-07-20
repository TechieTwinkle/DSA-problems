package forGit.DynamicProgramming;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int ele : prices) {
            if (min > ele) {
                min = ele;
            } else {
                max = Math.max(max, ele - min);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + obj.maxProfit(prices1));

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Maximum Profit: " + obj.maxProfit(prices2));
    }
}