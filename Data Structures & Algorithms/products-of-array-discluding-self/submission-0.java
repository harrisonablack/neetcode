
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // return, prefix, suffix
        int[] r = new int[nums.length];
        int[] p = new int[nums.length];
        int[] s = new int[nums.length];

        s[nums.length - 2] = nums[nums.length - 1];
        for (int i = nums.length - 3; i >= 0; --i) {
            s[i] = s[i + 1] * nums[i + 1];
        }

        p[1] = nums[0];
        for (int i = 2; i < nums.length; ++i) {
            p[i] = p[i - 1] * nums[i - 1];
        }

        r[0] = s[0];
        r[nums.length - 1] = p[nums.length - 1];

        for (int i = 1; i < nums.length - 1; ++i) {
            r[i] = s[i] * p[i];
        }

        return r;
    }
}