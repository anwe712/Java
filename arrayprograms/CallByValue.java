//java always calls by value 
package arrayprograms;

public class CallByValue {
    public static void modifyValue(int num) {
        num = 10; // Just assigning a new value to the parameter
        System.out.println("After method call: " + num); 
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Before method call: " + num); // 5
        
        modifyValue(num); // Call the method
        System.out.println("After method call: " + num); // 5 (num is unchanged because Java is pass-by-value)
    }
}
