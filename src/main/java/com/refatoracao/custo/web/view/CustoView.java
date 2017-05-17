package com.refatoracao.custo.web.view;

import com.refatoracao.loja.model.Loja;
import com.refatoracao.produto.model.Produto;

import lombok.Getter;

public class CustoView {

	@Getter
	private Double custo;
	
	@Getter
	private LojaView loja;
	
	@Getter
	private ProdutoView produto;
	
	public CustoView(double custo, Loja loja, Produto produto) {
		this.custo = custo;
		
		this.produto =  new ProdutoView.ProdutoViewBuilder()
		.descricao(produto.getDescricao())
		.produtoKey(produto.getProdutoKey())
		.build();
		
		
		this.loja = new LojaView.LojaViewBuilder()
		.nomeRazao(loja.getNomeRazao())
		.lojaKey(loja.getLojaKey())
		.custoUtilizado(loja.getCustoTransferenciaEnum().toString())
		.build();
	}
}
