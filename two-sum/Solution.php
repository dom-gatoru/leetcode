<?php
class Solution {

    /**
     * @param Integer[] $nums
     * @param Integer $target
     * @return Integer[]
     */
     function towSum($nums, $target) {

        $array = array();
        
        foreach ($nums as $index => $num) {
            $key = $target - $num;

            if(!array_key_exists($key, $nums)){
                $array[$num] = $index;
            } else {
                return [$index, $array[$key]];
            }
        }

     }
}