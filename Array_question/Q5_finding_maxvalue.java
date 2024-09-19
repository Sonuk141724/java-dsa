package Array_question;
//import java.time.*;
import java.util.Scanner;
public class Q5_finding_maxvalue 
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

        
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }
        int max =arr[0];

        for(int k=0;k<arr.length;k++)
        {
            if (arr[k]>max) 
            {
                max=arr[k];
                
            }
        }
        System.out.print("maximum element is "+max);
        
    }
}
