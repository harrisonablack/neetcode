class Solution {
  public int maxArea(int[] heights) {
    int l = 0;
    int r = heights.length - 1;
    int max = 0;

    do {
      int a = (r-l) * Math.min(heights[l],heights[r]);
      if (a > max) {
        max = a;
      }

      if (heights[l] <= heights[r]) {
        l++;
      } else {
        r--;
      }
    } while (l < r);

    return max;
  }
}