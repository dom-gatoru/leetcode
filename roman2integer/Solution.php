<?php
class Solution {

    /**
     * @param String $s
     * @return Integer
     */
    function romanToInt($s) {
        $array = array(
            "I" => 1,
            "V" => 5,
            "X" => 10,
            "L" => 50,
            "C" => 100,
            "D" => 500,
            "M" => 1000
             );

        $char = str_split($s);
        $result = 0;

        for($i = 0; $i < count($char); $i++){
            
            if($i == count($char) -1){
                $result += $array[$char[$i]];
            } else if($array[$char[$i]] >= $array[$char[$i+1]]){
                $result += $array[$char[$i]];
            } else {
                $result += $array[$char[$i+1]] - $array[$char[$i]];
                $i++; 
            }
        }

        return $result;
    }
}