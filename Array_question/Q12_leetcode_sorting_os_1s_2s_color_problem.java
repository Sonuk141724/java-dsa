package Array_question;
import java.util.*;
public class Q12_leetcode_sorting_os_1s_2s_color_problem 
{
    public  void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,0,2,0,1,0,2,2,1,0,1,2,0,0,2,2,1};
        int n =arr.length;

        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
        int noofzeros=0; 
        int noofonce=0;
        for(int i=0;i<n;i++)
        {
            if (arr[i]==0)  noofzeros++;
            else if (arr[i]==1)  noofonce++;

        }

        for(int i=0;i<n;i++)
        {
            if (i<noofzeros) arr[i]=0;
            else if (i<noofzeros + noofonce) arr[i]=1;
            else arr[i]=2;
    
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }

}
}