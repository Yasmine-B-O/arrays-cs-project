package samplearrays;
import java.util.Arrays;
public class BankAccount {
    private int num_transaction =0;
    private final String name;
    private double currentBalance;
    //TO-DO: Initialize an Array with 1000 in size that stores Double called 'transactions' to keep track of the user's transactions
    public static double [] transactions=new double[1000];
    public BankAccount(String name, int startingBalance){
           this.name=name;
           this.currentBalance=startingBalance;
    }

    public void deposit(double amount){
         if(amount>0){
            this.currentBalance+=amount;
            transactions[num_transaction]=amount;
            num_transaction++;
            System.out.println("The depositor is :"+name+" ,the deposit amount :"+amount+" ,his new balance is "+currentBalance);
         }
         else{
             System.out.println("unsuccessful deposits");
         }
    }

    public void withdraw(double amount){
         if(amount>=currentBalance){
             this.currentBalance-=amount;
             transactions[num_transaction]=-amount;
             num_transaction++;
         }
         else{
             System.out.println("unsuccessful withdraw");
         }
    }

    public void displayTransactions(){
         System.out.println(Arrays.toString(transactions));
    }

    public void displayBalance(){
         System.out.println("The current balance is "+currentBalance);
    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}
