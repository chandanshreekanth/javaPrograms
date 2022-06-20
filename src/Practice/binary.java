package Practice;

public class binary 
{
    public static void main(String args[]) 
    {
        int a=111;
        int i=0;
        int rem;
        int sum=0;
        while(a!=0)
        {
            rem=a%10;
            sum=(sum)+(rem*(2^i));
            System.out.println(2^i);
            a=a/10;
            i++;
        }
        System.out.println(2^0);
        
        
        }
}
