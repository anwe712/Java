package PackagePrograms;

final public class ImplementationFinalClass {
    final  int  display (int a ,int  b){
        int sum = 0 ;
        sum = a + b ;
        return sum ;

    }
    public  static void main(String[] args) {
      ImplementationFinalClass obj = new ImplementationFinalClass();
      System.out.println( obj.display(19 , 56));
    
       
    }
}
