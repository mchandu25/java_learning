package bank;

public class BankServiceimpl implements BankService{

    @Override
    public Double addFundsToAccount(Account accountObjRef, Double amount) throws  addFundException{
        if(accountObjRef==null)
        {
//            System.out.println("Account can be null");
//            return null;
            throw new addFundException("Adding fund has failed due to invalid input");
        }
        if(amount<0)
        {
            throw new addFundException("Adding fund has failed due to invalid input");
        }
        accountObjRef.setBalance(accountObjRef.getBalance()+amount);
        return accountObjRef.getBalance();
    }

    @Override
    public Double withDrawFundsFromAccount (Account account, Double amount) throws withDrawException
    {
       if(amount<=0)
       {
           throw new withDrawException("Enter valid input to withdraw");
       }
       if(amount>account.getBalance())
       {
           throw new withDrawException("Enter valid input to withdraw");
       }
       account.setBalance(account.getBalance()-amount);
       return account.getBalance();
    }

    @Override
    public Boolean fundTransfer(Account fromAccount, Account toAccount,Double amount) throws fundTransferException{
        if(fromAccount==null || toAccount==null)
        {
            throw new fundTransferException("Enter valid account number");

        }
        if(amount<fromAccount.getBalance())
        {
            throw new fundTransferException("Enter the amount lesser than or equal to your balance");
        }
        toAccount.setBalance(toAccount.getBalance()+amount);
        fromAccount.setBalance(fromAccount.getBalance()-amount);
        return true;
    }

    @Override
    public void displayAccountInfo() {

    }
}
