public class niuke_021 {
    //暴力,也快。
//    public int minNumberInRotateArray (int[] nums) {
//        // write code here
//
//        for(int i = 0 ; i < nums.length-1 ; i++){
//            if(nums[i] > nums[i+1]){
//                return nums[i+1];
//            }
//        }
//        return nums[0];
//    }
    // 二分 还不如之间遍历
    public int minNumberInRotateArray (int[] nums) {
        // write code here
        return mergeSort(0 , nums.length-1 , nums);
    }
    public int mergeSort ( int left , int right , int[] nums){
        if(left >= right) return nums[left];
        int mid = (left + right)/2;
        int leftRes = mergeSort(left,mid,nums);
        int rightRes = mergeSort(mid+1 , right, nums);
        return  Math.min(leftRes, rightRes);
    }

    // 破案了，暴力遍历最快
}
