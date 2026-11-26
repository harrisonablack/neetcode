class Solution {
  /**
   * @param {string} s
   * @return {number}
   */
  lengthOfLongestSubstring(s: string): number {
    let m = 0 // Max
    let c: string = "" // Current String

    for (let i = 0; i < s.length; i++) {
      if (!c.includes(s.charAt(i))) {
        c += s.charAt(i)
      } else {
        c = c.substring(c.lastIndexOf(s.charAt(i)) + 1, c.length) + s.charAt(i)
      }

      m = Math.max(m, c.length)
    }

    return m
  }
}
