
public class NegativeStartingBalance extends BankAccount 
{
	/**
    This constructor uses a generic
    error message.
    */

    public NegativeStartingBalance()
    {
    super("Error: Negative starting balance");
    }

    /**
    This constructor specifies the bad starting
    balance in the error message.
    @param The bad starting balance.
    */

    public NegativeStartingBalance(double amount)
    {
    super("Error: Negative starting balance: " + amount);
    }


}
