package sort;

/**
 * @author whg
 */
public class BubbleSort{
    public static void main(String[] args) {
        int [] arr={3,44,38,5,47,15,36};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                int temp;
                if(arr[j]>=arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int arrIndividual : arr) {
            System.out.print(arrIndividual+" ");
        }
    }
}
