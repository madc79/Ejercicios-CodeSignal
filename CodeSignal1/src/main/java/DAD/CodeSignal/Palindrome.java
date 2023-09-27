package DAD.CodeSignal;

public class Palindrome {
	boolean solution(String inputString) {
	    // Elimina los espacios en blanco y convierte la cadena a minúsculas
	    inputString = inputString.replaceAll("\\s+", "").toLowerCase();

	    // Calcula la longitud de la cadena
	    int length = inputString.length();

	    // Compara la cadena original con su reverso
	    for (int i = 0; i < length / 2; i++) {
	        if (inputString.charAt(i) != inputString.charAt(length - i - 1)) {
	            return false; // No es un palíndromo
	        }
	    }

	    return true; 
	}


}
