package Herança;

public class cavalo extends Animal {

	private String nome;
	private int idade;

	public cavalo(String especie, String categoria, String nome, int idade) {
		super(especie, categoria);
		this.idade = idade;
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void EmitirSom() {
		System.out.println("Emite som:Relicho");
	}

	public void Corre() {
		System.out.println("Cavalo está :Correndo");
	}

	public void imprimir() {
		System.out.println("\nEspécie: " + getEspecie() + "\nCategoria: " + getCategoria() + "\nNome :" + nome
				+ "\nIdade :" + idade);
	}

}
