/**
 * @version V1.0
 * @description:
 * @author: gohoy
 * @date: 2024/2/27
 */
public class niuke_061 {
    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         * 递增路径的最大长度
         * @param matrix int整型二维数组 描述矩阵的每个数
         * @return int整型
         */
        public static int longest = 0;
        public int solve (int[][] matrix) {
            // write code here
            int res = 0;
            for(int i = 0 ; i < matrix.length ; i ++){
                for(int j = 0 ;  j < matrix.length;  j ++){
                    longest = Math.max(longest, help(matrix,-1,i,j));
                }
            }
            return longest;
        }
        public int help (int [][] matrix,int pre,int i1,int j1){
            // 采取从左上向右下的遍历
            // 全局变量存储目前最长递增子序列
            // i j 为上一个状态的元素索引， i1 j1 为当前索引
            int currentLength = 0 ;
            if(matrix[i1][j1] > pre){

                if(i1 < matrix.length-1){
                    currentLength = Math.max(currentLength,help(matrix,matrix[i1][j1],i1+1,j1));
                }
                if(j1 < matrix[i1].length-1){
                    currentLength = Math.max(currentLength,help(matrix,matrix[i1][j1],i1,j1+1));
                }
                if(i1 > 0){
                    currentLength = Math.max(currentLength,help(matrix,matrix[i1][j1],i1-1,j1));
                }
                if(j1 > 0){
                    currentLength = Math.max(currentLength,help(matrix,matrix[i1][j1],i1,j1-1));
                }
            }else {
                return 0;
            }
            return currentLength + 1 ;
        }


    }

}
