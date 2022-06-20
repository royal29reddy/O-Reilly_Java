package assignments_oreilly;

import java.util.Scanner;

public class findingCost_3
{
    public static void main(String[] args)
    {
        int n,c;
        System.out.println("enter your package num 1,2,3 : ");
        Scanner s = new Scanner(System.in);

        n=s.nextInt();

        System.out.println("enter num of courses");
        c=s.nextInt();

        if( n == 1)
        {
            if(c<=2)
            {
                System.out.println("10$");
            }
            else
            {
                System.out.println((10+(c-2)*6)+"$");
            }
        }
        else if(n==2)
        {
            if(c<=4)
            {
                System.out.println("12$");
            }
            else
            {
                System.out.println((12+(c-4)*4)+"$");
            }
        }
        else if(n==3)
        {
            if(c<=6)
            {
                System.out.println("15$");
            }
            else
            {
                System.out.println((15+(c-6)*3)+"$");
            }
        }
        else
        {
            System.out.println("wrong choice");
        }
    }
}
