class Solution {
  /**
   * @param {character[][]} board
   * @return {boolean}
   */
  isValidSudoku(board: string[][]): boolean {

    for (let i = 0; i < 9; i++) {
      if (this.checkSubset(board[i]) == false) {
        return false;
      }

      let subArr: string[] = [];

      for (let j = 0; j < 9; j++) {
        subArr.push(board[j][i]);
      }

      if (this.checkSubset(subArr) == false) {
        return false;
      }
    }

    for (let i = 0; i < 9; i += 3) {
      for (let j = 0; j < 9; j += 3) {
        let subArr: string[] = []

        for (let k = 0; k < 3; k++) {
          subArr.push(...board[i + k].slice(j, j + 3))
        }

        if (this.checkSubset(subArr) == false) {
          return false;
        }
      }
    }

    return true;
  }

  private checkSubset(sub: string[]): boolean {
    let c = new Set<string>();

    for (const s of sub) {
      if (s === ".") {
        continue;
      }

      if (c.has(s)) {
        return false;

      } else {
        c.add(s);
      }
    }

    return true;
  }
}
