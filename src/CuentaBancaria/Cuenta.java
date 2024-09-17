package CuentaBancaria;

public class Cuenta {

	private int saldo;
	
	public Cuenta() 
	{
		this.saldo = 0;
	}

	public void acreditar(int plata) 
	{
		this.saldo += plata;
	}
	
	public void retiro(int plata) 
	{
		if(this.saldo - plata < 0)
			throw new IllegalArgumentException ("No hay plata");
		this.saldo -=plata;
	}
	
	public String toString() 
	{
		return "Su saldo es: "+this.saldo;
	}
}
