package bank;

public interface BankService {
    Double addFundsToAccount (Account accountObjRef,Double amount) throws addFundException;
    Double withDrawFundsFromAccount(Account account,Double amount) throws withDrawException;
    Boolean fundTransfer(Account fromAccount,Account toAccount,Double amount)throws fundTransferException;
    void displayAccountInfo();
}
