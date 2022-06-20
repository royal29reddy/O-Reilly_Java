package assignments_oreilly;

import java.util.Scanner;

public class avgOfThreePara_1
{
    public static void main(String[] args)
    {
        System.out.println("enter 1st number");
        float n1,n2,n3;

        Scanner s = new Scanner(System.in);

        n1 = s.nextFloat();
        n2 = s.nextFloat();
        n3 = s.nextFloat();

        System.out.println("avg of 3 nos is : " + (n1+n2+n3)/3.0);

    }
}
