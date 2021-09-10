package Herança;

public class preguiça extends Animal {
	   
	   private String nome;
	   private  int idade;
	   
	   public preguiça(String especie, String categoria,String nome,int idade) {
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
			System.out.println("Som qualquer");
		}
		
		public void Subir() {
			System.out.println("Sube na árvore");
		}
	   

		public void imprimir() {
			System.out.println("\nEspécie: "+getEspecie()+"\nCategoria: "+getCategoria()+"\nNome:"+nome+"\nIdade:"+idade);
		}
}
