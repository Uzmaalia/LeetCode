class Solution {
    public String removeOuterParentheses(String s) {
        int count = 1;
        int x = 1;
        String ans = new String();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }
            else{
                count--;
            }
            if(count==1){
                ans = ans+s.substring(x,i);
                x=i+2;
            }
        }
        return ans;
    }
}