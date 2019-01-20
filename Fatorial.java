import java.util.Scanner;

// 5! = 5x4x3x2x1=120

class Fatorial {

	public static void main(String[] args){

		int num;
		int prox = 1;
		int res = 0;
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		num = ler.nextInt();
		System.out.print(num + "!=" + num);

		if(num > 1) {
			prox = num - 1;
			res = num * prox;
		
			for (int i = prox - 1 ; i >= 1 ; --i){
				res = res * i;
				System.out.print("x" + i);
			}
		} else if (num == 0){
			res = 1;
		} else if (num == 1){
			res = num * num;
		} else {
			System.out.print("Numero invalido!");
		}
		System.out.print("=" + res);
	}
}