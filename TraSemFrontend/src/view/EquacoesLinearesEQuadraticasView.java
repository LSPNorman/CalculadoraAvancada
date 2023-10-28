package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.EquacoesLinearesEQuadraticasModel;

public class EquacoesLinearesEQuadraticasView extends JPanel implements ActionListener, MouseListener
{
	public static JButton voltarBtn;
	public static JComboBox equacoesComboBox;
	public static String[] tiposEquacoes =
	{
			"ax + b", "ax² + bx + c"
	};
	public static JLabel constanteALabel;
	public static JLabel constanteBLabel;
	public static JLabel constanteCLabel;
	public static JPanel constantesPanel;
	public static JTextField[] constantestxtField = new JTextField[3];
	public static JPanel numerosPanel;
	public static JButton[] button = new JButton[12];
	public static JPanel botoesPanel;
	public static JButton apagarButton;
	public static JButton apagarTudoButton;
	public static JTextArea textArea;
	public static JScrollPane scrollPanePassos;
	public static ImprimirGraficoPanel imprimirGrafico;

	public EquacoesLinearesEQuadraticasView()
	{
		this.setLayout(null);
		this.setBackground(Color.BLACK);

		voltarBtn = new JButton("VOLTAR");
		voltarBtn.setBounds(10, 11, 89, 23);
		voltarBtn.setForeground(Color.WHITE);
		voltarBtn.setBackground(Color.darkGray);
		voltarBtn.setFocusable(false);
		voltarBtn.addActionListener(this);
		this.add(voltarBtn);

		equacoesComboBox = new JComboBox(tiposEquacoes);
		equacoesComboBox.setForeground(Color.WHITE);
		equacoesComboBox.setBackground(Color.DARK_GRAY);
		equacoesComboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		equacoesComboBox.setBounds(10, 61, 419, 45);
		equacoesComboBox.addActionListener(this);
		this.add(equacoesComboBox);

		constanteALabel = new JLabel("a");
		constanteALabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		constanteALabel.setForeground(Color.WHITE);
		constanteALabel.setBounds(53, 143, 46, 14);
		this.add(constanteALabel);

		constanteBLabel = new JLabel("b");
		constanteBLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		constanteBLabel.setForeground(Color.WHITE);
		constanteBLabel.setBounds(202, 143, 46, 14);
		this.add(constanteBLabel);

		constanteCLabel = new JLabel("c");
		constanteCLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		constanteCLabel.setForeground(Color.WHITE);
		constanteCLabel.setBounds(355, 143, 46, 14);
		this.add(constanteCLabel);

		constantesPanel = new JPanel();
		constantesPanel.setBounds(10, 168, 430, 63);
		constantesPanel.setLayout(new GridLayout(1, 0, 0, 0));
		this.add(constantesPanel);

		for (int i = 0; i < 3; i++)
		{
			constantestxtField[i] = new JTextField();
			constantestxtField[i].setEditable(false);
			constantestxtField[i].setColumns(10);
			constantestxtField[i].setBackground(Color.WHITE);
			constantestxtField[i].setForeground(Color.BLACK);
			constantestxtField[i].addMouseListener(this);
			constantestxtField[i].setEnabled(false);
			constantestxtField[i].setEditable(false);
			constantestxtField[i].setVisible(false);
			constantesPanel.add(constantestxtField[i]);
		}

		numerosPanel = new JPanel();
		numerosPanel.setBounds(10, 262, 430, 256);
		numerosPanel.setLayout(new GridLayout(3, 4));
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

		button[9] = new JButton("0");
		button[9].setBackground(Color.darkGray);
		button[9].setForeground(Color.WHITE);
		button[9].setFocusable(false);
		button[9].addActionListener(this);
		numerosPanel.add(button[9]);

		button[10] = new JButton("-");
		button[10].setBackground(Color.darkGray);
		button[10].setForeground(Color.WHITE);
		button[10].setFocusable(false);
		button[10].addActionListener(this);
		numerosPanel.add(button[10]);

		button[11] = new JButton("CALCULAR");
		button[11].setBackground(Color.darkGray);
		button[11].setForeground(Color.WHITE);
		button[11].setFocusable(false);
		button[11].addActionListener(this);
		numerosPanel.add(button[11]);

		botoesPanel = new JPanel();
		botoesPanel.setBounds(10, 548, 430, 60);
		botoesPanel.setLayout(new GridLayout(1, 0, 0, 0));
		this.add(botoesPanel);

		apagarButton = new JButton("APAGAR");
		apagarButton.setBackground(Color.darkGray);
		apagarButton.setForeground(Color.WHITE);
		apagarButton.setFocusable(false);
		apagarButton.addActionListener(this);
		botoesPanel.add(apagarButton);

		apagarTudoButton = new JButton("APAGAR TUDO");
		apagarTudoButton.setBackground(Color.darkGray);
		apagarTudoButton.setForeground(Color.WHITE);
		apagarTudoButton.setFocusable(false);
		apagarTudoButton.addActionListener(this);
		botoesPanel.add(apagarTudoButton);

		textArea = new JTextArea();
		textArea.setBounds(471, 10, 419, 256);
		textArea.setEditable(false);
		textArea.setFont(new Font("Nirmala UI", Font.PLAIN, 18));
		this.add(textArea);

		scrollPanePassos = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPanePassos.setBounds(471, 61, 420, 245);
		this.add(scrollPanePassos);

		imprimirGrafico = new ImprimirGraficoPanel();
		imprimirGrafico.setBounds(471, 329, 420, 280);
		imprimirGrafico.setEnabled(false);
		this.add(imprimirGrafico);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(922, 61, 268, 550);
		add(panel_1);

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == voltarBtn)
		{
			TSFrame.MostrarMenu();
		}

