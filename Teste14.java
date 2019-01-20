import java.util.Scanner;

class Teste14 {
	public static void main (String[] args){

		int num;
		int maior = 0;
		int cont = 1;
		Scanner ler = new Scanner(System.in);

		do {
			System.out.print("Digite o " + cont + " numero: ");
			num = ler.nextInt();
			if (num > maior){
				maior = num;
			}
			cont++;
		} while ( cont <= 5);

		System.out.println("O maior numero digitado foi: " + maior);
	}
}