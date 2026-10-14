class Solution {
  public boolean isValid(String s) {
    Stack<Character> st = new Stack<Character>();

    for (Character c : s.toCharArray()) {
      if (isOpen(c)) {
        st.push(c);
      } else {
        if (st.isEmpty()) {
          return false;
        }

        if (isMatchingClose(st.peek(), c)) {
          st.pop();
        } else {
          return false;
        }
      }
    }

    if (!st.isEmpty()) {
      return false;
    }

    return true;
  }

  boolean isOpen(Character c) {
    if (c == '{' || c == '[' || c == '(') {
      return true;
    } else {
      return false;
    }
  }

  boolean isMatchingClose(Character open, Character close) {
    if (open == '(' && close == ')') {
      return true;
    } else if (open == '{' && close == '}') {
      return true;
    } else if (open == '[' && close == ']') {
      return true;
    } else {
      return false;
    }
  }
}