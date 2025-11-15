import java.util.Scanner;
public class exercise1{
     public static void main (String[] args){

         Scanner sc=new Scanner (System.in);
         System.out.print("Introduce el radio del círculo");
         double radio= sc.nextDouble();

         double area= Math.PI*radio*radio;
         System.out.println ("El área del círculo sería: "+area);

     }
 }