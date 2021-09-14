package br.com.generation.collections;

import java.util.Arraylist;
import java.util.Scanner;

import br.com.generation.collections;

public class TestaEstoque {

	
		
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			ArrayList<Estoque> produtos = new ArrayList<>();
			
			System.out.println("Quantos produtos quer Add:");
			int numeroProdutos = sc.nextInt();
			
			for(int i = 0; i < numeroProdutos; i++) {
				System.out.println("Nome do produto:");
				String nome = sc.nextLine();
				sc.nextLine();
				
				System.out.println("Valor do produto:");
				int valor = sc.nextInt();
				
				produtos.add(new Estoque(nome, valor));
			}
			for(Estoque i: produtos) {
				System.out.println(i);
			}
			sc.close();
		}
	}


	}

}
