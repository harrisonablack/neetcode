class Solution {
  /**
   * @param {number[]} prices
   * @return {number}
   */
  maxProfit(prices: number[]): number {
    let l = 0;
    let r = 1;
    let m = 0;

    while (r < prices.length) {
      if (prices[l] < prices[r]) {
        let profit = prices[r] - prices[l]
        m = Math.max(m, profit)
      } else {
        l = r
      }
      r += 1
    }

    return m;
  }
}
