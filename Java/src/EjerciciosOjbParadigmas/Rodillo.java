package EjerciciosOjbParadigmas;

public class Rodillo {
	
	
	
	static final String [] simbolos = {"0","1","2","3","4","5","A","B","C","Q","Z"};
	
	public String tirar() {
      String valor;	
	  valor = simbolos[(int)(Math.random()*simbolos.length)];
	  return valor; 
	}
	
	
}
