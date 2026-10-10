class Solution {
    public int[] twoSum(int[] nums, int target) {

    HashMap<Integer, Integer> v = new HashMap<>();

    for (int i = 0; i < nums.length; ++i) {
      v.put(nums[i], i);
    }

    for (int i = 0; i < nums.length; ++i) {
      int diff = target - nums[i];

      if (v.containsKey(diff) && v.get(diff) != i) {
        return new int[] {i, v.get(diff)};
      }
      
    }

    return new int[]{};
  }
}
