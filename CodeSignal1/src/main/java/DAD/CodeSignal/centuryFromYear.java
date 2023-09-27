package DAD.CodeSignal;

public class centuryFromYear {
	int solution(int year) {
	    // Divide el año por 100 y redondea hacia arriba
	    int century = (year + 99) / 100;
	    return century;
	}
}
