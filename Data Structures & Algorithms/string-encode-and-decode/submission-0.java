class Solution {
  public String encode(List<String> strs) {
    StringBuilder sb = new StringBuilder();

    for (String s : strs) {
      sb.append(String.format("%03d", s.length()) + s);
    }

    return sb.toString();
  }

  public List<String> decode(String str) {
    ArrayList<String> words = new ArrayList<String>();
    int l = 0;
    int r = 0;

    while (l < str.length()) {
      Integer size = Integer.parseInt(str.substring(l, l + 3));
      l += 3;
      r = l + size;
      words.add(str.substring(l, r));
      l = r;
    }

    return words;
  }
}