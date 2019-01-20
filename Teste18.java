import java.util.Scanner;

//FATORIAL

class Teste18 { 
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num, inicial;
		int res = 1;

		System.out.print("Digite um numero: ");
		num = ler.nextInt();

		inicial = num - 1;

		if (inicial != 0){
			res = num * inicial;
			System.out.print(num +"!= " + num);

			for (int i = inicial - 1; i >= 1; --i){
			res = res * i;
			System.out.print("x" + i);
			}

		} else {
			inicial = inicial + 1;
			System.out.print(num +"!");
			res = num * inicial;
		}
	
		System.out.println("= " + res);
	}
}