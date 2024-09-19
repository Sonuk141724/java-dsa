package special_pattern;
import java.util.*;
public class Q7_rhombus_pattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            
            for(int j=n;j>i;j--)
            {
                System.out.print(" "+" " );
               
            
            }
            for(int k=1;k<=n;k++)
            {
                System.out.print("X" +" ");
            }

            

            System.out.println();
        }
        
    }
    
}
