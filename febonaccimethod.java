import java.lang.*;
import java.util.*;
public class febonaccimethod
{
    static void febonacci(int num)
    {
        int t1=0,t2=1,t3;
        for(int i=0;i<num;i++)
        {
            System.out.print(t1+" ");
            t3=t1+t2;
            t1=t2;
            t2=t3;
        }
    }
    static int febonaccinumber(int n)
    {
        int t1=0,t2=1,t3,count=0;
        for(;;)
        {
            t3=t1+t2;
            if(n==count)
            {
                
                return t1;
                
            }
            t1=t2;
            t2=t3;
            ++count;
            
        }
    }
    static boolean checkfebonacci(int n)
    {
        int t1=0,t2=1,t3;
        for(;;)
        {
            t3=t1+t2;
            if(t1==n)
            {
                return true;
            }
            else if(t1>n)
            {
                return false;
            }
            t1=t2;
            t2=t3;
        }
    }
    static void febonacciRange(int a,int b)
    {
        int t1=0, t2=1,t3;
        for(;;)
        {
            t3=t1+t2;
            if(t1>=a && t1<=b)
            {
                System.out.print(t1+" ");
            }
            if(t1>b)
            break;
            t1=t2;
            t2=t3;
        }
    }
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        while(true)
        {
            System.out.print("\n**********************************");
            System.out.println("\nEnter the Choice: \n1.print febonacci Number upto N term: \n2.Display n th febonacci Number: \n3.Check the Number is Febonacci number or not: \n4.Print febonacci number between Number: \n5.Exit\n************************************");
            
            int ch=input.nextInt();
            System.out.println("****************************************");
            switch(ch)
            {
                case 1:System.out.println("Enter the How many Number You want to print ");
                int count=input.nextInt();
                febonacci(count);
                break;
                
                case 2:System.out.println("Enter the N th number to display Febonacci Number: ");
                int n=input.nextInt();
                System.out.println("Febonacci number is: "+febonaccinumber(n));
                break;
                
                case 3:System.out.println("Enter the Number to check number is febonacci or not: ");
                int num=input.nextInt();
                if(checkfebonacci(num))
                {
                    System.out.println(num+"Febonacci number");
                }
                else
                {
                    System.out.println(num+"Not Febonacci number");
                }
                break;
                
                case 4:System.out.println("Enter the start and end Range: ");
                int start=input.nextInt();
                int end=input.nextInt();
                febonacciRange(start,end);
                break;
                case 5:System.exit(0);
                break;
                default: System.out.println("Enter correct Choice: ");
                
            }
        }
    }
}