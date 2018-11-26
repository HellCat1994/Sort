package sort;
/**
 * @author whg
 */
public class SelectSort {
    public static void main(String[] args) {
        int [] arr={3,44,38,5,47,15,36};
        for(int i=0;i<arr.length-1;i++){
            int minValue=arr[i];
            int index = 0;
            for(int j=i+1;j<arr.length;j++){
                if(minValue>=arr[j]){
                    minValue = arr[j];
                    index = j;
                }
            }
            int temp;
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int arrIndividual : arr) {
            System.out.print(arrIndividual+" ");
        }
    }
}
