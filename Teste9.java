import java.util.Scanner;

class Teste9 {
	public static void main (String[] args){

		Scanner ler = new Scanner(System.in);
		String nome, senha, sexo, est_civil;
		int idade;
		Double salario;

		System.out.print("Digite seu nome: ");
		nome = ler.next();
		while (nome.length() <= 3){
			System.out.print("Invalido! Digite novamente seu nome: ");
			nome = ler.next();
		}

		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();
		while (idade <= 0 || idade > 150){
			System.out.print("Invalido! Digite novamente sua idade: ");
			idade = ler.nextInt();
		}

		System.out.print("Digite seu salario: ");
		salario= ler.nextDouble();
		while (salario <= 0){
			System.out.print("Invalido! Digite novamente seu salario: ");
			salario = ler.nextDouble();
		}

		System.out.print("Digite seu sexo(M ou F): ");
		sexo = ler.next();
		while (!sexo.equals("M") && !sexo.equals("F")){
			System.out.print("Invalido! Digite novamente seu sexo: ");
			sexo = ler.next();
		}

		System.out.print("Digite seu estado civil(S, C, V ou D): ");
		est_civil = ler.next();
		while (!est_civil.equals("S") && !est_civil.equals("C")
				&& !est_civil.equals("V") && !est_civil.equals("D")) {
			System.out.print("Invalido! Digite novamente seu estado civil: ");
			est_civil = ler.next();
		}
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + est_civil);
		System.out.println("");
		
		System.out.println("Fim do programa!");
	}
}