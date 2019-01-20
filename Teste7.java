import java.util.Scanner;

class Teste7 {
	public static void main (String[] args){

		Scanner ler = new Scanner(System.in);
		int num;
		System.out.println("Digite um valor entre 0 e 10");
		num = ler.nextInt();

		while (num < 0 || num > 10){
			System.out.println("Valor inválido! Digite um valor entre 0 e 10");
			num = ler.nextInt();
		}

		System.out.println("Fim do programa!");
	}
}