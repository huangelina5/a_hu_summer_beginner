public class lesson4_class_bank{
  public static void main(String[] args){
//https://www3.ntu.edu.sg/home/ehchua/programming/java/images/ClassDiagram_Account.png
    Account acc1 = new Account(1, 102.19);
    System.out.println(acc1);

    System.out.println(acc1.getBalance());
  }
}

class Account{
  int accountNumber;
  double balance;

  public Account(int accountNumber, double balance){
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public Account (int accountNumber){
    this.accountNumber = accountNumber;
  }

  public int getAccoutNumber(){
    return this.accountNumber;
  }

  public double getBalance(){
    return this.balance;
  }

  public void setBalance(double balance){
    this.balance = balance;
  }

  public void credit(double amount){
    amount = amount + balance;
  }

  public void debt(double amount){
    if (balance >= amount){
      balance = balance - amount;
    }
    else{
      System.out.println("amount withdrawn exceeds the current balance!");
    }
  }

  public String toString(){
    return "A/C no: "+this.accountNumber+" Balance = " + this.balance;
  }

}
