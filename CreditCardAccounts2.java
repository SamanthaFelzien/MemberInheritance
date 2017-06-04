public class CreditCardAccounts2 
{
  private int accountNum; 
  private double begBal;
  private double endBal; 
  private double credLim;
  private double intRate;
  private Customer customerObj;
  double average; 
  String status = getStatus(endBal,credLim);
  double penalty = getPenalty(status, endBal);
  double perRate = getPerRate(intRate); 
  
  //default constructor 
  public CreditCardAccounts2()
  { 
    setAccountNum(0);
    setBegBal(0.0);
    setEndBal(0.0);
    setCredLim(0.0); 
    setIntRate(0.0); 
    
    customerObj = new Customer();
    
  }
  
  //parm constructor 
  public CreditCardAccounts2(int accountNum, double begBal, double endBal, double credLim, double intRate, int customerNum, String lastName, String firstName, int credScore)
  { 
    setAccountNum(accountNum);
    setBegBal(begBal);
    setEndBal(endBal);
    setCredLim(credLim); 
    setIntRate(intRate);
    customerObj = new Customer(customerNum, lastName, firstName, credScore );
    
  }
  
  
  //getter and setter methods for CreditCardAccounts2
  public void setAccountNum (int accountNum) {
    this.accountNum = accountNum;
  }
  public int getAccountNum(){
    return accountNum;
  }
  
  public void setBegBal (double begBal) {
    this.begBal = begBal;
  }
  public double getBegBal(){
    return begBal;
  }
  
  public void setEndBal (double endBal) {
    this.endBal = endBal;
  }
  public double getEndBal(){
    return endBal;
  }
  
  public void setCredLim (double credLim) {
    this.credLim = credLim;
  }
  public double getCredLim(){
    return credLim;
  }
  
  public void setIntRate(double intRate) {
    this.intRate = intRate;
  }
  public double getIntRate(){
    return intRate;
  }
  
  
  // Define "setter" a.k.a. mutator methods.
  
  
  public void setCustomerNum( int customerNum ) 
  {
    this.customerObj.setCustomerNum(customerNum ) ; // Relay this action to customerObj's method.
  }
  
  public void setLastName( String lastName ) 
  {
    this.customerObj.setLastName( lastName ) ; // Relay this action to customerObj's method.
  }
  
  public void setFirstName( String firstName ) 
  {
    this.customerObj.setFirstName( firstName ) ; // Relay this action to customerObj's method.
  }
  
  public void setCredScore( int credScore ) 
  {
    this.customerObj.setCredScore( credScore ) ; // Relay this action to customerObj's method.
  }
  
 // Define "getter" a.k.a. accessor methods.
  
  public int getCustomerNum() 
  {
    return this.customerObj.getCustomerNum() ;  // Relay this action to customerObj's method.
  }
  
 public String getLastName() 
 {
   return this.customerObj.getLastName() ;  // Relay this action to customerObj's method.
 }
 
 public String getFirstName() 
 {
   return this.customerObj.getFirstName() ;  // Relay this action to customerObj's method.
 }

 public int getCredScore() 
 {
   return this.customerObj.getCredScore() ;  // Relay this action to customerObj's method.
 }
 
 //finds average balance
 Double getAverage(){
   average = (begBal+endBal)/2;
   return average; 
   
 }
 
 //finds account status
 public String getStatus(double endBal, double credLim){
   if (endBal > credLim )
   {
     status = "Over"; 
   } else {
     status =  "Ok";
   }
   return status; 
 }
 
 //calculates penalty fee
 public double getPenalty(String status, double endBal) {
   
   if (status == "Over"){
     penalty = (endBal* .05);
   } else {
     penalty = 0;
   }
   return penalty; 
   
 }
 
 //convert decimal into percenatage
 public double getPerRate(double intRate){
   perRate = (intRate * 100);
   return perRate;
 }
 
 //returns formatted string
 public String toString()
 {
   return String.format("%-12s%-13s%-12s%-13s%-11s%-12s%-13s%-12s%-13s%-13s%-10s", accountNum, customerObj.getCustomerNum(), customerObj.getFirstName(), customerObj.getLastName(),customerObj.getCredScore(), credLim, endBal, getStatus(endBal,credLim),getPenalty(status,endBal),getAverage(), getPerRate(intRate) + "%" );

 }
}  