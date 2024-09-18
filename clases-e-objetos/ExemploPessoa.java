class Pessoa {
	
	//atributos 
	private String nome; 
	private int idade; 
	
	public Pessoa(String nome, int idade){
		this.nome = nome; 
		this.idade = idade; 
	}
	
	public String getNome() {
		return nome; 
	}
	
	public int getIdade() {
		return idade; 
	}
	
	public void setNome(String nome) {
		this.nome = nome; 
	}
	public void setIdade(int idade) {
		this.idade = idade; 
	}
}

public class ExemploPessoa {
	
	public static void main (String [] args) {
		Pessoa p1 = new Pessoa ("Simeone" , 21);
		 System.out.println("Nome: " + p1.getNome());
	     System.out.println("Idade: " + p1.getIdade());
        
		 p1.setNome("Jhonson");
		 System.out.println("Nome: " + p1.getNome()); 

		 Pessoa p2 = new Pessoa( "Ivana", 20); 
		 System.out.println("Nome: " + p2.getNome());
		 System.out.println("Idade: " + p2.getIdade());

		 Pessoa p3 = new Pessoa( "João", 19); 
		 System.out.println("Nome: " + p3.getNome());
		 System.out.println("Idade: " + p3.getIdade());

		 Pessoa p4 = new Pessoa( "Herbete", 22); 
		 System.out.println("Nome: " + p4.getNome());
		 System.out.println("Idade: " + p4.getIdade());

		 Pessoa p5 = new Pessoa( "Maria", 65); 
		 System.out.println("Nome: " + p5.getNome());
		 System.out.println("Idade: " + p5.getIdade());
		 
	}

}
