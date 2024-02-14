// Task 03 ATM Interface.
import java.util.*;

class BankAccount{
    private int balance;
    
    public BankAccount(int initialAmount){
        this.balance = initialAmount;
    }

    public int balance(){
        return balance;
    }
    public void deposit(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit of "+amount+"Rs was succsful");
        }
        else {
            System.out.println("Invalid entry!. Please choose a number above 0");
        }
        
    }
    public void withdraw(int amount){
        if(amount>0&& amount<=balance){
            System.out.println("Withdraw succesful of "+amount+"Rs");
            amount -=balance;
        }
        else{
            System.out.println("Invalid entry!.Insufficient balance or negative value entered ");
        }
    }
}


class ATM{
    private BankAccount account;
    public ATM(BankAccount account){
        this.account = account;
    }

public void display(){
    System.out.println("Select the optiopn:");
    System.out.println("1.Deposite");
    System.out.println("2.Withdraw");
    System.out.println("3.Check balance");
    System.out.println("4.Leave");
}

public void run(){
    Scanner sc =new Scanner(System.in);
    int option;

    do{
        display();
        System.out.println("Pick an option");
        option = sc.nextInt();

        switch(option){
            case 1:
                System.out.println("Enter amount to deposit");
                int depositAmount = sc.nextInt();
                account.deposit(depositAmount);
                break;
            case 2:
                System.out.println("Enter amount to withdraw");
                int withdrawAmount = sc.nextInt();
                account.withdraw(withdrawAmount);
                break;
            case 3:
                System.out.println("Current balance "+account.balance());
            case 4:
                System.out.println("Thanks for working with BOB bank");
                break;
            default:
                System.out.println("Invalid entry!!.Enter only the given option");
        }
    }while(option != 4);
    sc.close();;
}

}

public class Task_03{
    public static void main(String []args){
        BankAccount userAccount = new BankAccount(30000);
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}
