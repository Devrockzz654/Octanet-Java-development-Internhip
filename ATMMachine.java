
import java.util.*;
class ATM{
    float Balance;
    int PIN=5674;
    public void checkpin(){
        System.out.println("Enter your pin:");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        if(pin==PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
            checkpin();
        }
    }
    public void menu(){
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("Enter your choice:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                checkbalance();
                break;
            case 2:
                deposit();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Enter a valid choice");
        }
    }
    public void checkbalance(){
        System.out.println("Balance:"+Balance);
        menu();
    }
    public void withdraw(){
        System.out.println("Enter amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        float withdraw = sc.nextFloat();
        if(withdraw>Balance){
            System.out.println("Insufficient balance");
            menu();
        }
        else{
            Balance = Balance-withdraw;
            System.out.println("Balance:"+Balance);
            menu();
        }
    }
    public void deposit(){
        System.out.println("Enter amount to deposit:");
        Scanner sc = new Scanner(System.in);
        float deposit = sc.nextFloat();
        Balance = Balance+deposit;
        System.out.println("Amount deposited");
        System.out.println("Balance:"+Balance);
        menu();
    }
}
public class ATMMachine{
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.checkpin();
    }
}
