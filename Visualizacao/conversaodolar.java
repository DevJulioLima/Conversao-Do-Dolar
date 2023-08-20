package conversao;

import java.util.Locale;
import java.util.Scanner;

import util.Conversao;

public class conversaodolar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("qual o valor do dolar? ");
		double dolar = sc.nextDouble();
		System.out.print("quantos dolar voce quer? ");
		double quantidade = sc.nextDouble();
		double resultado = Conversao.valorFinal(quantidade, dolar);
		System.out.printf("o valor em reais = %.2f%n", resultado);
		
		sc.close();
		

	}

}
