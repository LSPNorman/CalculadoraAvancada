package model;

import view.EquacoesLinearesEQuadraticasView;
import view.ImprimirGraficoPanel;

public class EquacoesLinearesEQuadraticasModel extends EquacoesLinearesEQuadraticasView
{
	public static void PrimeiroGrau(Double a1, Double b1)
	{
		double a = a1;
		double b = b1;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		if(a == 0.0)
		{
			if(b == 0.0)
			{
				String passos = "'a' e 'b' sao iguais a zero, a funcao sempre sera igual a zero";
				textArea.setText(passos);

			}
			else
			{
				String passos = "a = 0 entao a funcao é homogenea e sempre sera igual a 'b'";
				textArea.setText(passos);
				ImprimirGraficoPanel.setA(a);
				ImprimirGraficoPanel.setB(b);
				ImprimirGraficoPanel.setLinear(true);
				ImprimirGraficoPanel.setQuadratica(false);
				imprimirGrafico.setEnabled(true);
			}

		}
		else if(b == 0.0)
		{
			String passos = "'b' é igual a zero entao a funcao sempre sera igual a 'ax'";
			textArea.setText(passos);
			imprimirGrafico.setEnabled(false);
			ImprimirGraficoPanel.setA(a);
			ImprimirGraficoPanel.setB(b);
			ImprimirGraficoPanel.setLinear(true);
			ImprimirGraficoPanel.setQuadratica(false);
			imprimirGrafico.setEnabled(true);
		}

		else
		{
			Double x = -1 * b / a;

			String passos = "(" + a + ")" + "x + " + "(" + b + ") = 0 \n"
					+ "Nos polinomios do tipo ax+b=0, x sera igual a -b/a \n" + "Entao \n" + "x = - (" + b + ")/" + a
					+ " \n" + "x = " + x + "\n" + "y = " + b;

			textArea.setText(passos);
			imprimirGrafico.setEnabled(false);
			ImprimirGraficoPanel.setA(a);
			ImprimirGraficoPanel.setB(b);
			ImprimirGraficoPanel.setLinear(true);
			ImprimirGraficoPanel.setQuadratica(false);
			imprimirGrafico.setEnabled(true);
		}

	}

	public static void SegundoGrau(Double a1, Double b1, Double c1)
	{
		double a = a1;
		double b = b1;
		double c = c1;

		if(a == 0.0)
		{
			if(b == 0.0)
			{
				if(c == 0)
				{
					String passos = "'a', 'b' e 'c' sao iguais a zero entao a funcao igual a zero";
					textArea.setText(passos);
				}
				else
				{
					String passos = "a e b sao iguais a zero entao a funcao é homogenea e sempre sera igual a 'c'";
					textArea.setText(passos);
				}

			}
			else if(c == 0.0)
			{
				String passos = "'a' e 'c' sao iguais a zero entao a funcao sempre igual a 'bx'";
				textArea.setText(passos);
				PrimeiroGrau(b, c);
			}
			else
			{
				PrimeiroGrau(b, c);
			}

		}
		else if(b == 0.0)
		{
			if(a == 0.0)
			{
				if(c == 0)
				{
					String passos = "'a', 'b' e 'c' sao iguais a zero entao a funcao igual a zero";
					textArea.setText(passos);
				}
				else
				{
					String passos = "a e b sao iguais a zero entao a funcao é homogenea e sempre sera igual a 'c'";
					textArea.setText(passos);
					PrimeiroGrau(b, c);
				}
			}
			else if(c == 0.0)
			{
				raizes(a, b, c);
				imprimirGrafico.setEnabled(false);
				ImprimirGraficoPanel.setA(a);
				ImprimirGraficoPanel.setB(b);
				ImprimirGraficoPanel.setC(c);
				ImprimirGraficoPanel.setLinear(false);
				ImprimirGraficoPanel.setQuadratica(true);
				imprimirGrafico.setEnabled(true);
			}

			else
			{
				raizes(a, b, c);
				imprimirGrafico.setEnabled(false);
				ImprimirGraficoPanel.setA(a);
				ImprimirGraficoPanel.setB(b);
				ImprimirGraficoPanel.setC(c);
				ImprimirGraficoPanel.setLinear(false);
				ImprimirGraficoPanel.setQuadratica(true);
				imprimirGrafico.setEnabled(true);
			}

		}
		else if(c == 0.0)
		{
			if(a == 0.0)
			{
				if(b == 0)
				{
					String passos = "'a', 'b' e 'c' sao iguais a zero entao a funcao igual a zero";
					textArea.setText(passos);
				}
				else
				{
					String passos = "'a' e 'c' sao iguais a zero entao a funcao sempre sera igual a 'bx'";
					textArea.setText(passos);
					PrimeiroGrau(b, c);
				}
			}
			else if(b == 0)
			{
				raizes(a, b, c);
				imprimirGrafico.setEnabled(false);
				ImprimirGraficoPanel.setA(a);
				ImprimirGraficoPanel.setB(b);
				ImprimirGraficoPanel.setC(c);
				ImprimirGraficoPanel.setLinear(false);
				ImprimirGraficoPanel.setQuadratica(true);
				imprimirGrafico.setEnabled(true);
			}
			else
			{
				raizes(a, b, c);
				imprimirGrafico.setEnabled(false);
				ImprimirGraficoPanel.setA(a);
				ImprimirGraficoPanel.setB(b);
				ImprimirGraficoPanel.setC(c);
				ImprimirGraficoPanel.setLinear(false);
				ImprimirGraficoPanel.setQuadratica(true);
				imprimirGrafico.setEnabled(true);
			}
		}
		else
		{
			raizes(a, b, c);
			imprimirGrafico.setEnabled(false);
			ImprimirGraficoPanel.setA(a);
			ImprimirGraficoPanel.setB(b);
			ImprimirGraficoPanel.setC(c);
			ImprimirGraficoPanel.setLinear(false);
			ImprimirGraficoPanel.setQuadratica(true);
			imprimirGrafico.setEnabled(true);
		}
	}

