class Solution {
    public int maxScore(int[] nums, int k) {
        int lsum =0, rsum=0, maxsum=0;
        for(int i=0; i<k; i++){
            lsum= lsum + nums[i];
            maxsum = lsum;

        }
        int rindex = nums.length-1;
        for( int i=k-1; i>=0; i--){
            lsum = lsum- nums[i];
            rsum = rsum + nums[rindex];
            rindex--;
            maxsum = Math.max( maxsum , lsum +rsum );

        }
        return maxsum;
        
    }
}