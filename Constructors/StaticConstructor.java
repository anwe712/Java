package Constructors;

public class StaticConstructor {
    static int number ;
static {
    number = 10 ;
}

public static void main(String[] args) {
    System.out.println("The static number = "+ StaticConstructor.number);
}
}