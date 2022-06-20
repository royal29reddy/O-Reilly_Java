package assignments_oreilly;

public class bankAccount_11Demo
{
    public static void main(String[] args) {

        bankAccount_11 ba = new bankAccount_11("bob");
        bankAccount_11 ba1 = new bankAccount_11("john",3000);

        ba.deposit(1000);

        System.out.println("owner "+ba.getName());
        System.out.println("balance "+ba.getBalance());



    }
}
