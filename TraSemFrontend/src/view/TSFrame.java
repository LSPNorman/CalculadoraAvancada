package view;

import javax.swing.JFrame;

public class TSFrame extends JFrame
{
	public static MatrizesView matrizes;
	public static Conversor conversor;
	public static ExpressoesAritimeticasView expressoesNumericas;
	public static EquacoesLinearesEQuadraticasView eLeQ;
	public static EstudoDoTrianguloView estudoDoTriangulo;
	public static Menu menu;

	public TSFrame()
	{
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(1425, 720);
		this.setResizable(false);
		this.getContentPane().setLayout(null);

		matrizes = new MatrizesView();
		matrizes.setBounds(10, 10, 900, 650);
		matrizes.setVisible(false);
		matrizes.setEnabled(false);
		this.add(matrizes);

		conversor = new Conversor();
		conversor.setBounds(20, 20, 900, 650);
		conversor.setVisible(false);
		conversor.setEnabled(false);
		this.add(conversor);

		expressoesNumericas = new ExpressoesAritimeticasView();
		expressoesNumericas.setBounds(20, 20, 900, 650);
		expressoesNumericas.setVisible(false);
		expressoesNumericas.setEnabled(false);
		this.add(expressoesNumericas);

		eLeQ = new EquacoesLinearesEQuadraticasView();
		eLeQ.setBounds(20, 20, 1325, 650);
		eLeQ.setVisible(false);
		eLeQ.setEnabled(false);
		this.add(eLeQ);

		estudoDoTriangulo = new EstudoDoTrianguloView();
		estudoDoTriangulo.setBounds(20, 20, 1325, 650);
		estudoDoTriangulo.setVisible(false);
		estudoDoTriangulo.setEnabled(false);
		this.add(estudoDoTriangulo);

		menu = new Menu();
		menu.setBounds(180, 20, 525, 650);
		menu.setVisible(true);
		menu.setEnabled(true);
		this.add(menu);

		this.setVisible(true);
	}

	public static void MostrarMenu()
	{
		menu.setVisible(true);
		menu.setEnabled(true);

		estudoDoTriangulo.setVisible(false);
		estudoDoTriangulo.setEnabled(false);

		eLeQ.setVisible(false);
		eLeQ.setEnabled(false);

		expressoesNumericas.setVisible(false);
		expressoesNumericas.setEnabled(false);

		conversor.setVisible(false);
		conversor.setEnabled(false);

		matrizes.setVisible(false);
		matrizes.setEnabled(false);
	}

	public static void MostrarMatrizes()
	{
		menu.setVisible(false);
		menu.setEnabled(false);

		matrizes.setVisible(true);
		matrizes.setEnabled(true);
	}

	public static void MostrarConversor()
	{
		menu.setVisible(false);
		menu.setEnabled(false);

		conversor.setVisible(true);
		conversor.setEnabled(true);
	}

	public static void MostrarExpressoesNumericas()
	{
		menu.setVisible(false);
		menu.setEnabled(false);

		expressoesNumericas.setVisible(true);
		expressoesNumericas.setEnabled(true);
	}

	public static void MostrarEquacoesLinearesEQuadraticas()
	{
		menu.setVisible(false);
		menu.setEnabled(false);

		eLeQ.setVisible(true);
		eLeQ.setEnabled(true);
	}

	public static void MostrarEstudoDoTriangulo()
	{
		menu.setVisible(false);
		menu.setEnabled(false);

		estudoDoTriangulo.setVisible(true);
		estudoDoTriangulo.setEnabled(true);
	}
}