	public static void raizes(Double a, Double b, Double c)
	{
		Double delta = (b * b) - (4 * a * c);
		Double raiz1 = ((-1 * b) + (Math.sqrt(delta))) / (2 * a);
		Double raiz2 = ((-1 * b) - (Math.sqrt(delta))) / (2 * a);
		Double xVertice = (-1 * delta) / (2 * a);
		Double yVertice = (-1 * delta) / (4 * a);
		if(delta > 0.0)
		{
			String passos = "(" + constantestxtField[0].getText() + ")" + "x² + " + "("
					+ constantestxtField[1].getText() + ")x + (" + constantestxtField[2].getText() + ") = 0 \n"
					+ "Nos polinomios do tipo ax² + bx + c = 0, temos que primeiro calcular o delta \n"
					+ "delta  = b² -4ac \n" + "Se delta > 0  as raizes sao reais e diferentes \n"
					+ "Se delta = 0 as raizes sao reais e iguais \n" + "Se delta < 0 as raizes nao sao reais \n"
					+ "delta = (" + constantestxtField[1].getText() + ")² - 4" + "(" + constantestxtField[0].getText()
					+ ") x " + "(" + constantestxtField[2].getText() + ")\n" + "delta = " + delta + " \n"
					+ "Nesse caso delta é maior que zero logo as raizes sao reais e diferentes \n"
					+ "As raizes sao calculadas usando a equacao : x1,x2 = [-b +- (delta^1/2)]/2a \n" + "x1 = [-("
					+ constantestxtField[1].getText() + ") + (" + delta + "^1/2)]/2(" + constantestxtField[0].getText()
					+ ") \n" + "x2 = [-(" + constantestxtField[1].getText() + ") - (" + delta + "^1/2)]/2("
					+ constantestxtField[0].getText() + ") \n" + "x1 = " + raiz1 + "\n" + "x2 = " + raiz2 + "\n"
					+ "A ordenada em x = 0 sera : " + a + "*0 +" + b + "*0 +" + c + " = " + c + "\n"
					+ "x Vertice sera : " + (-1 * delta) + "/2" + a + "= " + xVertice + "\n" + "y Vertice sera : "
					+ (-1 * delta) + "/4" + a + "= " + yVertice + "\n";

			textArea.setText(passos);
		}

		if(delta == 0.0)
		{
			String passos = "(" + constantestxtField[0].getText() + ")" + "x² + " + "("
					+ constantestxtField[1].getText() + ")x + (" + constantestxtField[2].getText() + ") = 0 \n"
					+ "Nos polinomios do tipo ax² + bx + c = 0, temos que primeiro calcular o delta \n"
					+ "delta  = b² -4ac \n" + "Se delta > 0  as raizes sao reais e diferentes \n"
					+ "Se delta = 0 as raizes sao reais e iguais \n" + "Se delta < 0 as raizes nao sao reais \n"
					+ "delta = (" + constantestxtField[1].getText() + ")² - 4" + "(" + constantestxtField[0].getText()
					+ ") x " + "(" + constantestxtField[2].getText() + ")\n" + "delta = " + delta + " \n"
					+ "Nesse caso delta é igual a zero logo as raizes sao reais e iguais \n"
					+ "As raizes sao calculadas usando a equacao : x1,x2 = [-b +- (delta^1/2)]/2a \n" + "x1 = [-("
					+ constantestxtField[1].getText() + ") + (" + delta + "^1/2)]/2(" + constantestxtField[0].getText()
					+ ") \n" + "x2 = [-(" + constantestxtField[1].getText() + ") - (" + delta + "^1/2)]/2("
					+ constantestxtField[0].getText() + ") \n" + "x1 = x2 = " + raiz1 + "\n"
					+ "A ordenada em x = 0 sera : " + a + "*0 +" + b + "*0 +" + c + " = " + c + "\n"
					+ "x Vertice sera : " + (-1 * delta) + "/2" + a + "= " + xVertice + "\n" + "y Vertice sera : "
					+ (-1 * delta) + "/4" + a + "= " + yVertice + "\n";

			textArea.setText(passos);

		}

		if(delta < 0.0)
		{
			String passos = "(" + constantestxtField[0].getText() + ")" + "x² + " + "("
					+ constantestxtField[1].getText() + ")x + (" + constantestxtField[2].getText() + ") = 0 \n"
					+ "Nos polinomios do tipo ax² + bx + c = 0, temos que primeiro calcular o delta \n"
					+ "delta  = b² -4ac \n" + "Se delta > 0  as raizes sao reais e diferentes \n"
					+ "Se delta = 0 as raizes sao reais e iguais \n" + "Se delta < 0 as raizes nao sao reais \n"
					+ "delta = (" + constantestxtField[1].getText() + ")² - 4" + "(" + constantestxtField[0].getText()
					+ ") x " + "(" + constantestxtField[2].getText() + ") \n" + "delta = " + delta + " \n"
					+ "Nesse caso delta é menor que zero logo nao sao reais \n" + "A ordenada em x = 0 sera : " + a
					+ "*0 +" + b + "*0 +" + c + " = " + c + "\n" + "x Vertice sera : " + (-1 * delta) + "/2" + a + "= "
					+ xVertice + "\n" + "y Vertice sera : " + (-1 * delta) + "/4" + a + "= " + yVertice + "\n";

			textArea.setText(passos);
		}
	}
}
