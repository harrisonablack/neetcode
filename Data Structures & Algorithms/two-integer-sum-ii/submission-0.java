class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int l = 0;
        int r = numbers.length - 1;

        do {
            int c = numbers[l] + numbers[r];

            if (c == target) {
                return new int[] {l + 1, r + 1};
            } else if (c < target) {
                ++l;
            } else if (c > target) {
                --r;
            }

        } while (l < r);

        return res;
    }
}