class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0) return false;

        StringBuffer sb = new StringBuffer(String.valueOf(x));
        if(String.valueOf(x).equals(sb.reverse().toString())){
            return true;
        } else {
            return false;
        }
    }

}