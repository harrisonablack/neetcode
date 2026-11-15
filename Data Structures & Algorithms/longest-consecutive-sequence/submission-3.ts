class Solution {
  /**
   * @param {number[]} nums
   * @return {number}
   */
  longestConsecutive(nums: number[]): number {
    const values = new Set(nums);
    let longest = 0;

    for (const value of values) {
      if (values.has(value - 1)) continue;

      let current = value;
      let length = 0;

      while (values.has(current)) {
        length++;
        current++;
      }

      longest = Math.max(longest, length);
    }

    return longest;
  }
}
