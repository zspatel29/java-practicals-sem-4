import java.util.*;
class Practical_7{

    public static void main(String args[]){

    System.out.println(" hear program we have generate vehical plate no.");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Series:");       
    String s= sc.nextLine(); 
    
    int digit1 = (int)(Math.random() * 10);
    int digit2 = (int)(Math.random() * 10);
    int digit3 = (int)(Math.random() * 10);
    int digit4 = (int)(Math.random() * 10);

    System.out.println("your vehical plate no = "+ s +digit1 +digit2 +digit3+ digit4);
    }

}