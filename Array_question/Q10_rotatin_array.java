package Array_question;
import java.util.*;
public class Q10_rotatin_array 
{
    public static void reverse(int arr[], int i, int j)
    {
       while (i<j) 
       {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        
       }
    }

    public void rotate(int arr[], int k)
    {
        int n=arr.length;
         k=k%n;
      
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
    public  void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int arr[]={10,20,30,40,50,60,70,80,90};
        int n =arr.length;

        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println("Enter the no of times to be rotated");
        int p=sc.nextInt();
        
        rotate(arr, p);
       
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }

}}
