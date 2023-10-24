package model;

import java.util.ArrayList;

import view.ExpressoesAritimeticasView;

public class ExpressoesAritimeticasModel extends ExpressoesAritimeticasView
{
	public static void StringToArrayList(String expressaoString)
	{
		// System.out.println(expressaoString);
		String textfield = expressaoString + " ";
		String termoString = "";
		int i = 0;
		int j = 0;

		ArrayList<ExpressaoObjeto> expressaoList = new ArrayList<ExpressaoObjeto>();

		for (i = 0; i < textfield.length(); i++)
		{
			i = j;

			termoString = "";
			if(Character.isDigit(textfield.charAt(i)))
			{
				for (j = i; Character.isDigit(textfield.charAt(j)); j++)
				{
					termoString = termoString + textfield.charAt(j);
					i++;
				}

				ExpressaoObjeto equacaoObjeto = new ExpressaoObjeto();
				equacaoObjeto.setNumero(termoString);
				expressaoList.add(equacaoObjeto);
			}

			else
			{
				ExpressaoObjeto equacaoObjeto2 = new ExpressaoObjeto();
				equacaoObjeto2.setCarater(textfield.charAt(i));
				expressaoList.add(equacaoObjeto2);
				j++;
			}
		}
		String imprimirExpressao = new String();
		for (ExpressaoObjeto contador : expressaoList)
		{ imprimirExpressao = imprimirExpressao.concat(contador.toString()); }
		// textArea.setText(imprimirExpressao);
		// System.out.println(imprimirExpressao);
		verificarAbrirPartenteses(expressaoList);
	}

	public static void verificarAbrirPartenteses(ArrayList<ExpressaoObjeto> expressaoList)
	{
		ArrayList<ExpressaoObjeto> depoisDeAbrirParenteses = new ArrayList<ExpressaoObjeto>();
		ArrayList<ExpressaoObjeto> antesDeAbrirParenteses = new ArrayList<ExpressaoObjeto>();
		ArrayList<ExpressaoObjeto> juncaoPosCalculo = new ArrayList<ExpressaoObjeto>();

		int indiceAbrirParenteses = -1;
		int indiceFecharParenteses = -1;
		int i = 0;
		int k = 0;

		for (ExpressaoObjeto iterador : expressaoList)
		{
			if(iterador.toString().equals("("))
			{
				indiceAbrirParenteses = i;
			}
			i++;

		}
		if(indiceAbrirParenteses == -1)
		{
			for (ExpressaoObjeto iterador : expressaoList)
			{
				if(iterador.toString().equals(")"))
				{
					indiceFecharParenteses = k;
				}
				k++;
			}
			if(indiceFecharParenteses == -1)
			{
				arrayToString(expressaoList);
				textArea.setText(textArea.getText() + "\n" + imprimirtxtA);
				// System.out.println(imprimirtxtA);
			}
			else
			{
				textArea.setText("Insira o '(' \n");
				// System.out.println("Insira o '(' \n");
			}
		}
		else
		{
			if(indiceAbrirParenteses != 0)
			{
				for (int j = 0; j < indiceAbrirParenteses; j++)
				{ antesDeAbrirParenteses.add(expressaoList.get(j)); }
			}

			if(indiceAbrirParenteses != expressaoList.size() - 1)
			{
				for (int l = indiceAbrirParenteses + 1; l < expressaoList.size(); l++)
				{ depoisDeAbrirParenteses.add(expressaoList.get(l)); }

			}

			juncaoPosCalculo.addAll(antesDeAbrirParenteses);

			for (ExpressaoObjeto iterador : expressaoList)
			{
				if(iterador.toString().equals(")"))
				{
					indiceFecharParenteses = k;
				}
				k++;
			}

			if(indiceFecharParenteses != -1)
			{
				imprimirtxtA = "";
				juncaoPosCalculo.addAll(verificarFecharParenteses(depoisDeAbrirParenteses));
				verificarAbrirPartenteses(juncaoPosCalculo);
			}
			else
			{
				textArea.setText("Insira o ')' \n");
				// System.out.println("Insira o ')' \n");
			}
		}
	}

