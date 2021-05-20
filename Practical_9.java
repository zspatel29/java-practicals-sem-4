import java.util.*;
class Practical_9 {
      public static void main(String[] args) {
         Scanner number = new Scanner(System.in);
	 System.out.print("enter firsr number = ");
	 int num1 = number.nextInt();
	 System.out.print("enter second number = ");
	 int num2 = number.nextInt();

	 System.out.println(gcd(num1,num2));
	 }

      public static int gcd(int num1,int num2){
         if(num2==0){
	    return num1;
	    }
	 else{
	    return gcd(num2,num1%num2);
	    }
	}
    }