class Solution {
    public int[] twoSum(int[] nums, int target) {
    int o[] = {0,0};
    for(int i = 0; i<nums.length; i++){
    for(int j= 0; j<nums.length;j++){
        if(i!=j){
    if(nums[i]+nums[j]==target){
        System.out.println("i="+i+"j="+j);
        o[0] = i;
        o[1] = j;
    }
    }
    }}
    return o;
    
     }
 }
