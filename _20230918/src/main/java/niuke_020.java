import java.util.Arrays;
import java.util.Collections;

public class niuke_020 {

    // 暴力算法，能ac 但是复杂度惨不忍睹
//    public int InversePairs (int[] nums) {
//        // write code here
//        if(nums.length == 2 && nums[0] > nums[1]) return 1%1000000007;
//        long count =0 ;
//        for(int i = 0 ; i < nums.length-1 ; i ++){
//            for(int j = i ; j < nums.length ; j ++){
//                if(nums[i] > nums[j]) {
//                    count ++;
//                }
//            }
//        }
//        return (int) (count%1000000007);
//    }

    //    归并
        public static int mod = 1000000007;
        public static int mergeSort(int left, int right, int [] data, int [] temp){
            //停止划分
            if(left >= right)
                return 0;
            //取中间
            int mid = (left + right) / 2;
            //左右划分合并
            int res = mergeSort(left, mid, data, temp) + mergeSort(mid + 1, right, data, temp);
            //防止溢出
            res %= mod;
            int i = left, j = mid + 1;
//            for(int k = left; k <= right; k++)
//                temp[k] = data[k];
//            for(int k = left; k <= right; k++){
//                if(i == mid + 1)
//                    data[k] = temp[j++];
//                else if(j == right + 1 || temp[i] <= temp[j])
//                    data[k] = temp[i++];
//                    //左边比右边大，答案增加
//                else{
//                    data[k] = temp[j++];
//                    // 统计逆序对
//                    res += mid - i + 1;
//                }
//            }
            for(int k = left; k <= right ; k ++){
                temp[k] = data[k];
            }
            for(int k = left; k <= right ; k++){
                if(i == mid-1) {
                    data[k] = temp[j++];
                }else if(j == right+1  || temp[i]<= temp[j]){
                    data[k] = temp[i++];
                }else {
                    data[k] = temp[j++];
                    res += mid+1-i;
                }
            }
            return res % mod;
        }
        public static int InversePairs(int [] array) {
            int n = array.length;
            int[] res = new int[n];
            return mergeSort(0, n - 1, array, res);
        }


    public static void main(String[] args) {
        int[] nums = new int []{1,2,3,4,5,6,7,0};
        System.out.println(InversePairs(nums));
    }
}
