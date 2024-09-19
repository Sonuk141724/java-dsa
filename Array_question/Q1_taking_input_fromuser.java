package Array_question;
import java.util.*;
public class Q1_taking_input_fromuser 
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
        
    }
    
}
