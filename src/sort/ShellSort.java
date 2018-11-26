package sort;

/**
 * @author whg
 */
public class ShellSort {
    public static void main(String[] args) {
        /**
         * 数组中共有10个元素
         */
        int [] arr={59,40,87,14,34,7,91,88,82,28,1,100};
        /**
         * arrayGap：为增量，根据长度/2
         */

        for(int arrayGap = arr.length/2;arrayGap>0;arrayGap/=2){
            /**
             * 此时根据增量分出了n个序列出来
             */
            for(int arrayCnt=0;arrayCnt<arrayGap;arrayCnt++){
                /**
                 * 对每个序列进行插入排序
                 */
                for(int index = arrayCnt+arrayGap;index<arr.length;index = index + arrayGap) {
                    while(index>=arrayGap && arr[index]<arr[index-arrayGap]){
                        int temp = arr[index];
                        arr[index] = arr[index-arrayGap];
                        arr[index-arrayGap] = temp;
                        index = index - arrayGap;

                    }
                }
            }
        }
        for (int arrIndividual : arr) {
            System.out.print(arrIndividual+" ");
        }
    }

}
