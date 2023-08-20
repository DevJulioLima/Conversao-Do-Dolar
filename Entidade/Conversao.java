package util;

public class Conversao {
	public static double IOF = 0.06;
	public static double valorFinal(double dolar, double quantidade) {
		return dolar * quantidade * (1.0 + IOF);
	}

}
