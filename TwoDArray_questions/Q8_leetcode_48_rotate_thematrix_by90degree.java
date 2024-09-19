package TwoDArray_questions;

public class Q8_leetcode_48_rotate_thematrix_by90degree 
{
    public static void print(int arr[][])
    {
        int m =arr.length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int arr [][]={{1,2,3},{4,5,6},{7,8,9}};
        int m =arr.length;
        System.out.println("Array elements are");
        print(arr);

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<i;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        System.out.println("After transposing array elements are");
        print(arr);

        

        // reversing each row element

        for(int i=0;i<m;i++)
        {
            int a=0;
            int b=m-1;
            while (a<b) 
            {
                int temp=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=temp;
                a++;
                b--;
                
            }
        }

        System.out.println("After rotating original array by 90 degree");
        print(arr);

        
    }
    
}
