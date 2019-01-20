class Motor{

}

class Carro{
	int ano;
	char primeiraLetra;
	Motor motor;
}

class Teste6{

	public static void main(String[] args){

	Carro carro = new Carro();
	System.out.println(carro.ano);
	System.out.println(carro.primeiraLetra == 0);
	System.out.println(carro.motor);
	}		
}