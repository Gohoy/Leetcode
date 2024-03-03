public class niuke_019 {
    public int findPeakElement (int[] nums) {
        // write code here
        if(nums.length >=2 && nums[0] > nums[1]) return 0;
        for(int i = 1 ;  i < nums.length-2 ; i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                return i;
            }
        }
        return nums.length-1;
    }
}
