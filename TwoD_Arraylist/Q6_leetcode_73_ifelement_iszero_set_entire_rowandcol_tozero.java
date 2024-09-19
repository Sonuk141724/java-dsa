package TwoD_Arraylist;

public class Q6_leetcode_73_ifelement_iszero_set_entire_rowandcol_tozero 
{
    public static void setzeros(int arr[][])
    {
        int m =arr.length;
        int n =arr[0].length;

        boolean zerorow=false;
        boolean zerocol=false;

        for(int j=0;j<n;j++)         //check zeroth row
        {
            if (arr[0][j]==0) 
            {
                zerorow=true;
                break;
                
            }
        }


        for(int i=0;i<m;i++)           //check zeroth column
        {
            if (arr[i][0]==0) 
            {
                zerocol=true;
                break;
                
            }
        }


        for(int i=1;i<m;i++)        // traverse ion sub matrix without zeroth row and zeroth column
        {
            for(int j=1;j<n;j++)
            {
                if (arr[i][j]==0) 
                {
                    arr[i][0]=0;
                    arr[0][j]=0;
                    
                }
            }
        }

        for(int j=1;j<n;j++)       // traverse in the 0th row
        {
            if (arr[0][j]==0)           // set 0th col to zero
            {
                for(int i=1;i<m;i++)
                {
                    arr[i][j]=0;
                }
                
            }
        }

        for(int i=1;i<m;i++)          // traverse in the 0th col
        {
            if (arr[i][0]==0)       // set 0th row to zero
            {
                for(int j=1;j<n;j++)
                {
                    arr[i][j]=0;
                }
                
            }
        }

        if (zerorow==true)              // set 0th row to 0
        {
            for(int j=0;j<n;j++)
            {
                arr[0][j]=0;
            }
            
        }

        if (zerocol==true)              // set 0th col to 0
        {
            for(int i=0;i<n;i++)
            {
                arr[i][0]=0;
            }
            
        }


    }

    public static void main(String[] args) 
    {
        int arr [][]={{1,1,1},{1,0,1},{1,1,1}};
        int m=arr.length;
        int n =arr[0].length;

        setzeros(arr);
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        
    }
    
}
