class Solution {
  public int[] topKFrequent(int[] nums, int k) {

    HashMap<String, Integer> count = new HashMap<>();

    for (int i : nums) {
      String key = Integer.toString(i);
      if (count.containsKey(key)) {
        count.put(key, 1 + count.get(key));
      } else {
        count.put(key, 1);
      }
    }

    List<Integer> c = count.entrySet()
      .stream()
      .sorted(Map.Entry.comparingByValue())
      .map(e -> e.getKey())
      .map(s -> Integer.parseInt(s))
      .collect(Collectors.toList());

    Collections.reverse(c);

    return c.stream()
      .mapToInt(Integer::intValue)
      .limit(k)
      .toArray();
  }
}