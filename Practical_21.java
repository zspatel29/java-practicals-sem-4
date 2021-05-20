import java.io.*; 
import java.util.Scanner;

class Practical_21 {
     public static void main(String[] args) {
         try (PrintWriter pw = new PrintWriter(new FileOutputStream(new File("123.txt"), true));) { 
             for (int i = 0; i < 150; i++) { 
                pw.print((int) (Math.random() * 150) + " ");
                }
             System.out.println("file"+pw+"is created and print random 150 numbers.");
             } 
         catch (FileNotFoundException fnfe) { 
             System.out.println("Cannot create the file.");
             fnfe.printStackTrace(); 
             } 
         } 
     } 
