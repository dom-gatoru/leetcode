class Solution {
    public int reverse(int x) {
        
        long output = 0;
        boolean minusFlag = false;
        
        if(x == 0){
           return 0;  
        } else if (x < 0){
            minusFlag = true;
        }

        int exponentiation = String.valueOf(java.lang.Math.abs(x)).length();
        int absX = java.lang.Math.abs(x);
        
        for(int i = exponentiation-1; i >= 0; i--){
            
            int a = (int)(absX * java.lang.Math.pow(10, -i));
            output += (long)(a * java.lang.Math.pow(10, exponentiation-1-i));
            
            absX -= (int)(a * java.lang.Math.pow(10, i));                
        }

        if(minusFlag) output = -output;

        if(Integer.MIN_VALUE <= output && output <= Integer.MAX_VALUE){
            return (int) output;            
        } else {
            return 0;
        }
    }
}