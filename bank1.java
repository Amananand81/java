//ATM Machine Program (Very popular question)
//Menu:
//1. Check Balance
//2. Deposit
//3. Withdraw
//4. Exit
import java.util.*;
class ATM{
    int account_no;
    String account_holder;
    double balance;
    ATM(int account_no,String account_holder,double balance){
        this.account_no=account_no;
        this.account_holder=account_holder;
        this.balance=balance;
    }
    public void check_balance(){
        if(this.balance<0){
            System.out.println("insufficent balance");
        }
        else{
            System.out.println("balance: "+this.balance);
        }
    }
    public void deposite(double amt){
        this.balance=this.balance+amt;
    }
    public void withdraw(double amt){
        if(this.balance<amt){
            System.out.println("insufficent balance");
        }
        else{
            this.balance=this.balance-amt;
        }
    }
    public void display(){
        System.out.println("account_holder: "+this.account_holder);
        System.out.println("account_no: "+this.account_no);
        System.out.println("balance: "+this.balance);
    }
}
class bank1{
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter account_no: ");
        int acc=obj.nextInt();
        obj.nextLine();
        System.out.print("enter account holder: ");
        String name=obj.nextLine();
        System.out.print("enter balance: ");
        Double balance=obj.nextDouble();
        
        // object creating..
        ATM a1=new ATM(acc,name,balance);
        
        int choice=0;
        while(choice !=5){
            System.out.println("******* Bank Menu********");
            System.out.println("1. check balance");
            System.out.println("2. Deposite");
            System.out.println("3. withdraw");
            System.out.println("4. show detailes");
            System.out.println("5. exit");
            System.out.println("enter your choice: ");
            
            choice=obj.nextInt();
            switch(choice){
                case 1:
                    a1.check_balance();
                    break;
                
                case 2:
                    System.out.print("enter Amount: ");
                    double amt=obj.nextDouble();
                    a1.deposite(amt);
                    System.out.println("Amount deposited successfully"+amt);
                    break;
                case 3:
                    System.out.print("enter Amount: ");
                    amt=obj.nextDouble();
                    a1.withdraw(amt);
                    System.out.println("Amount withdraw successfully"+amt);
                    break;
                
                case 4:
                    a1.display();
                    break;
                
                case 5:
                    System.out.print("thankyou for using bank service");
                    break;
                 default:
                    System.out.println("Invalid choice");
                
                
               
                    
                
            }
        }
    }
}
