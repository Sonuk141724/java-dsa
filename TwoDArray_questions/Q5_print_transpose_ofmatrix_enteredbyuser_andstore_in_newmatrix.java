package TwoDArray_questions;
import java.util.*;
public class Q5_print_transpose_ofmatrix_enteredbyuser_andstore_in_newmatrix 
{
   public static void main(String[] args) 
   {
    int [][] arr = {{10,20,30},{40,50,60},{70,80,90},{100,110,120}};
    int m=arr.length;
    int n =arr[0].length;
    System.out.println("Array elements are");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[i][j]+"  ");
        }
        System.out.println();
    }

    System.out.println("transpose of the array are");
    for(int j=0;j<n;j++)
    {
        for(int i=0;i<m;i++)
        {
            System.out.print(arr[i][j]+"  ");
        }
        System.out.println();
    }

    // storing in new array
System.out.println();
    int transpose[][]= new int[n][m];
   
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            transpose[i][j]=arr[j][i];
            System.out.print(transpose[i][j]+" ");
        }
        System.out.println();
    }


   }


    
}
