package paket;

public class InsertionSort {
    // Our insertion sort function
    void sort(int[] array){
        int size=array.length;
        for (int i = 1; i < size-1; i++) {
            int tmp = array[i];
            int j = i-1;
            while (j>=0 && array[j]>tmp) {
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=tmp;
            }
        }
    // We are printing the integer array that we sent
    static void printArray(int []array){
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
    // Our main driver method
    public static void main(String[] args) {
        int[] array ={12,24,11,10,13,44};
        InsertionSort obj = new InsertionSort();
        obj.sort(array);
        printArray(array);
    }
}
