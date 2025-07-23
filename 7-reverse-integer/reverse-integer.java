class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x!=0){
            int ld= x%10;
            x = x/10;
            // Check for overflow
            
            if(rev > 0 && rev > (Integer.MAX_VALUE - ld) / 10 || (rev < 0 && rev < (Integer.MIN_VALUE - ld) / 10 ))
            return 0;
            rev = (rev*10)+ld;

        }
        return rev;
    }
}