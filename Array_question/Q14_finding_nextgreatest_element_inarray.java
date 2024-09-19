package Array_question;
import java.util.*;
public class Q14_finding_nextgreatest_element_inarray 
{
    public static void main(String[] args) 
    {
        
    int arr []={12,8,41,37,2,49,16,28,21};
    int n =arr.length;
    for(int ele:arr)
    {
        System.out.print(ele+" ");
    }
    System.out.println();
    int ans[]=new int[n];
    ans[n-1]=-1;   // because after last digit there will be no greatest element
    int nge=arr[n-1];

    for(int i=n-2;i>=0;i--)
    {
        ans[i]=nge;
        nge=Math.max(nge, arr[i]);
    }

    for(int ele:ans)
    {
        System.out.print(ele+" ");
    }
    
        
    }
}
