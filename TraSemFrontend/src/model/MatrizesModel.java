package model;

import view.MatrizesView;

public class MatrizesModel extends MatrizesView
{
	public static int m, n, o, p;
	public static int[][] matriz1, matriz2;

	public static void receberUmaMatriz()
	{
		if(matrizA == true)
		{
			m = Integer.parseInt((String) linhasMcomboBox.getSelectedItem());
			n = Integer.parseInt((String) colunasNcomboBox.getSelectedItem());
			matriz1 = new int[m][n];
			for (int i = 0; i < matriz1.length; i++)
			{
				for (int j = 0; j < matriz1[i].length; j++)
				{
					if((atextField[i][j].isEnabled()) == true)
					{
						if((atextField[i][j].getText().isBlank()))
						{
							matriz1[i][j] = 0;
						}

						else
						{
							matriz1[i][j] = Integer.parseInt(atextField[i][j].getText());
						}
					}
				}
			}
		}
		if(matrizB == true)
		{
			o = Integer.parseInt((String) linhasOcomboBox.getSelectedItem());
			p = Integer.parseInt((String) colunasPcomboBox.getSelectedItem());
			matriz2 = new int[o][p];

			for (int i = 0; i < matriz2.length; i++)
			{
				for (int j = 0; j < matriz2[i].length; j++)
				{
					if((btextField[i][j].isEnabled()) == true)
					{
						if((btextField[i][j].getText().isBlank()))
						{
							matriz2[i][j] = 0;
						}

						else
						{
							matriz2[i][j] = Integer.parseInt(btextField[i][j].getText());
						}
					}
				}
			}
		}
	}

	public static void receberDuasMatrizes()
	{

		m = Integer.parseInt((String) linhasMcomboBox.getSelectedItem());
		n = Integer.parseInt((String) colunasNcomboBox.getSelectedItem());
		matriz1 = new int[m][n];
		o = Integer.parseInt((String) linhasOcomboBox.getSelectedItem());
		p = Integer.parseInt((String) colunasPcomboBox.getSelectedItem());
		matriz2 = new int[o][p];

		for (int i = 0; i < matriz1.length; i++)
		{
			for (int j = 0; j < matriz1[i].length; j++)
			{
				if((atextField[i][j].isEnabled()) == true)
				{
					if((atextField[i][j].getText().isBlank()))
					{
						matriz1[i][j] = 0;
						atextField[i][j].setText(String.valueOf(matriz1[i][j]));
					}
					else
					{
						matriz1[i][j] = Integer.parseInt(atextField[i][j].getText());
					}
				}
			}
		}

		for (int i = 0; i < matriz2.length; i++)
		{
			for (int j = 0; j < matriz2[i].length; j++)
			{
				if((btextField[i][j].isEnabled()) == true)
				{
					if((btextField[i][j].getText().isBlank()))
					{
						matriz2[i][j] = 0;
						btextField[i][j].setText(String.valueOf(matriz2[i][j]));
					}
					else
					{
						matriz2[i][j] = Integer.parseInt(btextField[i][j].getText());
					}
				}
			}
		}
	}

