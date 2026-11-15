class Solution {
  /**
   * @param {string[]} strs
   * @returns {string}
   */
  encode(strs: string[]): string {
    let encoded = "";

    for (const s of strs) {
      encoded += (s.length.toString().padStart(3, '0') + s);
    }

    return encoded;
  }

  /**
   * @param {string} str
   * @returns {string[]}
   */
  decode(str: string): string[] {
    if (str.length == 0) {
      return [];
    }

    let strs: string[] = [];
    let index = 0;
    
    do {
      let length = Number(str.substring(index, index + 3));
      let word = str.substring(index + 3, (index + 3 + (length)));

      strs.push(word);

      index += (length + 3);
    } while (index < str.length);

    return strs;
  }
}
