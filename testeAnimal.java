package Herança;

import java.util.Scanner;

public abstract class testeAnimal {

	public static void main(String[] args) {
		
			cavalo cavalo = new cavalo("Equus Ferus","Mamifero","Aslan",20);
			cavalo.imprimir();
			cavalo.Corre();
			cavalo.EmitirSom();
			
			System.out.println("\n");
			cachorro cachorro = new cachorro("Canis Lupus","Mamifero","Luna",4);
			cachorro.imprimir();
			cachorro.Corre();
			cachorro.EmitirSom();
			
			System.out.println("\n");
			preguiça preguica = new preguiça("Choloepus didactylus","Mamifero","Gal", 9);
			preguica.imprimir();
			preguica.Subir();
			preguica.EmitirSom();
			
			System.out.println("\n\t\tMudando os nomes\t\t");
			
			Scanner leia = new Scanner(System.in);
			
			cavalo.setNome(leia.nextLine());
			System.out.println(cavalo.getNome());
			
			
		}

	}


