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

import model.MatrizesModel;

public class MatrizesView extends JPanel implements ActionListener, MouseListener
{
	public static JTextField[][] atextField = new JTextField[4][4];
	public static JTextField[][] btextField = new JTextField[4][4];

	public static JButton calcularButton;
	public static JButton voltarBtn;
	public static JTextArea textArea;
	public static JScrollPane scrollPanePassos;
	public static JPanel botoesNumerosPanel;

	public static JButton[] button = new JButton[10];

	public static JButton transporButton;
	public static JButton negativoButton;
	public static JPanel botoesOpcoesPanel;
	public static JButton apagarButton;
	public static JButton apagarTudoButton;
	public static JPanel matriz1Panel;
	public static JPanel matriz2Panel;
	public static JComboBox linhasMcomboBox;
	public static JComboBox colunasNcomboBox;
	public static JComboBox linhasOcomboBox;
	public static JComboBox colunasPcomboBox;
	public static JComboBox operacaoComboBox;

	public static String[] tiposOperacoes =
	{
			"+", "-", "*"
	};
	public static String[] numeroDeLinhas =
	{
			"1", "2", "3", "4"
	};
	public static String[] numeroDeColunas =
	{
			"1", "2", "3", "4"
	};

	public static JLabel linhasMLabel;
	public static JLabel linhasNLabel;
	public static JLabel linhasOLabel;
	public static JLabel linhasPLabel;

	public MatrizesView()
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

