package Array_question;
import java.util.*;
public class Q8_reversing_using_second_method 
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

        int i=0;
        int j=n-1;
        while (i<j) 
        {
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

            
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();


    
}}
