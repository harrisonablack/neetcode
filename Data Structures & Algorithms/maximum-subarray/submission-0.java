class Solution {

  /**
   * Kadanes Algorithm
   */
  public int maxSubArray(int[] nums) {
    int t = nums[0];
    int m = nums[0];

    for (int i = 1; i < nums.length; ++i) {
      t = Math.max(nums[i], t + nums[i]);
      m = Math.max(m, t);
    }

    return m;
  }
}