package Array_question;
import java.util.*;
public class Q7_find_doublet_inarray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter elements in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter target element");
        int target=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if (target == arr[i]+arr[j]) 
                {
                    System.out.print("the doublet num is ="+arr[i]+" " +arr[j]);
                    
                }
            }
        }


    }

        
        
        

    
}
