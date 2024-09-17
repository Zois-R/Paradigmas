package CuentaBancaria;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Cuenta cuentaOrigen = new Cuenta();
		cuentaOrigen.acreditar(10000);
		Cuenta cuentaDestino = new Cuenta();
		cuentaOrigen.transferir(500, cuentaDestino);
		System.out.println(cuentaOrigen.consultarSaldo());
		System.out.println(cuentaDestino.consultarSaldo());
	}

}
