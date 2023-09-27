package DAD.CodeSignal;

public class MakeArray {
	
	int solution(int[] statues) {
	    int minSize = statues[0];
	    int maxSize = statues[0];
	    
	    // Encuentra el tamaño mínimo y máximo
	    for (int statue : statues) {
	        minSize = Math.min(minSize, statue);
	        maxSize = Math.max(maxSize, statue);
	    }
	    
	    // Calcula la longitud del intervalo
	    int intervalLength = maxSize - minSize + 1;
	    
	    // Calcula la cantidad de estatuas adicionales necesarias
	    int additionalStatues = intervalLength - statues.length;
	    
	    return additionalStatues;
	}


}
