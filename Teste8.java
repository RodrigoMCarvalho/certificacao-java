import java.util.Scanner;

class Teste8 {
	public static void main (String[] args){

		Scanner ler = new Scanner(System.in);
		String nome, senha;

		System.out.print("Digite seu nome: ");
		nome = ler.next();
		System.out.print("Digite sua senha: ");
		senha = ler.next();

		while (nome.equals(senha)){
			System.out.print("Digite novamente seu nome: ");
			nome = ler.next();
			System.out.print("Digite novamente sua senha: ");
			senha = ler.next();
		}
		System.out.println("Fim do programa!");
	}
}