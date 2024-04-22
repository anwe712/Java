package ExceptionHandling;

public class ProperlyHandledEH {
    public static void main(String[] args) {
        int i  = 0 ;
       try {
       int  j = 8/i ;
        System.out.println(j);

       }
       catch(Exception e){
        System.out.println("Something is wrong..");
       }
    
    }
}