	public static void calcularMatriz()
	{
		receberDuasMatrizes();
		System.out.println("calcularMatriz()");
		String operacaoString = ((String) operacaoComboBox.getSelectedItem());
		System.out.println("operacaoString :" + operacaoString);

		int[][] resultado = new int[m][p];
		System.out.println("n : " + n + " o : " + o);

		switch (operacaoString)
		{
			case "+":
				if((m == o) && (n == p))
				{
					String imprimirString = new String();
					for (int i = 0; i < resultado.length; i++)
					{
						for (int j = 0; j < resultado[i].length; j++)
						{ resultado[i][j] = matriz1[i][j] + matriz2[i][j]; }
					}

					for (int i = 0; i < resultado.length; i++)
					{
						for (int j = 0; j < resultado[i].length; j++)
						{ imprimirString = imprimirString + matriz1[i][j] + " + " + matriz2[i][j] + "   "; }
						imprimirString = imprimirString + "\n";
					}
					imprimirString = imprimirString + "\n";
					for (int i = 0; i < resultado.length; i++)
					{
						for (int j = 0; j < resultado[i].length; j++)
						{ imprimirString = imprimirString + resultado[i][j] + "   "; }
						imprimirString = imprimirString + "\n";
					}

					textArea.setText(imprimirString);
				}
				else
				{
					textArea.setText(
							"Para adicionar duas matrizes, as matrizes devem ter o mesmo numero de linhas e o mesmo numero de colunas");
				} ;
			break;
			case "-":
				if((m == o) && (n == p))
				{
					String imprimirString = new String();
					for (int i = 0; i < resultado.length; i++)
					{
						for (int j = 0; j < resultado[i].length; j++)
						{ resultado[i][j] = matriz1[i][j] - matriz2[i][j]; }
					}

					for (int i = 0; i < resultado.length; i++)
					{
						for (int j = 0; j < resultado[i].length; j++)
						{ imprimirString = imprimirString + matriz1[i][j] + " - " + matriz2[i][j] + "   "; }
						imprimirString = imprimirString + "\n";
					}
					imprimirString = imprimirString + "\n";
					for (int i = 0; i < resultado.length; i++)
					{
						for (int j = 0; j < resultado[i].length; j++)
						{ imprimirString = imprimirString + resultado[i][j] + "   "; }
						imprimirString = imprimirString + "\n";
					}

					textArea.setText(imprimirString);
				}
				else
				{
					textArea.setText(
							"Para adicionar duas matrizes, elas devem ter o mesmo numero de linhas e o mesmo numero de colunas");
				} ;
			break;
			case "*":
				if(n == o)
				{
					String imprimirString = new String();
					for (int i = 0; i < matriz1.length; i++)
					{
						for (int j = 0; j < matriz2[0].length; j++)
						{
							for (int k = 0; k < matriz1[0].length; k++)
							{ resultado[i][j] = resultado[i][j] + (matriz1[i][k] * matriz2[k][j]); }
						}
					}

					for (int i = 0; i < matriz1.length; i++)
					{
						for (int j = 0; j < matriz2[0].length; j++)
						{
							for (int k = 0; k < matriz1[0].length; k++)
							{ imprimirString = imprimirString + matriz1[i][k] + " * " + matriz2[k][j] + " + "; }
							imprimirString = imprimirString.substring(0, imprimirString.length() - 3);
							imprimirString = imprimirString + "   ";
						}
						imprimirString = imprimirString + "\n";
					}
					imprimirString = imprimirString + "\n";
					for (int i = 0; i < resultado.length; i++)
					{
						for (int j = 0; j < resultado[i].length; j++)
						{ imprimirString = imprimirString + resultado[i][j] + "   "; }
						imprimirString = imprimirString + "\n";
					}
					imprimirString = imprimirString + "\n";
					textArea.setText(imprimirString);
				}
				else
				{
					textArea.setText(
							"Para multiplicar duas matrizes, o numero de colunas da primeira matriz tem que ser igual ao numero de linhas da segunda matriz");
				} ;
			break;
		}
	}

	public static void transporMatriz()
	{
		receberUmaMatriz();
		int[][] matriz1Transposta = new int[n][m];
		int[][] matriz2Transposta = new int[p][o];

		if(matrizA == true)
		{
			for (int i = 0; i < m; i++)
			{
				for (int j = 0; j < n; j++)
				{ matriz1Transposta[j][i] = matriz1[i][j]; }
			}

			for (int i = 0; i < 4; i++)
			{
				for (int j = 0; j < 4; j++)
				{
					atextField[i][j].setEnabled(false);
					atextField[i][j].setVisible(false);
				}
			}

			for (int i = 0; i < matriz1Transposta.length; i++)
			{
				for (int j = 0; j < matriz1Transposta[i].length; j++)
				{
					atextField[i][j].setEnabled(true);
					atextField[i][j].setVisible(true);
				}
			}

			for (int i = 0; i < matriz1Transposta.length; i++)
			{
				for (int j = 0; j < matriz1Transposta[i].length; j++)
				{ atextField[i][j].setText(String.valueOf(matriz1Transposta[i][j])); }
			}

			linhasMcomboBox.setSelectedItem(String.valueOf(matriz1Transposta.length));
			colunasNcomboBox.setSelectedItem(String.valueOf(matriz1Transposta[0].length));
		}

		if(matrizB == true)
		{
			for (int i = 0; i < o; i++)
			{
				for (int j = 0; j < p; j++)
				{ matriz2Transposta[j][i] = matriz2[i][j]; }
			}

			for (int i = 0; i < 4; i++)
			{
				for (int j = 0; j < 4; j++)
				{
					btextField[i][j].setEnabled(false);
					btextField[i][j].setVisible(false);
				}
			}

			for (int i = 0; i < matriz2Transposta.length; i++)
			{
				for (int j = 0; j < matriz2Transposta[i].length; j++)
				{
					btextField[i][j].setEnabled(true);
					btextField[i][j].setVisible(true);
				}
			}

			for (int i = 0; i < matriz2Transposta.length; i++)
			{
				for (int j = 0; j < matriz2Transposta[i].length; j++)
				{ btextField[i][j].setText(String.valueOf(matriz2Transposta[i][j])); }
			}

			linhasOcomboBox.setSelectedItem(String.valueOf(matriz2Transposta.length));
			colunasPcomboBox.setSelectedItem(String.valueOf(matriz2Transposta[0].length));
		}

	}
}
