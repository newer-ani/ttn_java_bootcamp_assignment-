package q2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Deadlock {

    public static void main(String[] args) {

        Account account1 = new Account("12345",100000);
        Account account2 = new Account("54321",200000);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0;i<500;i++)
                {
                    transfer(account1,account2,100);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0;i<500;i++)
                {
                    transfer(account2,account1,100);
                }
            }
        });

        t1.start();
        t2.start();

    }
    private static void transfer(Account fromAccount,Account toAccount,Integer amount){

       // synchronized (fromAccount.getLock()){
         //   synchronized (toAccount.getLock()){

        while(true)
        {
        boolean fromLockAcquired = fromAccount.getLock().tryLock();
        boolean toiLockAcquired = toAccount.getLock().tryLock();
        if(fromLockAcquired && toiLockAcquired)
        {
            try {
                fromAccount.setAmount(fromAccount.getAmount() - amount);
                toAccount.setAmount(toAccount.getAmount() + amount);
                System.out.println("Transferred " + amount + " from " + fromAccount.getAccountName() + " to " + toAccount.getAccountName());
            } finally {
                fromAccount.getLock().unlock();
                toAccount.getLock().unlock();
            }
            break;
        }
            if (fromLockAcquired) {
                fromAccount.getLock().unlock();
            }
            if (toiLockAcquired) {
                toAccount.getLock().unlock();
            }

            }
        }
    }


class Account{

    private String accountName;

    private Integer amount;

    private final Lock lock = new ReentrantLock();

    public Account(String accountName, Integer amount) {
        this.accountName = accountName;
        this.amount = amount;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Lock getLock() {
        return lock;
    }

}


