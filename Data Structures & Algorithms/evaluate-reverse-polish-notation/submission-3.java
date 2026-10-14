class Solution {
  public int evalRPN(String[] tokens) {
    Stack<Integer> vals = new Stack<Integer>();

    for (String s : tokens) {
      if (Character.isDigit(s.charAt(0)) || s.length() > 1) {
        vals.add(Integer.parseInt(s));
      } else {
        int b = vals.pop();
        int a = vals.pop();

        int res = performOperation(a, b, s.charAt(0));
        vals.add(res);
      }
    }

    return vals.pop();
  }

  int performOperation(int a, int b, char operation) {
    return switch (operation) {
      case '+' -> a + b;
      case '*' -> a * b;
      case '-' -> a - b;
      case '/' -> a / b;
      default -> 0;
    };
  }
}