class Solution {
    public String removeDuplicates(String s) {
        //tc-->O(n)

        Stack<Character> st = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(!st.isEmpty() && st.peek()==c)
            st.pop();
            else
            st.push(c);
        }
        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty())
        sb.append(st.pop());

        return sb.reverse().toString();

        
    }
}