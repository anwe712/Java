package Constructors;

public class ConstructorChaining {
    int number;
    
    public ConstructorChaining() {
        this(0);// this is also a constrcttor - here one cpnstructor call another constrctor
    }
    
    public ConstructorChaining(int n) {
        number = n;
    }
    
    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining();
        System.out.println("Number: " + obj.number);
    }
}

