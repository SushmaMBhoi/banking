package banking;
//import java.util.*;
import static banking.bank.myAcct;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author sushma
 */
public class Banking 
{
     /**
     * @param args the command line arguments
     */
     public static void main(String[] args) 
     {
         bank B = new bank();
         //Account A = new Account();
         Scanner a = new Scanner(System.in);
         int acctNo1, acctNo2; 
         String name;
         
       for(;;)
       {
         System.out.println("1. Create new account");
         System.out.println("2. Deposit amount");
         System.out.println("3. Withdraw amount");
         System.out.println("4. Transfer amount");
         System.out.println("5. Total amount in account");
         System.out.println("6. Richest person");
         
         System.out.println("Enter your choice: ");
         int choice = a.nextInt();
                 
        
           {
                switch(choice)
                {
                     
                   case 1:System.out.println("Enter your name: ");
                          name = a.next();
                          B.addAccount(name);
                          
                          break;
                       
                   case 2:System.out.println("Enter your account number: ");
                          acctNo1 = a.nextInt();
                          B.Deposit(acctNo1);
                                                   
                         System.out.println("Your account balance : " +myAcct.get(acctNo1).balance); 
                          break;
                       
                   case 3:System.out.println("Enter your account number: ");
                          acctNo1 = a.nextInt();
                          B.Withdraw(acctNo1);
                          
                          System.out.println("Balance :"+  myAcct.get(acctNo1).balance);
                          break;
                       
                   case 4:System.out.println("Enter your account number: ");
                          acctNo1 = a.nextInt();
                          
                          System.out.println("Enter account number of a person to whom you want to transfer amount: ");
                          acctNo2 = a.nextInt();
                            
                          B.Transfer(acctNo1, acctNo2);
                          break;
                          
                   case 5:System.out.println("Enter your account number: ");
                          acctNo1 = a.nextInt();
                          B.Balance(acctNo1);
                          
                          System.out.println("The balance amount is :"+myAcct.get(acctNo1).balance);
                          break;
                       
                   case 6:B.Richest();
                          break;
                           
                  default:System.exit(0);  
                }
           }
        }
     }
}
