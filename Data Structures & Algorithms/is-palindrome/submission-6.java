class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        s = sb.toString();

        if (s.length() == 0 || s.length() == 1) {
            return true;
        }

        System.out.println(s);

        int l = 0;
        int r = s.length() - 1;

        do {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }

            l++;
            r--;

        } while (l < r);

        return true;
    }
}