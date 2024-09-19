package Array_question;
import java.util.*;
public class Q11_sorting_array_of_0s_and_1s 
{
    public  void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,1,0,0,0,1,0,1,1,0,1,1,0,1,0,0,0};
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
            if (arr[i]==0)  i++;
            else if (arr[j]==1) j--;

            else if(arr[i]==1 && arr[j]==0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }         

        }

        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
    
}}
