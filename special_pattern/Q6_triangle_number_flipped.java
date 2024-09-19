package special_pattern;
import java.util.*;
public class Q6_triangle_number_flipped 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        //Method-1
     /*    for(int i=1;i<=n;i++)
        {
            int a=1;
            for(int j=1;j<=n;j++)

            {
               if ((i+j)>n) 
               {
                System.out.print(a+" ");
                a++;
               }
               else 
               System.out.print(" " + " ");
            }
            
            System.out.println();
        }
            */

            // Method-2

            for (int i = 1; i <= n; i++) 
            {
                for(int j=1;j<=n-i;j++)
                {
                    System.out.print(" "+" ");
                }
                
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j +" ");
                }
                System.out.println();
            }
    
}
    
}
