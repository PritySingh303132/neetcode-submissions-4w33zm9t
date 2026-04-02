class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length==0) return false ;
        Arrays.sort(nums);
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]==nums[i]){
                return true;
            }
            i++;
            nums[i]=nums[j];
        }
        return false;
    }
}