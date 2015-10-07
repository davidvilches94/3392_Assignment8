
@SuppressWarnings("serial")
public class Invalid_Hourlypay extends Exception
{
	public Invalid_Hourlypay()
	{
		super("Error: The value for Hourly pay rate is invalid.Value cannot be negative. Only values from 0-25");
	}
}