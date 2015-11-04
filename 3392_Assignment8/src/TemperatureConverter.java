import javax.swing.*;

import java.awt.event.*;
import java.text.DecimalFormat;
@SuppressWarnings("serial")
public class TemperatureConverter extends JFrame
{
	private JPanel panel;
	private JLabel temp1_text;
	private JTextField temp1_field;
	private JLabel temp2_text;
	private JTextField temp2_field;
	private JButton convert;
	private final int WINDOW_WIDTH = 460;
	private final int WINDOW_HEIGHT = 80;
	
	public TemperatureConverter()
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
		temp1_text = new JLabel("Celsius:");
		temp1_field = new JTextField(10);
		temp2_text = new JLabel("Fahrenheit:");
		temp2_field = new JTextField(10);
		convert = new JButton("Convert");
		convert.addActionListener(new ConversionListener());
		panel = new JPanel();
		panel.add(temp1_text);
		panel.add(temp1_field);
		panel.add(temp2_text);
		panel.add(temp2_field);
		panel.add(convert);
	}
	private class ConversionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String input;
			double celsius;
			double fahrenheit;
			input = temp1_field.getText();
			celsius = Double.parseDouble(input);
			fahrenheit = celsius*(9.0/5)+32;
			@SuppressWarnings("unused")
			DecimalFormat df = new DecimalFormat("#.##");
			temp2_field.setText(fahrenheit + " ");
		}
	}
	public static void main (String [] args)
	{ 
		@SuppressWarnings("unused")
		TemperatureConverter tc = new TemperatureConverter();
	}
}