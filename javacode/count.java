import java.util.Scanner;

public class count
{
    public static void main(String args[])
    {
        int countp=0, countn=0, countz=0, i;
        int arr[] = new int[10];
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter n value : ");
        int n=obj.nextInt();
        for(i=0; i<n; i++)
        {
            arr[i] = obj.nextInt();
        }
        for(i=0; i<n; i++)
        {
            if(arr[i] < 0)
            {
                countn++;
            }
            else if(arr[i] == 0)
            {
                countz++;
            }
            else
            {
                countp++;
            }
        }

        System.out.print(countp + " Positive Numbers");
        System.out.print("\n" + countn + " Negative Numbers");
        System.out.print("\n" + countz + " Zero");
    }
}
