class Solution {
    public int romanToInt(String s) {
        Map map 
            = Map.of("I",Integer.valueOf(1), 
                     "V",Integer.valueOf(5), 
                     "X",Integer.valueOf(10),
                     "L",Integer.valueOf(50),
                     "C",Integer.valueOf(100),
                     "D",Integer.valueOf(500),
                     "M",Integer.valueOf(1000));

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