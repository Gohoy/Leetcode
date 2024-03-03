public class niuke_017 {

    public int search (int[] nums, int target) {
        if(nums.length == 0) return -1;
        // write code here
        int begin  = 0 ;
        int end = nums.length-1;
        while(begin <= end){
            int mid = (begin+end)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                begin ++;
            }else {
                end--;
            }
        }
        return -1;
    }

}

