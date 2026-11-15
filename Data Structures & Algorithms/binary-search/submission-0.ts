class Solution {
  /**
   * @param {number[]} nums
   * @param {number} target
   * @return {number}
   */
  search(nums: number[], target: number): number {
    let low: number = 0;
    let high: number = nums.length - 1;

    while (low <= high) {
      let mid = Math.floor(low + (high - low) / 2);

      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return -1;
  }
}
