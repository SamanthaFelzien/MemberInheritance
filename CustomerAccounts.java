/*Program: Reads in a file, instantiates an object customerAccount with values from text file. The class customerAccount uses data
 * members from the Customer class as class attributes. The average balance, account status, and penalty fee are calculated.
 * Developer: Samantha Felzien
 * Date: 2/14/17
 * Class: CIS 279
 */

import java.util.*;
import java.io.*;

public class CustomerAccounts{
  public static void main(String [] args) {
    
    //read in file 
    String accountInfo = "HW3_Accounts.txt";
    try {
      Scanner in = new Scanner(new FileReader(accountInfo));
      System.out.println("Account     Customer      First       Last       Credit      Credit      Ending      Account     Penalty      Average    Interest"); 
      System.out.println("Number        ID          Name        Name       Score       Limit      Balance      Status       Fee         Balance      Rate");
      System.out.println();
      while (in.hasNext()){
        //set as object attributes
        CreditCardAccounts2 customerAccount = new CreditCardAccounts2();
        customerAccount.setAccountNum(Integer.parseInt(in.nextLine()));
        customerAccount.setBegBal(Double.parseDouble(in.nextLine()));
        customerAccount.setEndBal(Double.parseDouble(in.nextLine()));
        customerAccount.setCredLim(Double.parseDouble(in.nextLine()));
        customerAccount.setIntRate(Double.parseDouble(in.nextLine()));
        customerAccount.setCustomerNum(Integer.parseInt(in.nextLine())); 
        customerAccount.setLastName(in.nextLine());
        customerAccount.setFirstName(in.nextLine());
        customerAccount.setCredScore(Integer.parseInt(in.nextLine())); 
        
        //call print method
        System.out.println(customerAccount.toString());
      }   
      in.close();
    }catch(FileNotFoundException fnf){
      fnf.printStackTrace();
    }//file not found
    catch (Exception e) {
      e.printStackTrace();
      System.out.println("\nProgram terminated Safely...");
    }
  }
}