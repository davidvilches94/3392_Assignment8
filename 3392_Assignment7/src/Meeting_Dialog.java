import javax.swing.*;
@SuppressWarnings("serial")
public class Meeting_Dialog extends JFrame
{
	public Meeting_Dialog()
	{
		String name;
		
		 name = JOptionPane.showInputDialog("Enter your name. ");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		int value;
		value = JOptionPane.showConfirmDialog(null, "Is " + name + " your name ?","Please Confirm", JOptionPane.YES_NO_OPTION);
		
		if (value == JOptionPane.NO_OPTION)
		{
			name = JOptionPane.showInputDialog("Enter your name. ");
		}
		else if (value == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null,"nice to meet you " + name + " .");
		}
			
	}
	public static void main(String []args)
	{
		@SuppressWarnings("unused")
		Meeting_Dialog MD = new Meeting_Dialog();
	}
}
