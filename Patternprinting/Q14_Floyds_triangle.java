package Patternprinting;
import java.util.*;;
public class Q14_Floyds_triangle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=i;j++)

            {
               System.out.print(a +" ");
               a++;
            }
            
            System.out.println();
        }
    }}