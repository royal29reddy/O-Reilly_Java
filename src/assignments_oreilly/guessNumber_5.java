package assignments_oreilly;
import java.util.Random;
import java.util.Scanner;

public class guessNumber_5 {
    public static void main(String[] args) {
        int cnum, ourNum, cnt = 0,i=0;
        while(i<5) {
            Random randomNumber = new Random();

            cnum = randomNumber.nextInt(100) + 1;

            Scanner s = new Scanner(System.in);
            ourNum = s.nextInt();

            if (cnum == ourNum) {
                System.out.println("congratulations you guessed the number in number guess");
                cnt += 1;
            }
            else if(ourNum< cnum/2)
            {
                System.out.println("your guess was too low");
            }
            else if(ourNum>cnum)
            {
                System.out.println("ypur guess was too high");
            }
            else if(ourNum<1 || ourNum>100)
            {
                System.out.println("that was a wasted guess! pick number betwwen 1 and 100");
            }
            i++;
        }
    }
}
