import java.util.Scanner;

public class checking
{
public static void main(String[] args) 
{
System.out.println("press key");
Scanner obj=new Scanner(System.in);
int a=obj.nextInt();
switch(a)
{
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
        System.out.println("valid....");
        break;
    default:
        System.out.println("invalid....press(0 to 9)");
    
}
}
}
