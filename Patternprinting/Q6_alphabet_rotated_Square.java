package Patternprinting;
import java.util.Scanner;;
public class Q6_alphabet_rotated_Square 
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
                System.out.print((char)(i+64) +" ");
            }
            System.out.println();
        }
    }
    
}
