class Solution {
    public int[] twoSum(int[] nums, int target) {
        //create a map and add each element in array with its index as a key
        Map<Integer,Integer> map = new HashMap(); 
       for(int i=0 ; i<nums.length; i++ ){
           map.put(nums[i],i);   
       }
        for(int i=0 ; i<nums.length; i++ ){ 
            //calculate the sum - the element and check if that element is there in the hash map
        if(map.containsKey(target - nums[i]) && map.get(target - nums[i])!= i)
            return new int[] {i,map.get(target - nums[i])};
    }
        throw new IllegalArgumentException("No Solution found");
 }
}
