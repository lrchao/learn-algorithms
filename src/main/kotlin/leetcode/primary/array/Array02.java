package leetcode.primary.array;

public class Array02 {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 4, 5, 3, 6, 4};

        int maxProfit = maxProfit(prices);
        System.out.print("maxProfit=" + maxProfit);
    }

    private static int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }
}

