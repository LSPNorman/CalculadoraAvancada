package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.ExpressoesAritimeticasModel;

public class ExpressoesAritimeticasView extends JPanel implements ActionListener
{
	public static JTextField textField;
	public static JButton voltarBtn;
	public static JButton[] button = new JButton[10];
	public static JPanel numerosPanel;
	public static JButton apagarButton;
	public static JButton apagarTudoButton;
	public static JPanel operacoesPanel;
	public static JButton adicionarButton;
	public static JButton subtrairButton;
	public static JButton multiplicarButton;
	public static JButton dividirButton;
	public static JButton igualButton;
	public static JTextArea textArea;
	public static JScrollPane scrollPanePassos;
	public static JButton abrirPButton;
	public static JButton fecharPButton;
	private JPanel panel;

	public ExpressoesAritimeticasView()
	{
		this.setLayout(null);
		this.setBackground(Color.black);

		voltarBtn = new JButton("VOLTAR");
		voltarBtn.setBounds(10, 11, 89, 23);
		voltarBtn.setForeground(Color.WHITE);
		voltarBtn.setBackground(Color.darkGray);
		voltarBtn.setFocusable(false);
		voltarBtn.addActionListener(this);
		this.add(voltarBtn);

		textField = new JTextField();
		textField.setBounds(10, 58, 430, 70);
		textField.setEditable(false);
		this.add(textField);

		numerosPanel = new JPanel();
		numerosPanel.setBounds(10, 152, 333, 472);
		numerosPanel.setLayout(new GridLayout(4, 3));
		this.add(numerosPanel);

		for (int i = 0; i < 9; i++)
		{
			button[i] = new JButton(String.valueOf(i + 1));
			button[i].setBackground(Color.darkGray);
			button[i].setForeground(Color.WHITE);
			button[i].setFocusable(false);
			button[i].addActionListener(this);
			numerosPanel.add(button[i]);
		}

		apagarButton = new JButton("APAGAR");
		apagarButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		apagarButton.setBackground(Color.darkGray);
		apagarButton.setForeground(Color.WHITE);
		apagarButton.setFocusable(false);
		apagarButton.addActionListener(this);
		numerosPanel.add(apagarButton);

		button[9] = new JButton("0");
		button[9].setBackground(Color.darkGray);
		button[9].setForeground(Color.WHITE);
		button[9].setFocusable(false);
		button[9].addActionListener(this);
		numerosPanel.add(button[9]);

		apagarTudoButton = new JButton("APAGAR TUDO");
		apagarTudoButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		apagarTudoButton.setBackground(Color.darkGray);
		apagarTudoButton.setForeground(Color.WHITE);
		apagarTudoButton.setFocusable(false);
		apagarTudoButton.addActionListener(this);
		numerosPanel.add(apagarTudoButton);

		operacoesPanel = new JPanel();
		operacoesPanel.setBounds(353, 152, 87, 472);
		operacoesPanel.setLayout(new GridLayout(7, 1));
		this.add(operacoesPanel);

		adicionarButton = new JButton("+");
		adicionarButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		adicionarButton.setBackground(Color.darkGray);
		adicionarButton.setForeground(Color.WHITE);
		adicionarButton.setFocusable(false);
		adicionarButton.addActionListener(this);
		operacoesPanel.add(adicionarButton);

		subtrairButton = new JButton("-");
		subtrairButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		subtrairButton.setBackground(Color.darkGray);
		subtrairButton.setForeground(Color.WHITE);
		subtrairButton.setFocusable(false);
		subtrairButton.addActionListener(this);
		operacoesPanel.add(subtrairButton);

		multiplicarButton = new JButton("*");
		multiplicarButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		multiplicarButton.setBackground(Color.darkGray);
		multiplicarButton.setForeground(Color.WHITE);
		multiplicarButton.setFocusable(false);
		multiplicarButton.addActionListener(this);
		operacoesPanel.add(multiplicarButton);

		dividirButton = new JButton("/");
		dividirButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dividirButton.setBackground(Color.darkGray);
		dividirButton.setForeground(Color.WHITE);
		dividirButton.setFocusable(false);
		dividirButton.addActionListener(this);
		operacoesPanel.add(dividirButton);

		abrirPButton = new JButton("(");
		abrirPButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		abrirPButton.setBackground(Color.darkGray);
		abrirPButton.setForeground(Color.WHITE);
		abrirPButton.setFocusable(false);
		abrirPButton.addActionListener(this);
		operacoesPanel.add(abrirPButton);

		fecharPButton = new JButton(")");
		fecharPButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fecharPButton.setBackground(Color.darkGray);
		fecharPButton.setForeground(Color.WHITE);
		fecharPButton.setFocusable(false);
		fecharPButton.addActionListener(this);
		operacoesPanel.add(fecharPButton);

		igualButton = new JButton("=");
		igualButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		igualButton.setBackground(Color.darkGray);
		igualButton.setForeground(Color.WHITE);
		igualButton.setFocusable(false);
		igualButton.addActionListener(this);
		operacoesPanel.add(igualButton);

		textArea = new JTextArea();
		textArea.setBounds(471, 10, 419, 256);
		textArea.setEditable(false);
		textArea.setFont(new Font("Nirmala UI", Font.PLAIN, 18));
		this.add(textArea);

		scrollPanePassos = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPanePassos.setBounds(471, 50, 420, 248);
		this.add(scrollPanePassos);

		panel = new JPanel();
		panel.setBounds(471, 309, 420, 315);
		add(panel);

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == voltarBtn)
		{
			TSFrame.MostrarMenu();
		}
		String textFieldString = new String();
		for (int i = 0; i < 10; i++)
		{
			if(e.getSource() == button[i])
			{
				if(i == 9)
					textFieldString = textField.getText() + 0;
				else
					textFieldString = textField.getText() + (i + 1);
				textField.setText(textFieldString);
			}
		}
		if(e.getSource() == apagarButton)
		{
			if(textField.getText().isBlank())
			{
				textArea.setText("Campo Vazio");
			}
			else
			{
				textFieldString = textField.getText();
				textFieldString = textFieldString.substring(0, textFieldString.length() - 1);
				textField.setText(textFieldString);
			}

		}
		if(e.getSource() == apagarTudoButton)
		{
			if(textField.getText().isBlank())
			{
				textArea.setText("Campo Vazio");
			}
			else
			{
				textFieldString = "";
				textField.setText(textFieldString);
			}
		}
		if(e.getSource() == adicionarButton)
		{
			if(textField.getText().isBlank())
			{
				textArea.setText("Campo Vazio");
			}
			else
			{
				textFieldString = textField.getText() + "+";
				textField.setText(textFieldString);
			}
		}
		if(e.getSource() == subtrairButton)
		{
			if(textField.getText().isBlank())
			{
				textArea.setText("Campo Vazio");
			}
			else
			{
				textFieldString = textField.getText() + "-";
				textField.setText(textFieldString);
			}
		}
		if(e.getSource() == multiplicarButton)
		{
			if(textField.getText().isBlank())
			{
				textArea.setText("Campo Vazio");
			}
			else
			{
				textFieldString = textField.getText() + "*";
				textField.setText(textFieldString);
			}
		}
		if(e.getSource() == dividirButton)
		{
			if(textField.getText().isBlank())
			{
				textArea.setText("Campo Vazio");
			}
			else
			{
				textFieldString = textField.getText() + "/";
				textField.setText(textFieldString);
			}
		}
		if(e.getSource() == abrirPButton)
		{
			if(textField.getText().isBlank())
			{
				textArea.setText("Campo Vazio");
			}
			else
			{
				textFieldString = textField.getText() + "(";
				textField.setText(textFieldString);
			}
		}
		if(e.getSource() == fecharPButton)
		{
			if(textField.getText().isBlank())
			{
				textArea.setText("Campo Vazio");
			}
			else
			{
				textFieldString = textField.getText() + ")";
				textField.setText(textFieldString);
			}
		}
		if(e.getSource() == igualButton)
		{
			if(textField.getText().isBlank())
			{
				textArea.setText("Campo Vazio");
			}
			else
			{
				textArea.setText("");
				textFieldString = textField.getText();
				ExpressoesAritimeticasModel.StringToArrayList(textFieldString);
			}
		}
	}
}
