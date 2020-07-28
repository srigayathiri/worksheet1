import java.util.Scanner;
public class PerimeterOfSquare
{

   public static void main(String args[])
    {  
       
         Scanner obj= new Scanner(System.in);
       
         System.out.println("Enter the side of the square");
         
         double a= obj.nextDouble();
         double perimeter=4*a;
     
         System.out.println("perimeter of Square is:" + perimeter);      
   }
}
