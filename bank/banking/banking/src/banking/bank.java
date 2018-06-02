/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sushma
 */
public class bank
{
    static int accNo = 0;
    static ArrayList<Account> myAcct = new ArrayList<>();
    
    /**
     * addAccount will add as many account as user wanted to add
     * @param name is a name of account holder
     */
   String addAccount(String name)
    {
        Account A = new Account();
        A.name = name;
        myAcct.add(A);
        System.out.println("Your account is created with account number : " +accNo++);
        return (name);
    }
   
   /**
    * Deposit method is used to deposit amount in his/her account
    * @param accNum is account number of a user who wanted to deposit money
    */ 
    int Deposit(int accNum)
    {
        int Damt;
        //System.out.println(accNum);
         //System.out.println(accNo);
               if(accNum < accNo && myAcct.get(accNum).name != null)
               {
                   System.out.println("Enter the amount to be deposite: ");
                   Scanner D = new Scanner(System.in);
                     Damt = D.nextInt(); 
                     myAcct.get(accNum).balance += Damt;
                     return (myAcct.get(accNum).balance);
                     
               }
               else
                  System.out.println("Account not found!\n");
               return 0;
    }
    
    /**
     * Withdraw method will withdraw amount from specified account number
     * @param accNum is a account number of a account holder
     */
    int Withdraw(int accNum)
    {
       int Wamt;
       //System.out.println(accNum);
               if( accNum < accNo && myAcct.get(accNum).name != null)
               {
                   System.out.println("Enter the amount to withdraw: ");
                   Scanner W = new Scanner(System.in);
                     Wamt = W.nextInt(); 
                     if(myAcct.get(accNum).balance >= Wamt)
                     {
                         myAcct.get(accNum).balance -= Wamt;
                         
                         System.out.println("Amount is withdrawn from your account " +accNum +", name: " + myAcct.get(accNum).name +" amount :" +Wamt);
                         return (myAcct.get(accNum).balance);
                     }
                     else
                         System.out.println("Insufficient Amount!\n");
                     return 0;
               }
               else
                  System.out.println("Account not found!\n");
               return 0;
    }
    
    /**
     * Transfer method will transfer the amount from one account holder to another account holder
     * @param accNum1 is the account number of sender
     * @param accNum2 is the account number of receiver
     */
    int Transfer(int accNum1, int accNum2)
    {
        int transAmt;
       
        if(accNum1 < accNo && myAcct.get(accNum1).name != null)
        {
            System.out.println("Enter the amount to be transfered: ");
            Scanner T = new Scanner(System.in);
            transAmt = T.nextInt();
            
            if(myAcct.get(accNum1).balance > transAmt)
            {
                if(accNum2 < accNo && myAcct.get(accNum2).name != null)
                {
                    myAcct.get(accNum1).balance -= transAmt;
                    myAcct.get(accNum2).balance += transAmt;
                    return (myAcct.get(accNum2).balance);
                }
                else
                    System.out.println("Transfer Account not found");
                return 0;
            }
            else
                System.out.println("Insufficient amount to transfer");
            return 0;
        }
        else
            System.out.println("Account not found");
        return 0;
      
    }
    
    /**
     * Balance method will display available balance in the account
     * @param accNum is the account number of a user who want to check his/her available balance
     */
   double Balance(int accNum)
    {            
        if(accNum < accNo && myAcct.get(accNum).name != null)
        {
           return (myAcct.get(accNum).balance);
            
        }
        else
            System.out.println("Account not found\n");
            return 0;
        
    }
    
   /**
    * Richest method will display richest person among all other account holder
    */
    void Richest()
    {
        int max=0, i, num = -1;
        for(i=0; i<accNo;i++)
        {
            if(myAcct.get(i).balance > max)
            {
                max = myAcct.get(i).balance;
                num = i;
            }
        }
        System.out.println("The richest person is: " +myAcct.get(num).name+ " with balance amount: "+myAcct.get(num).balance);
        
    }
}
