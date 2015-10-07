
public class Payroll 
{
	private String Name;
	private int ID;
	private double pay_rate;
	private int hours_worked;
	
	public Payroll()
	{
		Name = " ";
		ID = 0;
		pay_rate = 0;
		hours_worked = 0;
	}
	public Payroll (String name, int id) 
	{
		this.Name = name;
		this.ID = id;
	}
	public String getName() 
	{
		return Name;
	}
	public void setName(String name)throws Invalid_String
	{
		if(name.equals (" "))
			throw new Invalid_String();
		else
		Name = name;
	}
	public int getID() 
	{
		return ID;
	}
	public void setID(int id)throws Invalid_ID
	{
		if(id <= 0)
			throw new Invalid_ID();
		else
		ID = id;
	}
	public double getPay_rate() 
	{
		return pay_rate;
	}
	public void setPay_rate(double pay_rate) throws Invalid_Hourlypay
	{
		if(pay_rate < 0||pay_rate > 25)
			throw new Invalid_Hourlypay();
		else
		this.pay_rate = pay_rate;
	}
	public int getHours_worked() 
	{
		return hours_worked;
	}
	public void setHours_worked(int hours_worked) throws Invalid_HoursWorked
	{
		if(hours_worked < 0 ||hours_worked > 84)
			throw new Invalid_HoursWorked();
		else
		this.hours_worked = hours_worked;
	}
	public double calculateGrossPay() 
	{
		return hours_worked*pay_rate;
	}
}
