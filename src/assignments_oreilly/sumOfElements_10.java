package assignments_oreilly;

import java.util.ArrayList;
import java.util.Scanner;

public class sumOfElements_10
{
    public static void main(String[] args)
    {
        ArrayList<Integer> myArray = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("enter a no.");
            myArray.add(s.nextInt());
        }
        int result=sumOfEle(myArray);
        System.out.println(result);
    }

    public static int sumOfEle(ArrayList<Integer> myArr)
    { int s=0;
        for(int i=0;i<myArr.size();i++)
        {
            s+=myArr.get(i);
        }
        return s;
    }
}
