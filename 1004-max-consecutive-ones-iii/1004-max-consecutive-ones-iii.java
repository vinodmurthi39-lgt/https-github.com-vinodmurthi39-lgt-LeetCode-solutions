class Solution {
    public int longestOnes(int[] nums, int k) {
       int n=nums.length;
       int left=0;
       int count_zero=0;
       int maxlength=0;
            for(int right=0;right<n;right++){
                 
                if(nums[right]==0){
                
                    count_zero =count_zero+1;
                }
                while(count_zero>k){
                    if(nums[left]==0){
                        count_zero--;
                    }
                    left++;
                }
               maxlength=Math.max(maxlength,right-left+1);
            }

         return maxlength;     
    }
}