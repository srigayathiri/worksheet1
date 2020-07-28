import java.util.Scanner;
public class prodis{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the amount");
        double a=obj.nextDouble();
        System.out.println("enter the discount in %");
        double d=obj.nextDouble();
        double amoper=a/100*d;
        System.out.println("commission amount = "+(a-amoper));
        
    }
}
