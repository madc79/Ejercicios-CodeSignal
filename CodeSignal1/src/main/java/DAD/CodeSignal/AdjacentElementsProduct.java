package DAD.CodeSignal;

public class AdjacentElementsProduct {
	int solution(int[] inputArray) {
	    // Asegúrate de que el arreglo tenga al menos dos elementos
	    if (inputArray.length < 2) {
	        throw new IllegalArgumentException("Debe tener al menos dos elementos.");
	    }

	    int productomax = Integer.MIN_VALUE;

	    for (int i = 0; i < inputArray.length - 1; i++) {
	        int productoActual = inputArray[i] * inputArray[i + 1];
	        if (productoActual > productomax) {
	            productomax = productoActual;
	        }
	    }

	    return productomax;
	}
}
