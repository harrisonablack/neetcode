class Solution {
  /**
   * @param {string} s
   * @param {string} t
   * @return {boolean}
   */
  isAnagram(s: string, t: string): boolean {

    const a: string = s
      .split("")
      .sort((a, b) => a.localeCompare(b))
      .join("");

    const b: string = t
      .split("")
      .sort((a, b) => a.localeCompare(b))
      .join("");

    if (a != b) {
      return false;
    } else {
      return true;
    }
  }
}
