package special_pattern;
import java.util.*;;
public class Q3_bnary_triangle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number");
        int n = sc.nextInt();

        /*   Method-1
        for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=i;j++)

            {
               if ((i%2!=0))
               {
                    if (j%2!=0) 
                    {
                        System.out.print("1" +" ");
                        
                    }
                    else System.out.print("0" +" ");
               }

               else if (i%2==0) 
               {
                    if (j%2==0) 
                    {
                        System.out.print("1" +" ");
                        
                    }
                    else System.out.print("0" + " ");

                
               }

            }
            
            System.out.println();
        }  */

        // Method-2
        for(int i=1;i<=n;i++)
        {
            for(int j =1;j<=i;j++)
            {
                if ((i+j)%2==0) 
                {
                    System.out.print("1"+" ");
                    
                }
                else
                System.out.print("0" +" ");

            }
            System.out.println();
        }
      
}
    
}
