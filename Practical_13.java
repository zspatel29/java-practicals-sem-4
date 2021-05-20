import java.util.*; 
public class Practical_13 { 
    public static void main(String args[]){
       System.out.println("Enter String:"); 
       Scanner sc=new Scanner(System.in);   
       String calc=sc.nextLine();    
       calc=calc.replaceAll("\\s"," "); 
       System.out.println("After Removing whitespaces: "+calc);        
       int operator1=0,k=0;    
       int operator2=0,j=0,p=0;      
       char[] calc1=calc.toCharArray();     
       char operand='+';    
       for(int i=calc1.length-1;i>=0;i--){    
          if(calc1[i]>='0'&&calc1[i]<='9'&&p!=1){  
             operator2+=(Character.getNumericValue(calc1[i]))*((int)(Math.pow(10,j))); 
             System.out.print(operator2+" "); 
             ++j;      
             }     
          else if(calc1[i]=='+'||calc1[i]=='-'||calc1[i]=='*'||calc1[i]=='/'){       
             operand=calc1[i];    
             p=1;  
             } 
          else{      
             operator1+=(Character.getNumericValue(calc1[i]))*((int)(Math.pow(10,k))); 
             System.out.print(operator1+" "); 
             ++k; 
             } 
          } 
        System.out.println("Operator1: "+operator1+" Operator2: "+operator2+" Operand:"+operand);
        int ans=0;
        if(operand=='+'){  
           ans=operator1+operator2; 
           } 
        else if(operand=='-'){ 
           ans=operator1-operator2; 
           }
        else if(operand=='*'){  
           ans=operator1*operator2; 
           }
        else if(operand=='/'){ 
           ans=(int)operator1/operator2; 
           } 
        if(ans!=0){ 
           System.out.println("Answer: "+ans); 
            }
        else{ 
           System.out.println("Your Operand is not Supported!!\nChange your O perand!!."); 
           }
        }
     } 