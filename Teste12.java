import java.util.Scanner;

//mesmo exercicio do Teste11, porém com validação do numero da população

class Teste12 {
	public static void main (String[] args){

		int A ,B;
		double taxaA, taxaB;
		int totalAnos = 0;
		boolean valido = false;

		Scanner ler = new Scanner(System.in);

		do {
		System.out.print("Digite a populacao de A: ");
		A = ler.nextInt();
			if(A > 0){
				valido = true;
			} else {
				System.out.print("A populacao de A devera ser maior q 0.");
			}
		} while (!valido) ;

		System.out.print("Digite a taxa de A: ");
		taxaA = ler.nextDouble();

		valido = false;
		do {
		System.out.print("Digite a populacao de B: ");
		B = ler.nextInt();
			if(B > 0){
				valido = true;
			} else {
				System.out.print("A populacao de B devera ser maior q 0.");
			}
		} while (!valido) ;

		System.out.print("Digite a taxa de B: ");
		taxaB = ler.nextDouble();

		do {
			A += (A / 100) * taxaA;
			B += (B / 100) * taxaB;
			totalAnos++;
		} while (A < B) ;

		System.out.println("Populacao de A depois de " + totalAnos +" anos: " + A + ", com taxa anual de " + taxaA);
		System.out.println("Populacao de B depois de " + totalAnos + " anos: "  + B + ", com taxa anual de " + taxaB);
	}
}