//same name of class and constructor

package Constructors ;

public class DefaultConstructor {
    String name , location ;
    int salary ;

    //this class is like a blueprint for creating objects 
    
    public DefaultConstructor() {
        //same name of class and constrctor 
        name = "Ayushman Kumar" ;
        salary = 35000 ;
        location = "Lucknow" ;
    }

    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        //creating object of the contructor 
        System.out.println(obj.name);
    }
}
