class SolutionStringReverse {
    public int reverse(int x) {
        
        if(x == 0) return 0;

        StringBuffer absX = new StringBuffer(String.valueOf(java.lang.Math.abs(x)));
        String outputStr;
        if(x > 0){
            outputStr = absX.reverse().toString();
        } else {
            outputStr = "-" + absX.reverse().toString();
        }

        try{
            return Integer.parseInt(outputStr);
        } catch(Exception e){
            return 0;
        }
    }
}