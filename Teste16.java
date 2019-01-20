import java.util.Scanner;

class Teste16 {
	
	public static void main(String[] args) {

		int num;
		int soma = 0;
		double media;
		Scanner ler = new Scanner(System.in);
		int cont = 1;
		do {
			System.out.print("Digite um numero: ");
			num = ler.nextInt();
			soma += num;
			cont++;
		} while (cont <= 5 );

		media = soma/5;

		System.out.println("A soma e: " + soma);	
		System.out.println("A media e: " + media);
	}
}