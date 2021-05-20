import java.util.*;
class Practical_5
{
   public static void main(String args[])
   {
       int a,b,c,temp;
       Scanner myscan= new Scanner(System.in);
       
       System.out.print("Enter number a = ");
       a= myscan.nextInt();
       System.out.print("Enter number b = ");
       b= myscan.nextInt();
       System.out.print("Enter number c = ");
       c= myscan.nextInt();
       
       if(a<b)
       {
        temp=a;
        a=b;
        b=temp;
       }
       if(c>b)
       {
        if(c>a)
        {
         temp=c;
         c=b;
         b=a;
         a=temp;
        }
        else
        {
         temp=c;
         c=b;
         b=temp;
        }
       }
      System.out.println("Decreasing order of three integer : "+a+" "+b+" "+c);
   }
}