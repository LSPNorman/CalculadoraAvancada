package model;

public class ExpressaoObjeto
{
	Double numero;
	Character carater;

	ExpressaoObjeto()
	{}

	public Double getNumero()
	{ return numero; }

	public void setNumero(String numero)
	{ this.numero = Double.parseDouble(numero); }

	public Character getCarater()
	{ return carater; }

	public void setCarater(Character carater)
	{ this.carater = carater; }

	@Override
	public String toString()
	{
		if(numero == null)
			return "" + carater;
		else
			return "" + numero;
	}
}
