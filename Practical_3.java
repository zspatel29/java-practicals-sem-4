import java.util.*;
class Practical_3{
    public static void main(String args[]){
        Scanner myscan= new Scanner(System.in);
        System.out.print("Enter a number in meter : ");
        int m= myscan.nextInt();
        float f=m*3.28084f;
        System.out.println("meter into feet= "+f);
    }
}