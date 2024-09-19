package TwoD_Arraylist;

public class Q5_leetcode_240_search_atargetelement_inmatrix 
{
    public static boolean searchmatrix(int arr[][], int target)
    {
        int m =arr.length;
        int n =arr[0].length;
        int i=0 , j=n-1;

        while (i<m && j>=0)
        {
            if (arr[i][j]==target) 
            {
                return true;
                
            }

            else if (arr[i][j]>target) 
            {
                j--;  // go left
                
            }

            else if (arr[i][j]<target) 
            {
                i++;    // go down
                
            }
            
        }
        return false;
    } 
    public static void main(String[] args) 
    {
        int arr[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int m =arr.length;
        int n =arr[0].length;

        System.out.println(searchmatrix(arr, 16));
        System.out.println(searchmatrix(arr, 98));
        
    }
    
}
