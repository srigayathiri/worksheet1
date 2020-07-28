import java.util.Scanner;
public class add{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter two values a and b");
        int a=obj.nextInt();
        int b=obj.nextInt();
        System.out.println("Addition = "+(a+b));
    }    
}
