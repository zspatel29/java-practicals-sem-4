import java.util.Scanner;
class Practical_8 {
      public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
	 System.out.print("enter a number = ");
	 int number = input.nextInt();
	 int i = 2;
         
	 while(number/i!=1){
	    if(number%i == 0){
	       System.out.print(i+",");
	       number /= i;	
	       }
	    else{
	       i++;
	       }	
	    }
	 System.out.println(number+".");
	 }
      }