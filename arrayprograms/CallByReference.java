package arrayprograms;

import java.util.Arrays;

public class CallByReference {
    public static void modifyArray(int[] arr) {
        arr[0] = 10; // Modifying the value of the array's element
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println("Before method call: " + Arrays.toString(array));//1,2,3

        modifyArray(array);//method call statement

        System.out.println("After method call: " + Arrays.toString(array));//10,2,3
    }
}