		matriz1Panel = new JPanel();
		matriz1Panel.setBounds(10, 49, 188, 203);
		matriz1Panel.setLayout(new GridLayout(4, 4));
		this.add(matriz1Panel);

		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				atextField[i][j] = new JTextField();
				atextField[i][j].setEditable(false);
				atextField[i][j].setColumns(10);
				atextField[i][j].setBackground(Color.WHITE);
				atextField[i][j].setForeground(Color.BLACK);
				atextField[i][j].addMouseListener(this);
				atextField[i][j].setEnabled(false);
				atextField[i][j].setEditable(false);
				atextField[i][j].setVisible(false);
				matriz1Panel.add(atextField[i][j]);
			}
		}

		operacaoComboBox = new JComboBox(tiposOperacoes);
		operacaoComboBox.setBounds(201, 124, 50, 36);
		operacaoComboBox.setBackground(Color.darkGray);
		operacaoComboBox.setForeground(Color.WHITE);
		operacaoComboBox.addActionListener(this);
		operacaoComboBox.setFocusable(false);
		this.add(operacaoComboBox);

		matriz2Panel = new JPanel();
		matriz2Panel.setBounds(253, 49, 188, 203);
		matriz2Panel.setLayout(new GridLayout(4, 4));
		this.add(matriz2Panel);

		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				btextField[i][j] = new JTextField();
				btextField[i][j].setEditable(false);
				btextField[i][j].setColumns(10);
				btextField[i][j].setBackground(Color.WHITE);
				btextField[i][j].setForeground(Color.BLACK);
				btextField[i][j].addMouseListener(this);
				btextField[i][j].setEnabled(false);
				btextField[i][j].setEditable(false);
				btextField[i][j].setVisible(false);
				matriz2Panel.add(btextField[i][j]);
			}
		}

		linhasMcomboBox = new JComboBox(numeroDeLinhas);
		linhasMcomboBox.setBounds(10, 286, 73, 23);
		linhasMcomboBox.setBackground(Color.darkGray);
		linhasMcomboBox.setForeground(Color.WHITE);
		linhasMcomboBox.addActionListener(this);
		linhasMcomboBox.setFocusable(false);
		this.add(linhasMcomboBox);

		colunasNcomboBox = new JComboBox(numeroDeColunas);
		colunasNcomboBox.setBounds(125, 286, 73, 23);
		colunasNcomboBox.setBackground(Color.darkGray);
		colunasNcomboBox.setForeground(Color.WHITE);
		colunasNcomboBox.addActionListener(this);
		colunasNcomboBox.setFocusable(false);
		this.add(colunasNcomboBox);

		linhasOcomboBox = new JComboBox(numeroDeLinhas);
		linhasOcomboBox.setBounds(253, 286, 73, 23);
		linhasOcomboBox.setBackground(Color.darkGray);
		linhasOcomboBox.setForeground(Color.WHITE);
		linhasOcomboBox.addActionListener(this);
		linhasOcomboBox.setFocusable(false);
		this.add(linhasOcomboBox);

		colunasPcomboBox = new JComboBox(numeroDeColunas);
		colunasPcomboBox.setBounds(368, 286, 73, 23);
		colunasPcomboBox.setBackground(Color.darkGray);
		colunasPcomboBox.setForeground(Color.WHITE);
		colunasPcomboBox.setFocusable(false);
		colunasPcomboBox.addActionListener(this);
		this.add(colunasPcomboBox);

		botoesNumerosPanel = new JPanel();
		botoesNumerosPanel.setBounds(10, 320, 430, 235);
		botoesNumerosPanel.setLayout(new GridLayout(3, 4));
		this.add(botoesNumerosPanel);

		for (int i = 0; i < 3; i++)
		{
			button[i] = new JButton(String.valueOf(i + 1));
			button[i].setBackground(Color.darkGray);
			button[i].setForeground(Color.WHITE);
			button[i].setFocusable(false);
			button[i].addActionListener(this);
			botoesNumerosPanel.add(button[i]);
		}

		transporButton = new JButton("T");
		transporButton.setBackground(Color.darkGray);
		transporButton.setForeground(Color.WHITE);
		transporButton.setFocusable(false);
		transporButton.addActionListener(this);
		botoesNumerosPanel.add(transporButton);

		for (int i = 3; i < 6; i++)
		{
			button[i] = new JButton(String.valueOf(i + 1));
			button[i].setBackground(Color.darkGray);
			button[i].setForeground(Color.WHITE);
			button[i].setFocusable(false);
			button[i].addActionListener(this);
			botoesNumerosPanel.add(button[i]);
		}

		negativoButton = new JButton("-");
		negativoButton.setBackground(Color.darkGray);
		negativoButton.setForeground(Color.WHITE);
		negativoButton.setFocusable(false);
		negativoButton.addActionListener(this);
		botoesNumerosPanel.add(negativoButton);

		for (int i = 6; i < 9; i++)
		{
			button[i] = new JButton(String.valueOf(i + 1));
			button[i].setBackground(Color.darkGray);
			button[i].setForeground(Color.WHITE);
			button[i].setFocusable(false);
			button[i].addActionListener(this);
			botoesNumerosPanel.add(button[i]);
		}

		button[9] = new JButton("0");
		button[9].setBackground(Color.darkGray);
		button[9].setForeground(Color.WHITE);
		button[9].setFocusable(false);
		button[9].addActionListener(this);
		botoesNumerosPanel.add(button[9]);

		botoesOpcoesPanel = new JPanel();
		botoesOpcoesPanel.setBounds(10, 580, 430, 60);
		this.add(botoesOpcoesPanel);
		botoesOpcoesPanel.setLayout(new GridLayout(1, 0, 0, 0));

		apagarButton = new JButton("APAGAR");
		apagarButton.setBackground(Color.darkGray);
		apagarButton.setForeground(Color.WHITE);
		apagarButton.setFocusable(false);
		apagarButton.addActionListener(this);
		botoesOpcoesPanel.add(apagarButton);

		apagarTudoButton = new JButton("APAGAR TUDO");
		apagarTudoButton.setBackground(Color.darkGray);
		apagarTudoButton.setForeground(Color.WHITE);
		apagarTudoButton.setFocusable(false);
		apagarTudoButton.addActionListener(this);
		botoesOpcoesPanel.add(apagarTudoButton);

		calcularButton = new JButton("CALCULAR");
		calcularButton.setBackground(Color.darkGray);
		calcularButton.setForeground(Color.WHITE);
		calcularButton.setFocusable(false);
		calcularButton.addActionListener(this);
		botoesOpcoesPanel.add(calcularButton);

		textArea = new JTextArea();
		textArea.setBounds(471, 10, 419, 256);
		textArea.setEditable(false);
		textArea.setFont(new Font("Nirmala UI", Font.PLAIN, 18));
		this.add(textArea);

		scrollPanePassos = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPanePassos.setBounds(471, 50, 420, 248);
		this.add(scrollPanePassos);

		linhasMLabel = new JLabel("Linhas M");
		linhasMLabel.setForeground(Color.WHITE);
		linhasMLabel.setBackground(Color.BLACK);
		linhasMLabel.setBounds(10, 263, 73, 14);
		this.add(linhasMLabel);

		linhasNLabel = new JLabel("Colunas N");
		linhasNLabel.setForeground(Color.WHITE);
		linhasNLabel.setBackground(Color.BLACK);
		linhasNLabel.setBounds(125, 263, 73, 14);
		this.add(linhasNLabel);

		linhasOLabel = new JLabel("Linhas O");
		linhasOLabel.setForeground(Color.WHITE);
		linhasOLabel.setBackground(Color.BLACK);
		linhasOLabel.setBounds(253, 263, 73, 14);
		this.add(linhasOLabel);

		linhasPLabel = new JLabel("Colunas P");
		linhasPLabel.setForeground(Color.WHITE);
		linhasPLabel.setBackground(Color.BLACK);
		linhasPLabel.setBounds(368, 263, 73, 14);
		this.add(linhasPLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// Botao Voltar//
		if(e.getSource() == voltarBtn)
		{
			TSFrame.MostrarMenu();
		}

		// Botoes Numeros//
		for (int i = 0; i < 10; i++)
		{
			if(e.getSource() == button[i])
			{
				if(i == 9)
				{
					if(matrizA == true)
					{
						String string = atextField[linhaMouse][colunaMouse].getText();
						string = string + String.valueOf(0);
						atextField[linhaMouse][colunaMouse].setText(string);
					}
					if(matrizB == true)
					{
						String string = btextField[linhaMouse][colunaMouse].getText();
						string = string + String.valueOf(0);
						btextField[linhaMouse][colunaMouse].setText(string);
					}
				}

				else
				{
					if(matrizA == true)
					{
						String string = atextField[linhaMouse][colunaMouse].getText();
						string = string + String.valueOf(i + 1);
						atextField[linhaMouse][colunaMouse].setText(string);
					}
					if(matrizB == true)
					{
						String string = btextField[linhaMouse][colunaMouse].getText();
						string = string + String.valueOf(i + 1);
						btextField[linhaMouse][colunaMouse].setText(string);
					}
				}
			}
		}

		// Botao Transpor//
		if(e.getSource() == transporButton)
		{
			MatrizesModel.transporMatriz();
		}

		// Botao Negativo//
		if(e.getSource() == negativoButton)
		{
			if(matrizA == true)
			{
				String string = atextField[linhaMouse][colunaMouse].getText();

				if(string.isBlank())
					string = "-" + string;
				if((string.charAt(0)) == '-')
					string = string.replace("-", "");
				else
					string = "-" + string;

				atextField[linhaMouse][colunaMouse].setText(string);
			}
			if(matrizB == true)
			{
				String string = btextField[linhaMouse][colunaMouse].getText();

				if(string.isBlank())
					string = "-" + string;
				if((string.charAt(0)) == '-')
					string = string.replace("-", "");
				else
					string = "-" + string;

				btextField[linhaMouse][colunaMouse].setText(string);
			}
		}
		// Botao Apagar//
		if(e.getSource() == apagarButton)
		{
			if(matrizA == true)
			{
				atextField[linhaMouse][colunaMouse].setText("");
			}
			if(matrizB == true)
			{
				btextField[linhaMouse][colunaMouse].setText("");
			}
		}
		// Botao Apagar Tudo//
		if(e.getSource() == apagarTudoButton)
		{
			for (int i = 0; i < 4; i++)
			{
				for (int j = 0; j < 4; j++)
				{
					atextField[i][j].setText("");
					btextField[i][j].setText("");
				}
			}
		}

		// linhas M comboBox//
		if(e.getSource() == linhasMcomboBox)
		{
			organizarLinhasEColunasA();
		}
		// colunas N comboBox//
		if(e.getSource() == colunasNcomboBox)
		{
			organizarLinhasEColunasA();
		}
		// linhas O comboBox//
		if(e.getSource() == linhasOcomboBox)
		{
			organizarLinhasEColunasB();
		}
		// colunas P comboBox//
		if(e.getSource() == colunasPcomboBox)
		{
			organizarLinhasEColunasB();
		}
		// botao Calcular
		if(e.getSource() == calcularButton)
		{
			System.out.println("if(e.getSource()==calcularButton)");
			MatrizesModel.calcularMatriz();
		}
	}

	public void organizarLinhasEColunasA()
	{
		int linhasM = Integer.parseInt((String) linhasMcomboBox.getSelectedItem());
		int colunasN = Integer.parseInt((String) colunasNcomboBox.getSelectedItem());

		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				atextField[i][j].setEnabled(false);
				atextField[i][j].setVisible(false);
			}
		}

		for (int i = 0; i < linhasM; i++)
		{
			for (int j = 0; j < colunasN; j++)
			{
				atextField[i][j].setEnabled(true);
				atextField[i][j].setVisible(true);
			}
		}
	}

	public void organizarLinhasEColunasB()
	{
		int linhasO = Integer.parseInt((String) linhasOcomboBox.getSelectedItem());
		int colunasP = Integer.parseInt((String) colunasPcomboBox.getSelectedItem());

		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				btextField[i][j].setEnabled(false);
				btextField[i][j].setVisible(false);
			}
		}

		for (int i = 0; i < linhasO; i++)
		{
			for (int j = 0; j < colunasP; j++)
			{
				btextField[i][j].setEnabled(true);
				btextField[i][j].setVisible(true);
			}
		}
	}

	int linhaMouse, colunaMouse;
	protected static boolean matrizA = false;
	protected static boolean matrizB = false;

	@Override
	public void mouseClicked(MouseEvent e)
	{
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				if(e.getComponent() == atextField[i][j])
				{
					atextField[linhaMouse][colunaMouse].setBackground(Color.WHITE);
					atextField[linhaMouse][colunaMouse].setForeground(Color.BLACK);
					linhaMouse = i;
					colunaMouse = j;
					atextField[linhaMouse][colunaMouse].setBackground(Color.darkGray);
					atextField[linhaMouse][colunaMouse].setForeground(Color.WHITE);
					matrizA = true;
					matrizB = false;
				}
				if(e.getComponent() == btextField[i][j])
				{
					btextField[linhaMouse][colunaMouse].setBackground(Color.WHITE);
					btextField[linhaMouse][colunaMouse].setForeground(Color.BLACK);
					linhaMouse = i;
					colunaMouse = j;
					btextField[linhaMouse][colunaMouse].setBackground(Color.darkGray);
					btextField[linhaMouse][colunaMouse].setForeground(Color.WHITE);
					matrizA = false;
					matrizB = true;
				}
			}
		}

	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				if(e.getComponent() == atextField[i][j])
				{
					if((atextField[i][j].getBackground()) == (Color.WHITE))
					{
						atextField[i][j].setBackground(Color.lightGray);
						atextField[i][j].setForeground(Color.WHITE);
					}

				}
				if(e.getComponent() == btextField[i][j])
				{
					if((btextField[i][j].getBackground()) == (Color.WHITE))
					{
						btextField[i][j].setBackground(Color.lightGray);
						btextField[i][j].setForeground(Color.WHITE);
					}

				}
			}
		}
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				if(e.getComponent() == atextField[i][j])
				{
					if((atextField[i][j].getBackground()) == (Color.lightGray))
					{
						atextField[i][j].setBackground(Color.WHITE);
						atextField[i][j].setForeground(Color.BLACK);
					}

				}
				if(e.getComponent() == btextField[i][j])
				{
					if((btextField[i][j].getBackground()) == (Color.lightGray))
					{
						btextField[i][j].setBackground(Color.WHITE);
						btextField[i][j].setForeground(Color.BLACK);
					}
				}
			}
		}
	}
}
