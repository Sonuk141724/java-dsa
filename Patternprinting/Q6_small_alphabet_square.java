package Patternprinting;
import java.util.*;
public class Q6_small_alphabet_square 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print((char)(j+96) +" ");
            }
            System.out.println();
        }
    }
}
