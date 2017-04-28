import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     int[] values = {8, 3, 7, 9, 1, 2, 4};
     sort(values);
    }
    
    public static int smallest(int[] array) {
        int smalest = array[0];
        for(int i = 1;i < array.length; i++){
            if(array[i] < smalest){
                smalest = array[i];
            }
        }
        return smalest;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int index = 0;
        int smalest = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < smalest){
                smalest = array[i];
                index = i;
            }
        }
        return index;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int theIndex = index;
        int smalest = array[index];
        for(int i = index; i < array.length; i++){
            if(array[i] < smalest){
                smalest = array[i];
                theIndex = i;
            }
        }
        return theIndex;
    }
    public static void swap(int[] array, int index1, int index2) {
        int[] temp = {array[index2]};
        array[index2] = array[index1];
        array[index1] = temp[0];
    }
    
    public static void sort(int[] array) {
        for(int i = 0; i < array.length -1; i++){
            int smalest = indexOfTheSmallestStartingFrom(array,i);
            swap(array,i,smalest);
            System.out.println(Arrays.toString(array));
            
            
        }
    }
    
}
