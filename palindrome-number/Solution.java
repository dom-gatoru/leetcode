class Solution {
    public boolean isPalindrome(int x) {
        
        StringBuffer sb = new StringBuffer(String.valueOf(x));
        if(String.valueOf(x).equals(sb.reverse().toString())){
            return true;
        } else {
            return false;
        }
    }
}