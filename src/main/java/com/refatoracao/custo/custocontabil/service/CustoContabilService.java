package com.refatoracao.custo.custocontabil.service;

import org.springframework.stereotype.Service;

import com.refatoracao.loja.model.Loja;
import com.refatoracao.produto.model.Produto;

@Service
public class CustoContabilService {
	
	public double getCusto(Loja loja, Produto produto){
		
		//faz de conta que iria no banco de dados e pegasse o custo da loja deste determinado produto
		return 4.99;
	}

}
