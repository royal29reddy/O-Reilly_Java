package assignments_oreilly;

import java.util.Scanner;

public class madLibsClone_2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        String adjective1,girlName, adjective2, occupation, placeName, clothing, hobby, adjective3, occupation2, boysName, nansName;

        System.out.println("enter an adjective\t");
        adjective1 = s.nextLine();

        System.out.println("enter girls name\t");
        girlName = s.nextLine();

        System.out.println("enter another adjective\t");
        adjective2=s.nextLine();

        System.out.println("enter an occupation\t");
        occupation=s.nextLine();

        System.out.println("enter name of place\t");
        placeName=s.nextLine();

        System.out.println("enter name of place of clothing\t");
        clothing = s.nextLine();

        System.out.println("enter the name of hobby\t");
        hobby=s.nextLine();

        System.out.println("enter another adjective\t");
        adjective3=s.nextLine();

        System.out.println("enter another occupation\t");
        occupation2=s.nextLine();

        System.out.println("enter boys name\t");
        boysName=s.nextLine();

        System.out.println("enter nans name");
        nansName=s.nextLine();

        System.out.println("There once was a"+ adjective1 + "girl named" + girlName + "who was a"+adjective2 + " "+occupation+"in the kingdom of" + placeName +".");

        System.out.println("she loved to wear"+clothing+" and to "+hobby+ ". She wanted to marry "+adjective3 +" "+ occupation2+" named "+boysName +" but her father, king "+nansName+ " forbid her from seeing him. " );


    }
}
