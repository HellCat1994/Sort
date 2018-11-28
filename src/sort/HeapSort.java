package sort;

import java.util.ArrayList;

public class HeapSort {

    public static ArrayList<Integer> arrayList = new ArrayList<Integer>();
    /**
     * 返回当前节点的右孩子节点索引
     * @param index
     * @return
     */
    public static int rightChild(int index){
        return index*2+2;
    }
    /**
     * 返回当前节点的左孩子索引
     * @param index
     * @return
     */
    public static int leftChild(int index){
        return index*2+1;
    }

    /**
     * 返回当前节点的父亲节点索引
     * @param index
     * @return
     */
    public static int parent(int index){
        return (index-1)/2;
    }
    /**
     * 添加元素
     * @param e
     */
    public static void add(Integer e){
        /**
         * 添加新元素
         * 并将新元素实行上浮操作
         */
        arrayList.add(e);
        shiftUp(arrayList.size()-1);
    }

    /**
     * 元素上浮
     * @param k
     */
    public static void shiftUp(int k){
        /**
         * 两个判断条件：
         * 1.如果到达最上面的节点则停止
         * 2.如果子节点一直比父亲节点大，则不停上浮
         */
        while(k > 0 && arrayList.get(parent(k)).compareTo(arrayList.get(k))<0){
            /**
             * 交换元素
             */
            Integer kValue = arrayList.get(k);
            Integer parentValue = arrayList.get(parent(k));
            arrayList.set(k,parentValue);
            arrayList.set(parent(k),kValue);
            //继续上浮
            k = parent(k);
        }
    }
    /**
     * 下沉操作
     * @param k
     */
    public static void shiftDown(int k){
        /**
         * 为何使用左孩子节点的索引作为条件？
         * 因为二叉堆是一个完全二叉树，节点要不是没有节点，
         * 要不有两个节点，要不就是一个左孩子节点
         */
        while(leftChild(k)<arrayList.size()){
            /**
             * 取出一个孩子节点，默认先取出左孩子节点
             * 之后与右孩子节点比较，选择较大的节点的索引
             * 如果发现此时的父亲节点比最大的孩子节点也大，则跳出循环
             * 否则交换此时的位置，将当前的孩子节点作为新的父亲节点
             * 进行新一轮的遍历
             */
            int j = leftChild(k);
            if(j+1 < arrayList.size() && arrayList.get(j+1).compareTo(arrayList.get(j))>0){
                j = rightChild(k);
            }
            //data[j]是leftChild和rightChild中的最大值
            if(arrayList.get(k).compareTo(arrayList.get(j))>=0){
                break;
            }
            Integer kValue = arrayList.get(k);
            Integer jValue = arrayList.get(j);
            arrayList.set(k,jValue);
            arrayList.set(j,kValue);
            k = j;
        }
    }
    /**
     * 取出元素
     * @return
     */
    public static Integer remove(){
        Integer maxValue = arrayList.get(0);
        Integer lastValue = arrayList.get(arrayList.size()-1);
        arrayList.set(0,lastValue);
        arrayList.set(arrayList.size()-1,maxValue);
        arrayList.remove(arrayList.size()-1);
        shiftDown(0);
        return maxValue;
    }
    public static void main(String[] args) {
        int [] arr={3,44,38,5,47,15,36};
        for (int i = 0; i < arr.length; i++) {
            add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(remove()+" ");
        }
    }

}
