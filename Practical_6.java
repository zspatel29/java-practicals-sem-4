import java.util.*;
class Practical_6 {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.print("enter a letter = ");
      char ch = input.next().charAt(0);

      if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
         System.out.print("enter letter "+ch+" is vowel.");  
      }
      else{        
         System.out.print("enter letter "+ch+" is constant.");  
         }
      }
  }