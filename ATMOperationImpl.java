package ATM;

import java.util.HashMap;
import java.util.Map;

public class ATMOperationImpl implements ATMOperationInterf
{
    ATM atm = new ATM();
    HashMap<Double, String> mini = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance Is : "+atm.getBalance());
    }

    @Override
    public void WithdrawAmount(double WithdrawAmt)
    {
        if(atm.getBalance() < WithdrawAmt)
        {
            System.out.println("No Enoough Balance ");
        }
        else {
            System.out.println(WithdrawAmt + "$ Withdrwn Suceessfully ");
            atm.setBalance(atm.getBalance() - WithdrawAmt);
            mini.put(WithdrawAmt, "Debited");
            viewBalance();
        }
    }

    @Override
    public void depositAmount(double depositAmt)
    {
        System.out.println(depositAmt+"$ Deposited Sucessfully");
        atm.setBalance(atm.getBalance()+depositAmt);
        mini.put(depositAmt, "credited");
        viewBalance();
    }

    @Override
    public void viewMiniStatement()
    {
        for(Map.Entry<Double,String> m : mini.entrySet())
        {
            System.out.println("[\t"+m.getKey()+"\t"+ m.getValue()+"]");
        }
    }
}
