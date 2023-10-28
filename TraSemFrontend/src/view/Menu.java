package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Menu extends JPanel implements ActionListener
{
	public JButton voltarBtn;
	public JPanel buttonsPnl;
	public JButton matrizesBtn;
	public JButton expNbtn;
	public JButton eLeQbtn;
	public JButton estudoTrianguloBtn;
	public JButton derivdasIntegraisBtn;
	public JButton conversorBtn;

	public Menu()
	{
		setLayout(null);

		voltarBtn = new JButton("VOLTAR");
		voltarBtn.setBounds(10, 11, 89, 23);
		this.add(voltarBtn);

		buttonsPnl = new JPanel();
		buttonsPnl.setBounds(10, 69, 505, 571);
		buttonsPnl.setLayout(new GridLayout(3, 2));
		this.add(buttonsPnl);

		matrizesBtn = new JButton("MATRIZES");
		matrizesBtn.addActionListener(this);
		buttonsPnl.add(matrizesBtn);

		expNbtn = new JButton("EXPRESSOES NUMERICAS");
		expNbtn.addActionListener(this);
		buttonsPnl.add(expNbtn);

		eLeQbtn = new JButton("EQUACOES LINEARES E QUADRATICAS");
		eLeQbtn.addActionListener(this);
		buttonsPnl.add(eLeQbtn);

		estudoTrianguloBtn = new JButton("ESTUDO DO TRIANGULO");
		estudoTrianguloBtn.addActionListener(this);
		buttonsPnl.add(estudoTrianguloBtn);

		derivdasIntegraisBtn = new JButton("DERIVADAS E INTEGRAIS");
		derivdasIntegraisBtn.addActionListener(this);
		buttonsPnl.add(derivdasIntegraisBtn);

		conversorBtn = new JButton("CONVERSOR DE UNIDADES");
		conversorBtn.addActionListener(this);
		buttonsPnl.add(conversorBtn);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == matrizesBtn)
		{
			TSFrame.MostrarMatrizes();
		}

		if(e.getSource() == expNbtn)
		{
			TSFrame.MostrarExpressoesNumericas();
		}

		if(e.getSource() == eLeQbtn)
		{
			TSFrame.MostrarEquacoesLinearesEQuadraticas();
		}

		if(e.getSource() == estudoTrianguloBtn)
		{
			TSFrame.MostrarEstudoDoTriangulo();
		}

		if(e.getSource() == conversorBtn)
		{
			TSFrame.MostrarConversor();
		}
	}
}
