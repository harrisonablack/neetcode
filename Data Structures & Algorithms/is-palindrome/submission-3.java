class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll(" ", "");
        s = s.toLowerCase();
        s = s.chars()
                .filter(c -> Character.isLetterOrDigit(c))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        if (s.length() == 0 || s.length() == 1) {
            return true;
        }

        System.out.println(s);

        int l = 0;
        int r = s.length() - 1;

        char[] c = s.toCharArray();

        do {
            System.out.println("l: " + l + "r: " + r);
            if (c[l] != c[r]) {
                return false;
            }

            l++;
            r--;

        } while (l < r);

        return true;
    }
}