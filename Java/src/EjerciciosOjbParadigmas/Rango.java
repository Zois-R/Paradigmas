package EjerciciosOjbParadigmas;

public class Rango {
	
	private final double ini,fin;
	private final boolean abiertoIzq, abiertoDer;
	
	
	
	private Rango(double ini,double fin, boolean abiertoIzq, boolean abiertoDer) 
	{
		this.ini = ini;
		this.fin = fin;
		this.abiertoIzq = abiertoIzq;
		this.abiertoDer = abiertoDer;
	}
	
	public static Rango rangoCerrado(double ini, double fin, boolean abiertoIzq, boolean abiertoDer) 
	{
		Rango rango = new Rango(ini,fin,abiertoIzq,abiertoDer);
		
		return rango;
	}
	
	public static Rango rangoCerrIzqAbDer(double ini, double fin, boolean abiertoIzq, boolean abiertoDer) 
	{
		Rango rango = new Rango(ini,fin,abiertoIzq,abiertoDer);
		
		return rango;
	}
	
	
	public static Rango rangoCerrDerAbIzq(double ini, double fin, boolean abiertoIzq, boolean abiertoDer) 
	{
		Rango rango = new Rango(ini,fin,abiertoIzq,abiertoDer);
	
		return rango;
	}
	
	public static Rango rangoAbierto(double ini, double fin, boolean abiertoIzq, boolean abiertoDer) 
	{
		Rango rango = new Rango(ini,fin,abiertoIzq,abiertoDer);
	
		return rango;
	}
	
	public boolean numDentroDeRango(double num) {
	    // se guarda en una variable el resultado
		//y dentro de la comparación devuelvo otras comparaciones
		/*
		 Esta abierto izq?
		 Si es así entonces devuelvo el resultado boleano de num>ini
		 Si no devuelvo el resultado boleano de num>=ini
		 */
	    boolean cumpleIzq = abiertoIzq ? num > ini : num >= ini;
	    
	    boolean cumpleDer = abiertoDer ? num < fin : num <= fin;

	    // Retorna true si el número cumple ambos límites, false en caso contrario
	    return cumpleIzq && cumpleDer;
	}
	
	
	public boolean rangoDentroDeRango(Rango rango) 
	{
		boolean dentroDeIzq = rango.abiertoIzq ? rango.ini > this.ini : rango.ini >=this.ini;
		boolean dentroDeDer = rango.abiertoDer ? rango.fin < this.fin : rango.fin <= this.fin;
		
		return dentroDeIzq && dentroDeDer;
	}
	
	public boolean sonIgualesRangos(Rango rango) 
	{
		boolean validoLimites = this.abiertoIzq == rango.abiertoIzq ? this.abiertoDer == rango.abiertoDer : false;
		boolean validoNumeros = this.ini == rango.ini ? this.fin == rango.fin : false;
		return validoLimites && validoNumeros;
	}
	
	public Rango interseccionRango(Rango rango) 
	{
		if(rango.ini > this.fin || this.fin < rango.ini) 
			return null;
		
		double iniInt = rango.ini > this.ini ? this.ini : rango.ini; // el mayor de los 2 es con el que me qeudo
		double finInt = rango.fin < this.fin ? rango.fin : this.fin; /// el menor de los 2 es con el que me quedo
		boolean izqLim = iniInt == this.ini ? this.abiertoIzq :  rango.abiertoIzq;
		boolean derLim = finInt == this.fin ? this.abiertoDer :  rango.abiertoDer;
		Rango intersec = new Rango(iniInt,finInt,izqLim,derLim);
		return intersec;
	}
	
	//Proporcionar un método estático que devuelva un rango
	//que abarque a todos los otros rangos.
	public static Rango abarcador(Rango[] Rangos) 
	{
		
		boolean simbIzq = Rangos[0].abiertoIzq;
		boolean simbDer = Rangos[0].abiertoDer;
		double numFin = Rangos[0].fin;
		double numIni = Rangos[0].ini;
		
		for(int i = 1; i<Rangos.length ; i++) 
		{
			if(numIni > Rangos[i].ini) 
			{
				numIni = Rangos[i].ini;
				simbIzq = Rangos[i].abiertoIzq;
			}
			
			if(numFin <Rangos[i].fin)
			{
				numFin = Rangos[i].fin;
				simbDer = Rangos[i].abiertoDer;
			}
			}
		
		return new Rango(numIni,numFin,simbIzq,simbDer);
	}
	
	///Se deben poder sumar rangos, utilizando el inicio del primero y el fin del segundo.
	
	public static Rango sumarRangos(Rango r1, Rango r2) {
		double iniNue = r1.ini < r2.ini ? r1.ini : r2.ini;
		double finNue = r1.fin > r2.fin ? r1.fin : r2.fin;
		boolean izqSimb = iniNue == r1.ini ? r1.abiertoIzq : r2.abiertoIzq;
		boolean derSimb = finNue == r1.fin ? r1.abiertoDer : r2.abiertoIzq;
		return new Rango(iniNue,finNue,izqSimb,derSimb);
	}
	
	public Rango desplazarRango(double num, Rango r1) 
	{
		
		return new Rango(r1.ini+num,r1.fin+num,r1.abiertoIzq,r1.abiertoDer);
	}
	
	public String toString() 
	{
		char limInf = this.abiertoIzq ? '(' : '[';
		char limSup = this.abiertoDer ? ')' : ']';
		
		return  limInf +""+ this.ini + ";" + this.fin +""+ limSup;
	}
}
