  

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Informe um numero de até 9999");
		int num = leitor.nextInt();
		
		int milhar = num / 1000 % 10;
		int centena = num / 100 % 10;
		int dezena = num / 10 % 10;
		int unidade = num / 1 % 10;
		
		int geral = milhar + centena + dezena + unidade;
		
		System.out.println("A soma dos dígitos do número " + num + " é: " + geral);		
	}

}