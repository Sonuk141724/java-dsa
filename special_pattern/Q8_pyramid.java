package special_pattern;
import java.util.*;
public class Q8_pyramid 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print(" "+" ");
            }

            for(int k=1;k<=(2*i-1);k++)
            {
                System.out.print("X"+" ");
            }
            System.out.println();
        }

        
    }
    
}
