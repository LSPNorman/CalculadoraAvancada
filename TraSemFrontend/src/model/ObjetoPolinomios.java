package model;

public class ObjetoPolinomios 
{
	Double a, b, c, d;

	
	public ObjetoPolinomios(Double a, Double b) 
	{
		this.a = a;
		this.b = b;
	}

	public ObjetoPolinomios(Double a, Double b, Double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public ObjetoPolinomios(Double a, Double b, Double c, Double d) 
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Double getA() 
	{
		return a;
	}

	public void setA(Double a) 
	{
		this.a = a;
	}

	public Double getB() 
	{
		return b;
	}

	public void setB(Double b) 
	{
		this.b = b;
	}

	public Double getC() 
	{
		return c;
	}

	public void setC(Double c) 
	{
		this.c = c;
	}

	public Double getD() 
	{
		return d;
	}

	public void setD(Double d) 
	{
		this.d = d;
	}	
}
