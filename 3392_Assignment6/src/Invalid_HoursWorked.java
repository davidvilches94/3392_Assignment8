
@SuppressWarnings("serial")
public class Invalid_HoursWorked extends Exception
{
	public Invalid_HoursWorked()
	{
		super("Error: The number of hours is invalid.Value cannot be negative.Only values from 0-84" );
	}
}
