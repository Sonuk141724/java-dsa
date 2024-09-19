package special_pattern;
import java.util.*;

public class Q9_pyramid_with_extravariable 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int nsp=n-1; // no of spaces
        int nst=1; // no of stars
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nsp;j++)
            {
                System.out.print(" "+" ");
            }

            for(int k=1;k<=nst;k++)
            {
                System.out.print("X"+" ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }

        
    }
   
}
