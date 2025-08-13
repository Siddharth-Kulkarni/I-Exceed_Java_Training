abstract class bankaccount
{
    int accountnumber;
    double balance;
    abstract public void deposit(int amount);
    abstract public void withdraw(int amount);
    abstract public double getbalance(int amount);
}
 
class savingbankaccount extends bankaccount
{
    savingbankaccount(int accountnumber,double balance)	
	{
	   this.accountnumber=accountnumber;
	   this.balance=balance;
	}
 
    @Override
     public void deposit(int amount)
	{
	  balance+=amount;
	}
 
    @Override
     public void withdraw(int amount){
	  if(balance>amount)
	   {
	     balance-=amount;
	   }
	  else
            {
	       System.out.println("Insufficient balance");
	    }
	}
 
    @Override
     public double getbalance(){return balance;}
}
 
public class fixedbankaccount extends bankaccount
{
    fixedbankaccount(int accountnumber,double balance)
	{
	  this.accountnumber=accountnumber;
	  this.balance=balance;
	}
 
    @Override
    public void deposit(int amount){balance+=amount;}
 
    @Override
    public void withdraw(int amount)
	{
  	   throw new UnsupportedException();
	    balance-=amount;
	}
    @Override
    public void getbalance()
	{
	  return balance;
	}
   }