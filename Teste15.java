import java.util.Scanner;

class Teste15 {
	
	public static void main (String[] args){

		int n1, n2;
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o numero inicial: ");
		n1 = ler.nextInt();
		System.out.print("Digite o numero final: ");
		n2 = ler.nextInt();

		if(n1<n2){
			for(int i = n1; i <= n2; i++){
			System.out.println(i);
			}
		} else if (n1>n2){
			for(int i = n1; i >= n2; i--){
			System.out.println(i);
			}
		} else {
			System.out.println("Digite numeros diferentes");
		}

	}
}