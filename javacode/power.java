import java.util.Scanner;
public class Power {

    public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter the base");
    int base=obj.nextInt();
    System.out.println("enter the exponent");
    int exponent=obj.nextInt();
    long result = 1;
    while (exponent != 0)
    {
        result *= base;
        --exponent;
    }
    System.out.println("Answer = " + result);
    }
}

