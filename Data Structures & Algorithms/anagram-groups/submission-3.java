class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {

    String a = "abcdefghijklmnopqrstuvwxyz";
    HashMap<List<Integer>, ArrayList<String>> map = new HashMap<>();

    for (String s : strs) {
      Integer[] nums = new Integer[26];
      for (Character c : s.toCharArray()) {
        Integer i = a.indexOf(c);

        if (nums[i] == null) {
          nums[i] = 1;
        } else {
          nums[i]++;
        }
      }

      if (!map.containsKey(Arrays.asList(nums))) {
        ArrayList<String> anagram = new ArrayList<>();
        anagram.add(s);
        map.put(Arrays.asList(nums), anagram);
      } else {
        map.get(Arrays.asList(nums)).add(s);
      }
    }

    return map.entrySet()
        .stream()
        .map(e -> e.getValue())
        .collect(Collectors.toList());
  }
}