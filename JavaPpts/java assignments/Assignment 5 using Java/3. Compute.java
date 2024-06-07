//WAP in Java to implement single inheritance concept.  
import java.util.*;
class Library
{
    String name; String author; double price;
    Library(String n, String a, double p)
    {
        name=n;
        author=a;
        price=p;
    }
    void show()
    {
        System.out.println("Name: "+name);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
public class Compute extends Library
{
    int days; double fn;
    Compute(String n, String a, double p, int d)
    {
        super(n,a,p);
        days=d;
        fn=0.0;
    }
    void fine()
    {
        int x=days-7;
        if(x>0)
        {
            if(x<=5)
                fn=x*2;
            else if(x>5 && x<=10)
                fn=(7*2)+(x-7)*3;
            else
                fn=(7*2)+(10*3)+(x-7-10)*5;
        }
    }
    void display()
    {
        super.show();
        System.out.println("No. of days taken in returning the book "+days);
        System.out.println("Fine charged "+fn);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Compute ob=new Compute("Merchant Of Venice","William Shakespeare",500,15);
        ob.fine();
        ob.display();
    }
}