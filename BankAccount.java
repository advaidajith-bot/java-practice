
public class BankAccount{
private double balance;
BankAccount(){
 balance=0;}

void deposit(double amount){
balance+=amount;}

void withdraw(double amount){
if(amount>balance)throw new IllegalArgumentException("Insufficient funds");
balance-=amount;
}

public static void main(String[]args){
BankAccount b1=new BankAccount();
b1.deposit(1000);
System.out.println("this is the current balance:"+b1.balance);
try{
b1.withdraw(300);
System.out.println("this is the current balance:"+b1.balance);
b1.withdraw(5000);}catch(IllegalArgumentException e){System.out.println("Error: "+e.getMessage());}
System.out.println("this is the current balance:"+b1.balance);
}
}
