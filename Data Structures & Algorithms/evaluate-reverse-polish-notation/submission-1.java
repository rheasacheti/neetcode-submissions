class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+")) {
                numbers.push(numbers.pop() + numbers.pop());
            } else if (token.equals("*")) {
                numbers.push(numbers.pop() * numbers.pop());
            } else if (token.equals("-")) {
                numbers.push((numbers.pop() - numbers.pop()) * (-1));
            } else if (token.equals("/")) {
                int a = numbers.pop();
                int b = numbers.pop();
                numbers.push(b / a);
            } else {
                numbers.push(Integer.parseInt(token));
            }
        }
        return numbers.pop();
    }
}
