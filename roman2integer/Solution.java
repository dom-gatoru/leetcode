class Solution {
    public int romanToInt(String s) {
        Map map 
            = Map.of("I",new Integer(1), 
                     "V",new Integer(5), 
                     "X",new Integer(10),
                     "L",new Integer(50),
                     "C",new Integer(100),
                     "D",new Integer(500),
                     "M",new Integer(1000));

        char[] ch = s.toCharArray();
        int result = 0;

        for(int i = 0; i < ch.length; i++){
            
            if(i == ch.length -1){
                result += (int) map.get(String.valueOf(ch[i]));
            } else if((int) map.get(String.valueOf(ch[i])) >= (int) map.get(String.valueOf(ch[i+1]))){
                result += (int) map.get(String.valueOf(ch[i]));
            } else {
                result += (int) map.get(String.valueOf(ch[i+1])) - (int) map.get(String.valueOf(ch[i]));
                i++; 
            }
        }

        return result; 
    }
}