public class Customer {
  
  private int customerNum;
  private String lastName;
  private String firstName;
  private int credScore;
  
  //default constructor 
  public Customer()
  { 
    
    setCustomerNum(0);
    setLastName("");
    setFirstName("");
    setCredScore(0); 
  }
  
  //parm constructor 
  public Customer(int customerNum, String lastName, String firstName, int credScore)
  { 
    
    setCustomerNum(customerNum);
    setLastName(lastName);
    setFirstName(firstName);
    setCredScore(credScore); 
  }
  
  //setter and getter methods
  public void setCustomerNum (int customerNum) {
    this.customerNum = customerNum;
  }
  public int getCustomerNum(){
    return customerNum;
  }
  
  
  public void setLastName (String lastName) {
    this.lastName = lastName;
  }
  public String getLastName(){
    return lastName;
  }
  
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public  String getFirstName(){
    return firstName;
  }
  
  
  public  void setCredScore (int credScore) {
    this.credScore = credScore;
  }
  public int getCredScore(){
    return credScore;
  }
  
  
  
};
