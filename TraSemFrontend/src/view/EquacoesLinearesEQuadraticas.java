package view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class EquacoesLinearesEQuadraticas extends JPanel implements ActionListener
{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public JButton voltarBtn;
	
	public EquacoesLinearesEQuadraticas()
	{
		setLayout(null);
		
		voltarBtn = new JButton("VOLTAR");
		voltarBtn.setBounds(10, 11, 89, 23);
		voltarBtn.addActionListener(this);
		this.add(voltarBtn);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(471, 10, 419, 256);
		add(textArea);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 262, 430, 256);
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
		
		JButton btnNewButton_10 = new JButton("-");
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("=");
		panel.add(btnNewButton_11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 168, 430, 63);
		add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(10, 548, 430, 60);
		add(panel_1_1);
		panel_1_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_12 = new JButton("APAGAR");
		panel_1_1.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("APAGAR TUDO");
		panel_1_1.add(btnNewButton_13);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(53, 143, 46, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(202, 143, 46, 14);
		add(lblNewLabel_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(355, 143, 46, 14);
		add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 61, 419, 45);
		add(comboBox);
		
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