		if(e.getSource() == equacoesComboBox)
		{
			String tmp = (String) equacoesComboBox.getSelectedItem();

			for (int i = 0; i < 3; i++)
			{
				constantestxtField[i].setEnabled(false);
				constantestxtField[i].setVisible(false);
			}

			switch (tmp)
			{
				case "ax + b":
					for (int i = 0; i < 2; i++)
					{
						constantestxtField[i].setEnabled(true);
						constantestxtField[i].setVisible(true);
					}

				break;

				case "ax² + bx + c":
					for (int i = 0; i < 3; i++)
					{
						constantestxtField[i].setEnabled(true);
						constantestxtField[i].setVisible(true);
					}
				break;
			}
		}

		for (int i = 0; i < 10; i++)
		{
			if(e.getSource() == button[i])
			{
				if(i == 9)
				{
					String string = constantestxtField[indice].getText() + String.valueOf(0);
					constantestxtField[indice].setText(string);
				}
				else
				{
					String string = constantestxtField[indice].getText() + String.valueOf(i + 1);
					constantestxtField[indice].setText(string);
				}
			}
		}
		if(e.getSource() == button[10])
		{
			String string = constantestxtField[indice].getText();

			if(string.isBlank())
				string = "-";
			if((string.charAt(0)) == '-')
				string = string.replace("-", "");
			else
				string = "-" + string;

			constantestxtField[indice].setText(string);
		}
		if(e.getSource() == button[11])
		{
			String tmp = (String) equacoesComboBox.getSelectedItem();
			for (int i = 0; i < 3; i++)
			{
				if(constantestxtField[i].getText().isBlank())
					constantestxtField[i].setText("0");
			}

			Double a = Double.parseDouble(constantestxtField[0].getText());
			Double b = Double.parseDouble(constantestxtField[1].getText());
			Double c = Double.parseDouble(constantestxtField[2].getText());
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);

			switch (tmp)
			{
				case "ax + b":

					EquacoesLinearesEQuadraticasModel.PrimeiroGrau(a, b);

				break;

				case "ax² + bx + c":
					EquacoesLinearesEQuadraticasModel.SegundoGrau(a, b, c);

				break;
			}
		}
		if(e.getSource() == apagarButton)
		{
			String string = constantestxtField[indice].getText();
			string = string.substring(0, string.length() - 1);
			constantestxtField[indice].setText(string);
		}
		if(e.getSource() == apagarTudoButton)
		{
			for (int i = 0; i < 3; i++)
			{ constantestxtField[i].setText(""); }
		}
	}

	int indice;

	@Override
	public void mouseClicked(MouseEvent e)
	{
		for (int i = 0; i < 3; i++)
		{
			if(e.getComponent() == constantestxtField[i])
			{
				constantestxtField[indice].setBackground(Color.WHITE);
				constantestxtField[indice].setForeground(Color.BLACK);
				indice = i;
				constantestxtField[indice].setBackground(Color.darkGray);
				constantestxtField[indice].setForeground(Color.WHITE);

			}
		}

	}

	@Override
	public void mousePressed(MouseEvent e)
	{ // TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{ // TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		for (int i = 0; i < 3; i++)
		{
			if(e.getComponent() == constantestxtField[i])
			{
				if((constantestxtField[i].getBackground()) == (Color.WHITE))
				{
					constantestxtField[i].setBackground(Color.lightGray);
					constantestxtField[i].setForeground(Color.WHITE);
				}
			}

		}
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		for (int i = 0; i < 3; i++)
		{
			if(e.getComponent() == constantestxtField[i])
			{
				if((constantestxtField[i].getBackground()) == (Color.lightGray))
				{
					constantestxtField[i].setBackground(Color.WHITE);
					constantestxtField[i].setForeground(Color.BLACK);
				}
			}

		}
	}
}
