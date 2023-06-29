package hard4;

import java.util.ArrayList;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        if(l1+l2 == 0){
            return 0;
        }
        int [] sum = new int[l1+l2];
        int i = 0 ,j = 0;
        int index = 0;
        while (i!=l1 || j!=l2){
            if(i == l1){
                sum[index] = nums2[j];
                j++;
                index++;
            }else if(j==l2){
                sum[index] = nums1[i];
                i++;
                index++;
            }else
            if(nums1[i]<nums2[j]){
                sum[index]=nums1[i];
                i++;
                index++;
            }else {
                sum[index]=nums2[j];
                index++;
                j++;
            }

        }
        if(index%2==0 ){
            return (sum[index/2]+sum[index/2-1])/2.0;
        }

        return sum[index/2];
    }
}