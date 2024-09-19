package Array_question;
import java.util.*;;
public class Q6_finding_secondlargest_element 
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
        
        System.out.println("Array elements are  ");
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();

        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if (arr[i]>max) 
            {
                max=arr[i];
                
            }
        }
        System.out.println("Maximum element is ="+ max);
        int smx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if (arr[i]>smx && arr[i]<max) 
            {
                smx=arr[i];
                
            }
        }
        System.out.println("Second maximum element is =" +smx);
    }
    
}
