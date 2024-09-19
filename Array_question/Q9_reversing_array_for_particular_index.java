package Array_question;
import java.util.*;
public class Q9_reversing_array_for_particular_index 
{
    public static void reverse(int arr[], int i, int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
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
        int i=1;
        int j=5;
        while (i<j) 
        {
            reverse(arr, i, j);
            i++;
            j--;
            
        }

        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }


    
}
}