import java.util.Scanner;

// 5! = 5x4x3x2x1=120

class Fatorial2 {

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
		int res = 1;
		for (int i = num ; i >= 1 ; i-- ){
			res *= i;
			//System.out.print("x" + i);
			//OBS: para usar "5x4x3x2x1" deverá fazer num - (num -1)
		}
		return res;
	}
}