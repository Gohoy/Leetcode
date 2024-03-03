public class Order {
//    public void quickOrder(int[] array) {
//        int medium = array[array.length / 2];
//        int index = array.length / 2;
//        for (int i = 0; i < array.length / 2; i++) {
//            if (medium < array[i]) {
//                int temp = array[i];
//                array[i] = medium;
//                medium = temp;
//                index = i;
//            }
//        }
//
//        for (int i =)
//    }


    public static int[] bubbleSort(int[] arr) {
        for(int i = 1 ; i < arr.length ; i ++){
            boolean flag = true;
            for( int j = 0 ; j < arr.length ; j ++){
                if(arr[i] < arr[j]){
                   int temp =  arr[j];
                   arr[j] = arr[i];
                   arr[i] = temp;
                   flag = false;
                }
            }
            if(flag){
                break;
            }
        }
        return arr;
    }
    public static int[] selectionSort(int[] array){
        for(int i = 0; i < array.length ; i ++){
            int minIndex = i;
            for(int j = i ; j < array.length ; j ++){
                if(array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            int  temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
public static int[]  insertionSort(int[] array ){
        for(int i = 1 ; i < array.length ; i ++){
            for(int j = i ; j > 0 ; j --){
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
}

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 5;
        arr[4] = 4;
        int[] ints = insertionSort(arr);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}