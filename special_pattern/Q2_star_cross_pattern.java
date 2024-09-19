package special_pattern;
import java.util.*;;
public class Q2_star_cross_pattern 
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
               if (i==j || (i+j)==n+1 )
               {
                System.out.print("x"+" ");
               }
              else
              System.out.print(" " +" ");
            }
            
            System.out.println();
        }
    
}
}
