import java.util.*;  
public class Atm  
{   
    public static void main(String args[] )  
    {    
        int balance = 10000, withdraw, deposit;    
        Scanner sc = new Scanner(System.in);  
        while(true)  
        {   
            System.out.println("1.Withdraw");  
            System.out.println("2.Deposit");  
            System.out.println("3.Check Balance");  
            System.out.println("4.EXIT");  
            System.out.print("Enter your choice:");   
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:
                System.out.print("Enter the Withdrawl amount:");  
                withdraw = sc.nextInt();     
                if(balance >= withdraw)  
                {    
                  balance = balance - withdraw;  
                  System.out.println("please collect your money.Remaining balance:"+balance);  
                }  
                else  
                {    
                  System.out.println("Insufficient Balance.Withdrawal failed!");  
                }  
                System.out.println("");  
                break;  
   
                case 2:
                System.out.print("Enter money to be deposited:");  
                deposit = sc.nextInt();    
                balance = balance + deposit;  
                System.out.println("Your Money has been successfully deposited.New balance:"+balance);  
                System.out.println("");  
                break;  
   
                case 3:
                System.out.println("Current Balance : "+balance);  
                System.out.println("");  
                break;  
   
                case 4:   
      
                System.out.println("Exiting.Thank you!");  
                System.exit(0);
            }  
        }  
    }  
}  