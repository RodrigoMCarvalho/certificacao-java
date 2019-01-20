import java.util.Scanner;

// 5! = 5x4x3x2x1=120

class FatorialRecursividade {

	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);
		int num, retorno;

		System.out.print("Digite um numero: ");
		num = ler.nextInt();
		System.out.print(num + "!=");
		retorno = Calculadora.fatorial(num);
		System.out.print(retorno);
	}
}

class Calculadora{	

	public static int fatorial(int num){

		if(num == 0) {
			return 1;
		}
		return num * fatorial(num - 1); //método chama ele mesmo em loop até num for igual a zero
	}
}