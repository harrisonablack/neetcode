class Solution {
  /**
   * @param {number[]} nums
   * @return {number}
   */
  longestConsecutive(nums: number[]): number {
    const s = new Set<number>(nums);
    var max: number = 0;

    nums.forEach((v) => {
      // console.log(v);

      if (!s.has(v - 1)) {
        let c: number = 0; // count
        let n: number = v; // current number / index

        while (s.has(n)) {
          c++;
          n++;
        }

        max = Math.max(c, max);
      }
    });

    return max;
  }
}
