package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class ImprimirGraficoPanel extends JPanel
{
	public static Double a;
	public static Double b;
	public static Double c;
	public static boolean linear;
	public static boolean quadratica;

	public static boolean isLinear()
	{ return linear; }

	public static void setLinear(boolean linear)
	{ linear = linear; }

	public static boolean isQuadratica()
	{ return quadratica; }

	public static void setQuadratica(boolean quadratica)
	{ ImprimirGraficoPanel.quadratica = quadratica; }

	public ImprimirGraficoPanel()
	{ this.setVisible(true); }

	public static Double getA()
	{ return a; }

	public static void setA(Double a)
	{ ImprimirGraficoPanel.a = a; }

	public static Double getB()
	{ return b; }

	public static void setB(Double b)
	{ ImprimirGraficoPanel.b = b; }

	public static Double getC()
	{ return c; }

	public static void setC(Double c)
	{ ImprimirGraficoPanel.c = c; }

	public void paint(Graphics g)
	{
		Graphics2D grafico = (Graphics2D) g;
		if(isLinear() == true)
		{
			int linhaxcomeco = 0;
			int linhaycomeco = 0;
			for (int i = 0; i < 15; i++)
			{

				grafico.setColor(Color.WHITE);
				if(i == 6)
				{
					grafico.setStroke(new BasicStroke(3));
					grafico.drawLine(linhaxcomeco, 0, linhaxcomeco, 280);
					linhaxcomeco = linhaxcomeco + (350 / 10);
				}
				else
				{

					grafico.setStroke(new BasicStroke(1));
					grafico.drawLine(linhaxcomeco, 0, linhaxcomeco, 280);
					linhaxcomeco = linhaxcomeco + (350 / 10);
				}
			}
			for (int j = 0; j < 12; j++)
			{
				grafico.setColor(Color.WHITE);
				if(j == 4)
				{
					grafico.setStroke(new BasicStroke(3));
					grafico.drawLine(0, linhaycomeco, 420, linhaycomeco);
					linhaycomeco = linhaycomeco + (350 / 10);
				}
				else
				{
					grafico.setStroke(new BasicStroke(1));
					grafico.drawLine(0, linhaycomeco, 420, linhaycomeco);
					linhaycomeco = linhaycomeco + (350 / 10);
				}
			}

			if((getA() != null) && (getB() != null))
			{
				Double adouble = getA();
				Double bdouble = getB();
				int aint = adouble.intValue();
				int bint = bdouble.intValue();

				int[] yvetorinicial = new int[41];
				int[] yvetorfinal = new int[41];

				for (int i = 0; i < 41; i++)
				{
					yvetorinicial[i] = (aint * (i - 20)) + bint;
					System.out.println("x : " + (i - 20));
					System.out.println("y : " + yvetorinicial[i]);

					int xinicial = ((350 / 10) * 6) + ((350 / 10) * (i - 20));
					int yinicial = ((350 / 10) * 4) - ((350 / 10) * yvetorinicial[i]);

					yvetorfinal[i] = (aint * (i + 1 - 20)) + bint;
					int xfinal = ((350 / 10) * 6) + ((350 / 10) * (i + 1 - 20));
					int yfinal = ((350 / 10) * 4) - ((350 / 10) * yvetorfinal[i]);

					grafico.setColor(Color.RED);
					grafico.setStroke(new BasicStroke(4));
					grafico.drawLine(xinicial, yinicial, xfinal, yfinal);
				}
			}
		}
		if(isQuadratica() == true)
		{
			int linhaxcomeco = 0;
			int linhaycomeco = 0;
			for (int i = 0; i < 150; i++)
			{

				grafico.setColor(Color.WHITE);
				if(i == 70)
				{
					grafico.setStroke(new BasicStroke(3));
					grafico.drawLine(linhaxcomeco, 0, linhaxcomeco, 280);
					linhaxcomeco = linhaxcomeco + (350 / 100);
				}
				else
				{
					linhaxcomeco = linhaxcomeco + (350 / 100);
				}
			}
			for (int j = 0; j < 150; j++)
			{
				grafico.setColor(Color.WHITE);
				if(j == 45)
				{
					grafico.setStroke(new BasicStroke(3));
					grafico.drawLine(0, linhaycomeco, 420, linhaycomeco);
					linhaycomeco = linhaycomeco + (350 / 100);
				}
				else
				{
					linhaycomeco = linhaycomeco + (350 / 100);
				}
			}
			if((getA() != null) && (getB() != null) && (getC() != null))
			{
				Double adouble = getA();
				Double bdouble = getB();
				Double cdouble = getB();
				int aint = adouble.intValue();
				int bint = bdouble.intValue();
				int cint = cdouble.intValue();

				int[] yvetorinicial = new int[100];
				int[] yvetorfinal = new int[100];

				for (int i = 0; i < 25; i++)
				{
					yvetorinicial[i] = (aint * (i - 12) * (i - 12)) + (bint * (i - 12)) + cint;
					System.out.println("x : " + (i - 12));
					System.out.println("y : " + yvetorinicial[i]);

					int xinicial = ((350 / 100) * 70) + ((350 / 100) * (i - 12));
					int yinicial = ((350 / 100) * 45) - ((350 / 100) * yvetorinicial[i]);

					yvetorfinal[i] = (aint * (i + 1 - 12) * (i + 1 - 12)) + (bint * (i + 1 - 12)) + cint;;
					int xfinal = ((350 / 100) * 70) + ((350 / 100) * (i + 1 - 12));
					int yfinal = ((350 / 100) * 45) - ((350 / 100) * yvetorfinal[i]);

					grafico.setColor(Color.RED);
					grafico.setStroke(new BasicStroke(3));
					grafico.drawLine(xinicial, yinicial, xfinal, yfinal);
				}
			}

		}

	}
}
