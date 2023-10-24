package view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Conversor extends JPanel implements ActionListener
{
	private JTextField textField;
	private JTextField textField_1;
	public JButton voltarBtn;
	
	public Conversor()
	{
		setLayout(null);
		
		voltarBtn = new JButton("VOLTAR");
		voltarBtn.setBounds(10, 11, 89, 23);
		voltarBtn.addActionListener(this);
		this.add(voltarBtn);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(471, 11, 419, 256);
		add(textArea);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 286, 430, 256);
		add(panel);
		panel.setLayout(new GridLayout(3, 4));
		
		JButton btnNewButton_1 = new JButton("1");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("2");
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("3");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton(".");
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("=");
		panel.add(btnNewButton_11);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(10, 567, 430, 60);
		add(panel_1_1);
		panel_1_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_12 = new JButton("APAGAR");
		panel_1_1.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("APAGAR TUDO");
		panel_1_1.add(btnNewButton_13);
		
		textField = new JTextField();
		textField.setBounds(222, 76, 218, 60);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(222, 183, 218, 60);
		add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 183, 162, 60);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 75, 162, 60);
		add(comboBox_1);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==voltarBtn)
		{
			TSFrame.MostrarMenu();
		}
	}
}
