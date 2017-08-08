package util;

public class Util {
	
	public static void valida(String validando, String tipoParametro){
		if (tipoParametro.equals("nome") && validando == null)
				throw new RuntimeException("O nome nao pode ser nulo");
		else if (tipoParametro.equals("nome") && validando.trim().isEmpty())
			throw new RuntimeException("O nome nao pode ser vazio");
		
	}
	
	public static void validaValor(double valor, String tipoParametro){
		 if (valor < 0 && tipoParametro.equals("valorItem")) 
			throw new IllegalArgumentException("O valor nao pode ser negativo");
		
	}

}
