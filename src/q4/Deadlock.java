package q4;

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

    }
    private static void transfer(Account fromAccount,Account toAccount,Integer amount){

        synchronized (fromAccount.getLock()){
            synchronized (toAccount.getLock()){

                toAccount.setAmount(toAccount.getAmount()+amount);
                fromAccount.setAmount(fromAccount.getAmount()-amount);

                System.out.println("from account :" +fromAccount.getAccountName()+"amount"+amount);
            }
        }
    }

}

class Account{

    private String accountName;

    private Integer amount;

    private Object lock;

    public Account(String accountName, Integer amount) {
        this.accountName = accountName;
        this.amount = amount;
        this.lock = new Object();
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

    public Object getLock() {
        return lock;
    }

    public void setLock(Object lock) {
        this.lock = lock;
    }
}

