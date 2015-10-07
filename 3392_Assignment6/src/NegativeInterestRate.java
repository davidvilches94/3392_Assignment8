
public class NegativeInterestRate extends BankAccount
{
	/**
    No arg constructor
    */

    public NegativeInterestRate()
    {
    super("Error: Negative interest rate");
    }

    /**
    The following constructor accepts the amount that was 
    given as the interest rate.
    */

    public NegativeInterestRate(double amount)
    {
    super("Error: Negative interest rate: " + amount);
    }


}
