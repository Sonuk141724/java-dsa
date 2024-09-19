package Array_question;
import java.util.*;
public class Q8_Reversing_array_using_extravariable 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int arr[]={10,20,30,40,50,60,70,80,90};
        int n =arr.length;

        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();

        for(int i=0;i<n/2;i++)
        {
            int j=n-i-1;   // i+j=n-1
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
         }
         for(int ele:arr)
         {
             System.out.print(ele+" ");
         }
}
}