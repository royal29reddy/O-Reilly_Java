package assignments_oreilly;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList_8 {
    public static void main(String[] args)
    {
        int n,i;
        String s1;

        Scanner s = new Scanner(System.in);
        ArrayList<String> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        for(i=0;i<5;i++)
        {
            //Scanner s = new Scanner(System.in);

            s1= s.nextLine();

            n=s.nextInt();
            s.nextLine();//consume newlinw

            array1.add(s1);
            array2.add(n);
        }

        for(i=0;i<array1.size();i++)
        {
            System.out.println(array1.get(i) + " is "+array2.get(i) +" years old ");
        }
    }
}
