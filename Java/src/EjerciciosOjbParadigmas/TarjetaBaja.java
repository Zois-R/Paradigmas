package EjerciciosOjbParadigmas;

public class TarjetaBaja {

		private double saldo;
		private double pasajeColectivo = 35.59;
		private double pasajeSubte = 34.50;
		private int cantViajesSubte = 0;
		private int cantViajesColectivo = 0;
		// completar
		
		
		/**
		 * post: saldo de la Tarjeta en saldoInicial.
		 */
		public TarjetaBaja(double saldoInicial) {
			this.saldo = saldoInicial;
		}

		/**
		 * post: devuelve el saldo actual de la Tarjeta
		 */
		public double obtenerSaldo() {
			// completar
			return saldo;
		}

		/**
		 * post: agrega el monto al saldo de la Tarjeta.
		 */
		public void cargar(double monto) {
			this.saldo += monto;
		}

		/**
		 * pre : saldo suficiente. post: utiliza 39.59 del saldo para un viaje en
		 * colectivo.
		 */
		public void pagarViajeEnColectivo() {
			if((saldo - pasajeColectivo) < 0)
				throw new IllegalArgumentException("No tiene saldo");
			saldo -= pasajeColectivo;
			cantViajesColectivo++;
		}

		/**
		 * pre : saldo suficiente. post: utiliza 34.50 del saldo para un viaje en subte.
		 */
		public void pagarViajeEnSubte() {
			if(saldo - pasajeSubte < 0)
				throw new IllegalArgumentException("No tiene saldo");
			saldo -= pasajeSubte;
			cantViajesSubte++;
		}

		/**
		 * post: devuelve la cantidad de viajes realizados.
		 */
		public int contarViajes() {
			// completar
			return cantViajesColectivo+cantViajesSubte;
		}

		/**
		 * post: devuelve la cantidad de viajes en colectivo.
		 */
		public int contarViajesEnColectivo() {
			// completar
			return cantViajesColectivo;
		}

		/**
		 * post: devuelve la cantidad de viajes en subte.
		 */
		public int contarViajesEnSubte() {
			// completar
			return cantViajesSubte;
		}
}
