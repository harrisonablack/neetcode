class Solution {
    hasDuplicate(nums: number[]): boolean {
        const vals = new Set<number>(nums);

        if (vals.size < nums.length) {
            return true;
        } else {
            return false;
        }
    }
}