package assignments_oreilly;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayReverse_7
{
    public static void main(String[] args)
    {
        int i;
        ArrayList<Integer> array = new ArrayList<>();

        int n;
        System.out.println("enter num");
        Scanner s = new Scanner(System.in);
        n=s.nextInt();

        while(n>0)
        {
            array.add(n);
            System.out.println("enter num");
            //Scanner s = new Scanner(System.in);
            n=s.nextInt();
        }

        for( i=array.size()-1;i>=0;i--)
        {
            System.out.println(array.get(i));
        }
    }
}
