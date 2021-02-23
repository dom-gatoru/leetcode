<?php
class SolutionStringReverse {

    /**
     * @param Integer $x
     * @return Integer
     */
    function reverse($x) {
        
        if($x === 0) return 0;

        $absX = abs($x);

        if($x < 0){
            $output = "-".strrev(strval($absX));
        } else {
            $output = strrev(strval($absX));
        }

        if($output >= -2147483648 && $output <= 2147483647) {
            return intval($output);
        } else {
            return 0;
        }

    }
}