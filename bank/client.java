package bank;

public class client {
    public static void main(String []args)
    {
        Account firstAccount=new Account(1,"ford",600.0);
        BankService bankService=new BankServiceimpl();
        System.out.println(firstAccount);

        try {
            Double balance=bankService.addFundsToAccount(firstAccount, 750.0);
        } catch (addFundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(firstAccount);

        try {
            bankService.addFundsToAccount(null,750.0);
        } catch (addFundException e) {
            System.out.println(e.getMessage());
        }


        System.out.println(firstAccount);

        try {
            bankService.withDrawFundsFromAccount(firstAccount,84.0);
        } catch (withDrawException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(firstAccount);
        Account secondAccount=new Account(2,"cts",1100.0);
        try {
            bankService.fundTransfer(firstAccount,secondAccount,1000.0);
        } catch (fundTransferException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(secondAccount);
    }
}
