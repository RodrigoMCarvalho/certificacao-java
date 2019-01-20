
//país A = 80.000 habitantes com taxa anual de 3%
//pais B = 200.000 habitantes com txa anual de 1.5%

class Teste10 {
	public static void main (String[] args){

		int A = 80000;
		int B = 200000;
		int totalAnos = 0;

		while (A < B){
			A += (A / 100) * 3;
			B += (B / 100) * 1.5;
			totalAnos++;
		}
		System.out.println("Populacao de A depois de " + totalAnos +" anos: " + A);
		System.out.println("Populacao de B depois de " + totalAnos + " anos: "  + B);
	}
}