	public static ArrayList<ExpressaoObjeto> verificarFecharParenteses(ArrayList<ExpressaoObjeto> expressaoList)
	{
		// System.out.println("VefiricarFecharParentes");
		ArrayList<ExpressaoObjeto> antesDeFecharParenteses = new ArrayList<ExpressaoObjeto>();
		ArrayList<ExpressaoObjeto> depoisDeFecharParenteses = new ArrayList<ExpressaoObjeto>();
		ArrayList<ExpressaoObjeto> juncaoPosCalculo = new ArrayList<ExpressaoObjeto>();

		int indiceFecharParenteses = -1;
		int j = 0;
		String fecharP = ")";

		for (int i = expressaoList.size() - 1; i > -1; i--)
		{
			if(fecharP.equals(String.valueOf(expressaoList.get(i))))
			{
				indiceFecharParenteses = i;
			}
		}

		if(indiceFecharParenteses == -1)
		{
			textArea.setText("Insira o ')' \n");
			// System.out.println("Insira o ')' \n");
		}
		else
		{
			if(indiceFecharParenteses != 0)
			{
				for (j = 0; j < indiceFecharParenteses; j++)
				{ antesDeFecharParenteses.add(expressaoList.get(j)); }
			}

			if(indiceFecharParenteses != expressaoList.size() - 1)
			{
				imprimirtxtA = "";
				for (int k = indiceFecharParenteses + 1; k < expressaoList.size(); k++)
				{ depoisDeFecharParenteses.add(expressaoList.get(k)); }

				arrayToString(antesDeFecharParenteses);

				juncaoPosCalculo.addAll(calculoResultado);
				juncaoPosCalculo.addAll(depoisDeFecharParenteses);
			}
		}
		return juncaoPosCalculo;
	}

	static String imprimirtxtA = new String();
	static ArrayList<ExpressaoObjeto> calculoResultado = new ArrayList<ExpressaoObjeto>();

	public static void Calcular(ArrayList<ExpressaoObjeto> expressaoList)
	{
		ArrayList<ExpressaoObjeto> calculoList = new ArrayList<ExpressaoObjeto>();
		int indice = 0;
		double termoA;
		double termoB;
		char operador;
		double resultadoDouble = 0.0;
		String resultadoString;

		if(expressaoList.size() > 1)
		{

			termoA = expressaoList.get(0).getNumero();
			operador = expressaoList.get(1).getCarater();
			termoB = expressaoList.get(2).getNumero();

			switch (operador)
			{
				case '+':
					resultadoDouble = termoA + termoB;
				break;
				case '-':
					resultadoDouble = termoA - termoB;
				break;
				case '*':
					resultadoDouble = termoA * termoB;
				break;
				case '/':
					resultadoDouble = termoA / termoB;
				break;
			}

			ExpressaoObjeto resultadoObjeto = new ExpressaoObjeto();
			resultadoString = Double.toString(resultadoDouble);
			resultadoObjeto.setNumero(resultadoString);
			calculoList.add(resultadoObjeto);

			expressaoList.remove(0);
			expressaoList.remove(0);
			expressaoList.remove(0);

			calculoList.addAll(expressaoList);

			String imprimir = new String();
			for (ExpressaoObjeto contador : calculoList)
			{ imprimir = imprimir.concat(contador.toString()); }

			imprimirtxtA = imprimirtxtA.concat(imprimir + "\n");
			calculoResultado = calculoList;

			Calcular(calculoList);
		}
	}

	public static void arrayToString(ArrayList<ExpressaoObjeto> expressaoList)
	{
		imprimirtxtA = "";
		String imprimirExpressao = new String();
		for (ExpressaoObjeto contador : expressaoList)
		{ imprimirExpressao = imprimirExpressao.concat(contador.toString()); }
		textArea.setText(textArea.getText() + imprimirExpressao);
		// System.out.println(imprimirExpressao);
		Calcular(expressaoList);
		textArea.setText(textArea.getText() + "\n" + imprimirtxtA);
		// System.out.println(imprimirtxtA);
		imprimirtxtA = "";
	}
}
