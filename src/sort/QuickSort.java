package sort;

/**
 * @author whg
 */
public class QuickSort {
    public static String quickSort(String array){
        String []buffer = array.split(" ");
        if(buffer.length< 2){
            return array;
        }
        else{
            int pivot = Integer.valueOf(buffer[0]);
            String less="";
            String greter="";

            for(int i=1;i<buffer.length;i++){
                if(Integer.valueOf(buffer[i])<= pivot){
                    less = less + buffer[i]+" ";
                }else {
                    greter = greter + buffer[i]+" ";
                }
            }
            less = less.trim();
            greter = greter.trim();
            return quickSort(less)+" "+array.split(" ")[0]+" "+quickSort(greter);
        }
    }
    public static void main(String[] args) {
        String arrString="3 44 38 5 47 15 36 1 4";
        System.out.println(quickSort(arrString));
    }
}
