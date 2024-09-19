package Array_question;
import java.util.*;
public class Q4_finding_elementx 
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

        System.out.println("Enter target elements");
        int target =sc.nextInt();
        boolean flag=false;
        for(int j=0;j<arr.length;j++)
        {
            if (arr[j]==target) 
            {
                flag =true;
                break;
            }
        }
        if (flag==true) 
        {
            System.out.println("Elements found");
            
        }
        else System.out.println("Elements not found");
    }
    
}
