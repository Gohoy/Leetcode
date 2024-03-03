/**
 * @version V1.0
 * @description:
 * @author: gohoy
 * @date: 2024/2/27
 */
public class niuke_064 {
    public int minCostClimbingStairs (int[] cost) {
        // write code here
        // 贪心获取可以得到最优解
        // 可以从0 或者1 开始选择 跳 1层或者2 层
        //  1 2 3 4 5   最远能到4 ， 最少到3  ，查看2 到4中最小的一个，然后和
        // 2 只有第一步在1 才能跳到，  4 只有第一步在2 才能跳到，
        // 3 都可以达到， 看 1  和 2 那个小

    }
    public  int help(int[] cost , int i ){
        if(i  == cost.length-1 ){
            return cost[cost.length-1];
        }
        if(i == cost.length - 2){
            return cost[cost.length-1];
        }
        // 剩下的情况
        int curCost = 0;
        //  走一步
        curCost += cost[i+1];
        //  走两步

    }
}
