package Heran�a;

public class pregui�a extends Animal {
	   
	   private String nome;
	   private  int idade;
	   
	   public pregui�a(String especie, String categoria,String nome,int idade) {
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
			System.out.println("Sube na �rvore");
		}
	   

		public void imprimir() {
			System.out.println("\nEsp�cie: "+getEspecie()+"\nCategoria: "+getCategoria()+"\nNome:"+nome+"\nIdade:"+idade);
		}
}
