public class niuke_018 {
    // 从左下角开始，小于target则右移，大于target 则上移
//    public static boolean Find (int target, int[][] array) {
//        int i = array.length-1 ;
//        int j = 0;
//        while(j<=array[0].length-1 && i >= 0){
//            if(array[i][j] == target){
//                return true;
//            }
//            else if(array[i][j] >target){
//                i --;
//            }else {
//                j ++;
//            }
//        }
//        return false;
//    }

    // 每一行遍历
    public static boolean Find (int target, int[][] array) {
        for(int i =0 ; i < array.length ; i ++){
            for(int j = array[0].length - 1 ; j >= 0; j --){
                if(array[i][j] == target){
                    return true;
                }else if(array[i][j] < target){
                    break;
                }else  if(j == 0 && array[i][j] > target){
                    return false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] array= new int[][]{{1,1}};
        boolean find = Find(2, array);
        System.out.println(find);
    }
}
