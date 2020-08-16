import java.util.*;
class armstrongpalindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        System.out.println("Enter choice");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            int n,i,d,sum=0;
            System.out.println("Enter the number");
            n=sc.nextInt();
            for(i=n;i>0;i=i/10)
            {
               d=i%10;
               sum=sum+(d*d*d);
            }
            if(sum==n)
            System.out.println("Armstrong number");
            else
            System.out.println("Not armstrong number");
            break;
            case 2:
            int rev=0;
            System.out.println("Enter the number");
            n=sc.nextInt();
            for(i=n;i>0;i=i/10)
            {
                d=i%10;
                rev=rev*10+d;
            }
            if(rev==n)
            System.out.println("Palindrome number");
            else
            System.out.println("Not palindrome number");
            break;
        }
    }
}
