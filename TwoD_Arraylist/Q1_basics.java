package TwoD_Arraylist;
import java.util.*;
public class Q1_basics 
{
    public static void main(String[] args) 
    {
        List <Integer> a = new ArrayList<>();
        a.add(5);
        a.add(10);
        a.add(45);

        List <Integer> b = new ArrayList<>();
        b.add(40);
        b.add(65);

        List <Integer> c = new ArrayList<>();
        List <Integer>d = new ArrayList<>();
        d.add(60);

        List<List<Integer>> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);
        l.add(d);
       

        for(int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i) +" ");
        }
        
    }
    
}
