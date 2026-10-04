package Week3.practice;

public class BankAccount {
    private String holderName;
    private float balance;


    public BankAccount(String holderName, int balance){
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getHolderName(){
        return holderName;
    }
    public float getBalance(){
        return balance;
    }


    public void deposit(float amount){

        if (amount > 0){
            balance = balance + amount;
        }
        else {
            System.out.println("Invalid number!!!!");
        }
    }

    public void withdraw(float amount){

        if (amount > 0) {
            if (balance >= amount){
                balance = balance - amount;
            }
            else{
                System.out.println("You don't have enough money");
            }
        }
        else{
            System.out.println("Amount is negative: ");
        }
    }

    
    public void displayBalance(){
        System.out.println("Holder's name " + holderName);
        System.out.println("Bank Account balance " + balance);
    }





    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Nihat", 500);

        account1.deposit(300);
        account1.withdraw(20);
        account1.displayBalance();


    }

}
