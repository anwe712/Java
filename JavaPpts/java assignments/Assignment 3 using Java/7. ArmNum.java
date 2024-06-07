import java.util.*;
public class ArmNum
{
    int n,l;
    ArmNum(int nn)
    {
        n=nn;
        int c=0;
        while(nn>0)
        {
            int r=nn%10;
            nn=nn/10;
            c++;
        }
        l=c;
    }
    int sum_pow(int i)
    {
        if(i==0)
            return 0;
        else
        {
            int d=i%10;
            return((int)Math.pow(d,l)+sum_pow(i/10));
        }
    }
    void isArmstrong()
    {
        if(sum_pow(n)==n)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=in.nextInt();
        int c=0;
        ArmNum ob=new ArmNum(a);
        ob.isArmstrong();
    }
}