class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map = new HashMap<>();
        int data[] = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            Integer key = target - nums[i];
            
            if(!map.containsKey(key)){
                map.put(new Integer(nums[i]), new Integer(i));
            } else {
                data[0] = i;
                data[1] = map.get(key);
                return data;
            }
        }
        return data;
    }
}