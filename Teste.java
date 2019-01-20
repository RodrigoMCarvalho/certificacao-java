public class Teste{

	String nome;

	public Teste(String nome){
		//this.nome = nome;
		System.out.println(nome);
	}

	public void m1(){
	
		for(int i=0 , j=0; i<=10 ;i++) {
			j++;
			System.out.println(i);
			System.out.println(j);
		}
		
	}
	public static void main (String[] args){

		Teste t1 = new Teste("Rodrigo");
		
	}
}