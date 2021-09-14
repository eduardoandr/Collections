package br.com.generation.collections;

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

public class Estoque {

	private String produtosX;
	private String produtosY;
	
	
	public String getProdutosX() {
		return produtosX;
	}
	public void setProdutosX(String produtosX) {
		this.produtosX = produtosX;
	}
	public String getProdutosY() {
		return produtosY;
	}
	public void setProdutosY(String produtosY) {
		this.produtosY = produtosY;
	}
	@Override
	public String toString() {
		return "Estoque [produtosX=" + produtosX + ", produtosY=" + produtosY + ", getProdutosX()=" + getProdutosX()
				+ ", getProdutosY()=" + getProdutosY() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
