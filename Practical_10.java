import java.util.*;
class Practical_10 {
  public static void main(String args[]){
     Scanner input = new Scanner(System.in);
     int [] list = new int[10];
     int [] reverse = new int[list.length];
 
     System.out.println("\n enter 10 numbers =" );
     for(int a=0; a<list.length; a++){
        list[a] = input.nextInt();
        }
     int i,j;
     for(i=0 ,j=reverse.length-1; i < list.length ; i++ , j--){
        reverse[j]=list[i];
        }
     System.out.println("\n Reverse list = ");

     for(j=0;j<reverse.length;j++){
        System.out.println(reverse[j]);
        }
     }
  }