package CuentaBancaria;

public class Cuenta {

	protected int saldo;
	
	public Cuenta() {
		this.saldo = 0;
	}

	public void acreditar(int plata) {
		if(plata <= 0)
			throw new IllegalArgumentException("No puedo acreditar montos negativos");
		this.saldo += plata;
	}
	
	public void retiro(int plata) {
		
		if(plata <= 0)
			throw new IllegalArgumentException("No se pueden realizar montos negativos");
		
		if(this.saldo - plata < 0)
			throw new IllegalArgumentException ("No hay plata");
		this.saldo -=plata;
	}
	
	public void transferir(int monto, Cuenta cDestino) 
	{
		if(monto <= 0)
			throw new IllegalArgumentException("No se pueden transferir montos menora  0");
		
		if(this.saldo < monto)
			throw new IllegalArgumentException("No hay saldo suficiente para transferencia");
		
		cDestino.saldo += monto;
		this.saldo -=monto;
	}
	
	
	public int consultarSaldo() 
	{
		return this.saldo;
	}
	
	public String toString() {
		return "Su saldo es: "+this.saldo;
	}
}
