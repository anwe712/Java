package NumberPrograms;

public class SwapTwoNumber {
    
    public void Swap(int a , int b ){
        System.out.println("The value before swaping , a : "+a+", b : "+b);
        int c = 0 ;// c = temp variable
        c = a ;
        a = b ;
        b = c ;
        System.out.println("The value after swaping , a : "+a+", b : "+b);
    }

    public void main(String[] args) {
        Swap(90, 70);
    }
}
