class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int max=0;
        int count_max=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]==1){
                count_max++;
            }else{
                max=Math.max(max,count_max);
                count_max=0;
            }
            j++;
        }
       return max=Math.max(max,count_max); 
    }
}