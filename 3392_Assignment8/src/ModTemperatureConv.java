import javax.swing.*;

import java.awt.event.*;
@SuppressWarnings("serial")
public class ModTemperatureConv extends JFrame
{
	private JPanel panel;
	private JLabel label1;
	private JTextField textfield1;
	private JRadioButton button1;
	private JRadioButton button2;
	private ButtonGroup radioButtonGroup;
	private JTextField textfield2;
	private final int WINDOW_WIDTH = 700;
	private final int WINDOW_HEIGHT = 80;
	
	public ModTemperatureConv()
	{
		super("Temperature Converter");
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	private void buildPanel()
	{
		label1 = new JLabel("Enter a value in Celsius or Fahrenheit");
		textfield1 = new JTextField(6);
		
		button1 = new JRadioButton("Convert to Fahrenheit");
		button1.addActionListener(new ConversionListener());
		
		button2 = new JRadioButton("Convert to Celsius");
		button2.addActionListener(new ConversionListener());
		
		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(button1);
		radioButtonGroup.add(button2);
		
		textfield2 = new JTextField(6);
		panel = new JPanel();
		panel.add(label1);
		panel.add(textfield1);
		panel.add(button1);
		panel.add(button2);
		panel.add(textfield2);
	}
	private class ConversionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String input;
			double result = 0.0;
			input = textfield1.getText();
			
			if(e.getSource() == button1)
			{
				result =  Double.parseDouble(input)*(9.0/5)+32;
				textfield2.setText(result + " ");
			}
			else if(e.getSource() == button2)
			{
				result = Double.parseDouble(input)-32*(5/9);
			    textfield2.setText(result + " ");
			}
		}
	}
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		ModTemperatureConv mtc = new ModTemperatureConv();
	}
}