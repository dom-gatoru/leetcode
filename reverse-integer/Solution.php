<?php
class Solution {

    /**
     * @param Integer $x
     * @return Integer
     */
    function reverse($x) {
        if($x === 0) return 0;

        // 絶対値
        $absX = abs($x);
        // 桁数
        $exp = strlen($absX);
        
        $output = 0;
        
        for($i = $exp -1; $i >= 0; $i--){
            $a = (int) ($absX * pow(10, -$i));
            $output += $a * pow(10, $exp-1-$i);
            $absX = $absX - $a * pow(10, $i);
            
            unset($a);
        }
        
        if($x < 0){
            $output = -$output;
        }

        if($output >= -2147483648 && $output <= 2147483647) {
            return intval($output);
        } else {
            return 0;
        }
    }
}