
public class TestPayroll 
{
	public static void main(String [] args)
	{
		try
		{
			Payroll worker1 = new Payroll();
			worker1.setName(" ");
			worker1.setID(-56);
			worker1.setHours_worked(86);
			worker1.setPay_rate(26);
		}
		catch (Invalid_String|Invalid_ID |Invalid_HoursWorked|Invalid_Hourlypay e)
		{
			System.out.println(e.getMessage());
		}
	}
}
