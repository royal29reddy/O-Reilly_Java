package assignments_oreilly;

import java.security.PublicKey;

class bankAccount_11
{
    String owner;
    int balance;

    bankAccount_11(String owner)
    {
        this.owner=owner;
        this.balance=balance;
    }

    bankAccount_11(String owner,int balance)
    {

    }

    void deposit(int amount)
    {
        if(amount>0)
        {
            balance+=amount;
        }
        else
        {
            System.out.println("amount to deposit must be greater than 0");
        }
    }

    void withdraw(int amount)
    {
        if(amount>=0 && amount<=balance )
        {
            balance-=amount;
        }
        else
        {
            System.out.println("cannot withdraw ur balance is less");
        }
    }

    String getName()
    {
        return owner;
    }

    int getBalance()
    {
        return balance;
    }

}
