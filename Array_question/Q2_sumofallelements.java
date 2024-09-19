package Array_question;
import java.util.*;;
public class Q2_sumofallelements 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();
        int arr []= new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;

        for(int j=0;j<arr.length;j++)
        {
            sum+=arr[j];
        }

        System.out.println("Sum of all elemnts ="+sum);
        
    }
}
