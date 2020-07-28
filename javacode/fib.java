import java.util.Scanner;
public class fib{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter n value");
        int n=obj.nextInt();
        int a=1;
        int b=1;
        int i=1,c;
        System.out.println(a);
        System.out.println(b);
        while(i<n)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            i++;
        }
       
    }
}
