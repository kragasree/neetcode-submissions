class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            if (tokens[i].equals("+") || tokens[i].equals("-") ||
                tokens[i].equals("*") || tokens[i].equals("/")) {

                int n1 = Integer.parseInt(st.pop());
                int n2 = Integer.parseInt(st.pop());

                int res = 0;

                if (tokens[i].equals("+")) {
                    res = n2 + n1;
                } else if (tokens[i].equals("-")) {
                    res = n2 - n1;
                } else if (tokens[i].equals("*")) {
                    res = n2 * n1;
                } else {
                    res = n2 / n1;
                }

                st.push(String.valueOf(res));

            } else {
                st.push(tokens[i]);
            }
        }

        return Integer.parseInt(st.pop());
    }
}