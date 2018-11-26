package sort;

/**
 * @author whg
 */
public class InsertSort {
    public static void main(String[] args) {
        int [] arr={3,44,38,5,47,15,36};
        for(int i=1;i<arr.length;i++){
            //此时对每个元素进行判断，如果比前面一个元素小，则交换位置
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for (int arrIndividual : arr) {
            System.out.print(arrIndividual+" ");
        }
    }
}
