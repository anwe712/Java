package StaticKeyword;

public class StaticMethod {
     // Static method to calculate the square of a number
     public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        int number = 5;
        // Calling the static method without creating an instance of the class
        int result = StaticMethodExample.square(number);
        System.out.println("Square of " + number + " is: " + result);
    }
}


