import java.util.*;
class Practical_2{
    public static void main(String args[]){
    Scanner input= new Scanner(System.in);
    System.out.println("Solve equation in cramer rules");
    
    System.out.println("Values from Equestion:- 1 :");   
    System.out.print("Enter value of a : ");   
    double a = input.nextDouble(); 
    System.out.print("Enter value of b : ");   
    double b = input.nextDouble(); 
    System.out.print("Enter value of e : ");   
    double e = input.nextDouble(); 
   
    System.out.println("Values from Equestion:- 2 :");  
    System.out.print("Enter value of c : "); 
    double c = input.nextDouble(); 
    System.out.print("Enter value of d : ");
    double d = input.nextDouble(); 
    System.out.print("Enter value of f : ");
    double f = input.nextDouble(); 

     
    double x=(e*d - b*f)/(a*d - b*c);
    double y=(a*f - e*c)/(a*d - b*c);
    System.out.println("X = "+x+"\nY = "+y);
   }
}