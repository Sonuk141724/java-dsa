package TwoD_Arraylist;
import java.util.*;
public class Q2_leetcode_118_pascals_triangle 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Integer> arr =new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if (j==0 || j==i)
                {
                    arr.add(1);
                    
                }
                else
                {
                    arr.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            ans.add(arr);
        }
        System.out.println(ans +" ");
        System.out.println();
        
    }
    
}
