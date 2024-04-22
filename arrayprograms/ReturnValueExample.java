package arrayprograms;

public class ReturnValueExample {
    public static int add(int a, int b) {
        int sum = a + b;
        return sum; // returning the value of sum
    }

    public static void main(String[] args) {
        int result = add(5, 3); // calling the add method and storing its return value
        System.out.println("The sum is: " + result); // printing the returned value
    }
}

