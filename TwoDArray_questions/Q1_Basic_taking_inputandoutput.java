package TwoDArray_questions;
import java.util.Scanner;
public class Q1_Basic_taking_inputandoutput 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int [][]arr=new int[3][4];
        int m =arr.length;
        int n =arr[0].length;
        System.out.println("Enter the elements in array");
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
              arr[i][j]=sc.nextInt();
            }
        }

       System.out.print("Array elements are");
       System.out.println();

       for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
       
    }
    
}
