class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        Integer maxLength = 0;

        for (int i : nums) {
            set.add(Integer.valueOf(i));
        }

        // Integer is the start of a sequence if i-1 does not exist in the sequence

        for (int i : nums) {
            if (!set.contains(Integer.valueOf(i) - 1)) {
                int l = 0;
                int j = i;

                do {
                    l++;
                } while (set.contains(j += 1));

                if (l > maxLength) {
                    maxLength = l;
                }
            }
        }

        return maxLength;
    }
}
