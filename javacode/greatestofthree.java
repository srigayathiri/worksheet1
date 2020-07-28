import java.util.Scanner;
public class greatestofthree
{

   public static void main(String args[])
    {  
       
         Scanner obj= new Scanner(System.in);
       
         System.out.println("Enter a");
         int a= obj.nextInt();
         System.out.println("Enter b");
         int b= obj.nextInt();
         System.out.println("Enter c");
         int c= obj.nextInt();
         if(a>b && a>c)
           System.out.println("a is greatest"); 
         else if(b>a && b>c)
           System.out.println("b is greatest");
         else
           System.out.println("c is greatest");
   }
}
