package special_pattern;
import java.util.*;;
public class Q4_star_triangle_flipped 
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
               if ((i+j)>n) 
               {
                System.out.print("X"+" ");
                
               }
               else 
               System.out.print(" " + " ");
            }
            
            System.out.println();
        }
    
}
    
}
