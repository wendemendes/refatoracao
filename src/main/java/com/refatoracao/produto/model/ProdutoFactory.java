package com.refatoracao.produto.model;

public class ProdutoFactory {
	
	public static Produto criar(int produtoKey, String descricao){
		
		return new Produto.ProdutoBuilder()
				.descricao(descricao)
				.produtoKey(produtoKey)
				.build();
	}

}
