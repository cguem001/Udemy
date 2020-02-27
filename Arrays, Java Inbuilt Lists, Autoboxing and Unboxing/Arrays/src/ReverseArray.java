import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] myArray = new int[] {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(myArray));
        System.out.println();

    }

    public static void revereArray(int [] array) {
        int lastNumber = array.length-1;
        int halfArray = array.length / 2;
        int temp;

        for(int i = 0; i < halfArray; i++) {
            temp = array[i];
            array[i] = array[lastNumber];
            array[lastNumber] = temp;
            lastNumber--;
        }

        System.out.println(Arrays.toString(array));
    }
}
