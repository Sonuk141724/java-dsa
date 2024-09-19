package Patternprinting;
import java.util.*;
public class Q9_triangle_alphabet 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print( (char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}

