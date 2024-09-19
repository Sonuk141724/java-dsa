package Array_question;
import java.util.*;
public class Q3_productofallelements 
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
        int product=1;
        for(int j=0;j<arr.length;j++)
        {
            product *=arr[j];
        }
        System.out.println("Product of all elements ="+product);
        
    }
    
}
