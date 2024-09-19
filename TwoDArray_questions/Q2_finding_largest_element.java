package TwoDArray_questions;
import java.util.*;
public class Q2_finding_largest_element 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int [][]arr={{1,5,6},{2,-9,3},{2,3,6}};
        

       System.out.print("Array elements are");
       System.out.println();

       for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if (arr[i][j]>max) 
                {
                    max=arr[i][j];
                    
                }
            }
        }

        System.out.println("maximul element is = "+max);


        
}
}