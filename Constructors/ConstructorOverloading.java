package Constructors;

public class ConstructorOverloading {
    int number ;
    String name ;
    
    public ConstructorOverloading() {
        number = 190;
    }
    
    public ConstructorOverloading(int n) {
        number = n;
    }

    public ConstructorOverloading(String fullname){
        name = fullname ;
    }
    
    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();

        System.out.println("Number 1 (invoked the first constrctor ): " + obj1.number);
        
        ConstructorOverloading obj2 = new ConstructorOverloading(10);

        System.out.println("Number 2(invoked the second constructor): " + obj2.number);

        ConstructorOverloading obj3 = new ConstructorOverloading("Ayush");
        

        System.out.println("Number 2(invoked the third constrctor): " + obj3.name);
    
       
    }
}
