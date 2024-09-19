package TwoD_Arraylist;

/**
 * Q4_leetcode_861_score_after_flipping_matrix
 */
public class Q4_leetcode_861_score_after_flipping_matrix 
{
    public static void main(String[] args) 
    {
        int arr [][] ={{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        int m =arr.length;
        int n =arr[0].length;

        for(int i=0;i<m;i++)
        {
            if (arr[i][0]==0) 
            {
                // flip that row
                for(int j=0;j<n;j++)
                {
                    if (arr[i][j]==0) 
                    {
                        arr[i][j]=1;
                        
                    }
                    else
                    {
                        arr[i][j]=0;
                    }
                }
                
            }
        }

        // flip those column where noofzeros > noofonce

        for(int j=1;j<n;j++)
        {
            int noofzeros=0 , noofonce=0;

            for(int i=0;i<m;i++)
            {
                if (arr[i][j]==0)  noofzeros++;
                else               noofonce++;
                
               
            }
            if (noofzeros>noofonce) 
            {
                // flip column

                for( int i=0;i<m;i++)
                {
                    if (arr[i][j]==0) 
                    {
                        arr[i][j]=1;
                        
                    }
                    else arr[i][j]=0;
                }
                
            }
        }

        // finding total score
        int score=0;
        int x=1;
        for(int j=n-1;j>=0;j--)
        {
            for(int i=0;i<m;i++)
            {
                score+=arr[i][j]*x;

            }
            x*=2;
        }

        System.out.println("score ="+score);
        
    }

    
}