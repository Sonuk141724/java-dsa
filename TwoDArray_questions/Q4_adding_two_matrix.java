package TwoDArray_questions;
import java.util.*;
public class Q4_adding_two_matrix 
{
    public static void main(String[] args) 
    {
        int [][] a ={{1,9,2},{3,7,4},{8,5,6}};
        int [][] b ={{9,3,7},{8,6,5},{2,4,1}};

        int [][] c = new int [a.length][b[0].length];

        System.out.println("Elements of first array");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("Elements ofsecond array");
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[0].length;j++)
            {
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("Elements of third array");
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[0].length;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
            
        }
        System.out.println("Elements of  new third array");
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[0].length;j++)
            {
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }


        


        
    }
    
}
