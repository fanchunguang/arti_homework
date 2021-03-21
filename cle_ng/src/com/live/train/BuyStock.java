package com.live.train;

/**
 * 买股票问题
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）
 * 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票)
 */
public class BuyStock {
    /**
     * 求股票价值  a[ri]-a[li]=(a[ri]−a[ri−1])+(a[ri−1]−a[ri−2])+…+(a[li+1]−a[li])
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int ans = 0;
        int n = prices.length;
        for (int i = 1; i < n; ++i) {
            ans += Math.max(0, prices[i] - prices[i - 1]);
        }
        return ans;
    }
}
