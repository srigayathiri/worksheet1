import java.util.Scanner;

public class cgpa
{
public static void main(String[] args) 
{
Scanner obj=new Scanner(System.in);
double m[]=new double[10];
double c[]=new double[10];
double sum=0,csum=0;
int i;
System.out.println("enter number of subject");
int n=obj.nextInt();
for(i=0;i<n;i++)
{
    System.out.println("enter grade and credit for"+(i+1)+"subject");
    m[i]=obj.nextDouble();
    c[i]=obj.nextDouble();
    sum=sum+m[i]*c[i];
    csum=csum+c[i];
}
System.out.println("cgpa...."+(sum/csum));
}
}
