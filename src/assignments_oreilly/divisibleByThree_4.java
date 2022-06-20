package assignments_oreilly;

import java.util.Scanner;

public class divisibleByThree_4
{
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n= s.nextInt();

        if((n%3)==0)
        {
            System.out.println("divisible by 3");
        }
        else
        {
            System.out.println("not divisible by 3");
        }
    }
}
