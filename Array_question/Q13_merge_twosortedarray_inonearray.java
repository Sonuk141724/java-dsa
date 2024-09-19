package Array_question;

public class Q13_merge_twosortedarray_inonearray 
{

    public static void main(String[] args) 
    {
        
        
        int arr[]= {11,20,43,53,55};
        int brr[]={21,35,42,65,79,84,96};
        int n=arr.length;
        int m = brr.length;

        int crr[]= new int [n+m];

        int i=0,j=0,k=0;
        while (i<n && j<m) 
        {
            if (arr[i]<=brr[j])
            {
                crr[k]=arr[i];
                i++;
                k++;
                
            }
            else 
            {
                crr[k]=brr[j];
                j++;
                k++;

            }

            if (i==n) 
            {
                while (j<m) 
                {
                    crr[k]=brr[j];
                    j++;
                    k++;
                }
                
            }
             if (j==m) 
            {
                while (i<n) 
                {
                    crr[k]=arr[i];
                    i++;
                    k++;
                    
                }
                
            }
            
        }
        for(int p=0;p<crr.length;p++)
        {
            System.out.print(crr[p]+" ");
        }


    
}
}