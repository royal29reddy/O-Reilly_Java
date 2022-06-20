package assignments_oreilly;

import java.util.ArrayList;
import java.util.Scanner;

public class namePermutations_9
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        String n,f,l;
        int idx;

        ArrayList<String> name =  new ArrayList<>();
        ArrayList<String> lastName = new ArrayList<>();

        for (int i = 0; i < 5; i++)
        {
            System.out.println("enter"+i+"name");
            n=s.nextLine();
            idx=n.indexOf(" ");
            f=n.substring(0,idx);
            l=n.substring(idx+1);

            name.add(f);
            lastName.add(l);
        }

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.println(name.get(i)+" "+lastName.get(j));
            }
        }
    }
}