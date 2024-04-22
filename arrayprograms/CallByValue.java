package arrayprograms;

public class CallByValue {
    public static void modifyValue(int x) {
        x = 10; // Modifying the value of the parameter x
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Before method call: " + num);//5
        modifyValue(num);//10
        System.out.println("After method call: " + num);//5
    }
}


    
