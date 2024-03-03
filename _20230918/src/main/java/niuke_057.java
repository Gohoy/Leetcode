/**
 * @version V1.0
 * @description:
 * @author: gohoy
 * @date: 2024/2/26
 */
public class niuke_057 {
     class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         * 判断岛屿数量
         * @param grid char字符型二维数组
         * @return int整型
         */

        // 有bug，但
        // 1001
        // 1111 这种情况导致我得到的结果偏多，
//        public static int solve (char[][] grid) {
//            // write code here
//            // bfs
//            int count = 0;
//            for(int j = 0 ; j < grid.length  ; j ++){
//                char[] chars = grid[j];
//                for(int i = 0 ; i < chars.length; i ++){
//                    // 这里进行判断有没有岛
//                    // 首先判断 一行中 自己是1  并且 左边没有1 ， 并且这一横排连着的1 没有和上面的1 有联系。
//                    if(chars[i] == '1' && (i == 0 || chars[i-1] == '0') && (j == 0 || valid(grid[j-1],grid[j],i))){
//                        count++;
//                    }
//                }
//            }
//            return count;
//        }
//        public static boolean valid(char[] top , char[] cur, int i ){
//            // 要防止 01111
//            //       10001 的情况
//            // 1001
//            // 1111 这种情况导致我得到的结果偏多，
//            int i1 = i;
//            for ( ; i1 < cur.length; i1++) {
//                if(cur[i1] == '0'){
//                    // 从i 到 i1 都是1
//                    break;
//                }
//
//            }
//            for( ; i < i1 ; i ++){
//                if(top[i] == '1') return false;
//            }
//            return true;
//        }
//    }
//


        public static int solve (char[][] grid) {

            //使用bfs 或者dfs， 遇到1 计数加1 ，但是把所有它相邻的1 全部置为0

            int count = 0;

            for(int i = 0 ; i < grid.length ; i ++){
                for(int j = 0 ; j < grid[i].length ; j++){
                    if(grid[i][j] == '1'){
                        count++;
                        bfs(grid,i,j);
                    }
                }
            }
            return count;
        }
        public static  void  bfs (char[][] grid, int i, int j){
            grid[i][j] = '0';
            if(i > 0 && grid[i-1][j] == '1'){
                bfs(grid,i-1 , j);
            }
            if(i < grid.length-1 && grid[i+1][j] == '1'){
                bfs(grid,i+1 , j);
            }
            if(j > 0 && grid[i][j-1] == '1'){
                bfs(grid,i , j-1);
            }
            if(j < grid[i].length-1 && grid[i][j+1] == '1'){
                bfs(grid,i , j+1);
            }
        }


     }
    public static void main(String[] args) {

        char[][] grid = {
                { '1', '1', '0', '0', '0' },
                { '0', '1', '0', '1', '1' },
                { '0', '0', '0', '1', '1' },
                { '0', '0', '0', '0', '0' },
                { '0', '0', '1', '1', '1' }
        };
        int solve = Solution.solve(grid);
        System.out.println(solve);
    }

}
