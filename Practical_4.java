import java.util.*;
class Practical_4 {
  public static void main(String args[]) {
        Scanner myscan= new Scanner(System.in);
        System.out.print("Enter a weight in pounds = ");
        float p = myscan.nextFloat();
        System.out.print("Enter a height in inches = ");
        float i = myscan.nextFloat();
        float kg=p*0.45359237f;
        float m=i*0.0254f;
        System.out.println("Weight in kilogram = "+kg+"\nHeight in meter = "+m);
        float BMI= kg/(m*m);
        System.out.println("Body Mass Index (BMI) = "+BMI);
       }
}