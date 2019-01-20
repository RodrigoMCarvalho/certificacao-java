import java.util.Scanner;

class Teste11 {
	public static void main (String[] args){

		int A ,B;
		double taxaA, taxaB;
		int totalAnos = 0;

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite a populacao de A: ");
		A = ler.nextInt();
		System.out.print("Digite a taxa de A: ");
		taxaA = ler.nextDouble();
		System.out.print("Digite a populacao de B: ");
		B = ler.nextInt();
		System.out.print("Digite a taxa de B: ");
		taxaB = ler.nextDouble();

		while (A < B) {
			A += (A / 100) * taxaA;
			B += (B / 100) * taxaB;
			totalAnos++;
		} 

		System.out.println("Populacao de A depois de " + totalAnos +" anos: " + A + ", com taxa anual de " + taxaA);
		System.out.println("Populacao de B depois de " + totalAnos + " anos: "  + B + ", com taxa anual de " + taxaB);
	}
}