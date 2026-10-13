class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ns = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                ns.append(Character.toLowerCase(c));
            }
        }

        String n = ns.toString();

        return n.equals(ns.reverse().toString());
    }
}