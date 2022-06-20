package assignments_oreilly;

import java.util.Scanner;

public class arrays_6
{
    public static void main(String[] args)
    {
        int i;
        int[] myArray = new int[5];
        System.out.println("enter 5 numbers");
        Scanner s = new Scanner(System.in);
        for(i=0;i<myArray.length;i++)
        {
            myArray[i]=s.nextInt();
        }

        for(int n:myArray)
        {
            System.out.println(n*2);
        }
    }
}
