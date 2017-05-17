package com.refatoracao.custo.custocomercial.service;

import org.springframework.stereotype.Service;

import com.refatoracao.loja.model.Loja;
import com.refatoracao.produto.model.Produto;

@Service
public class CustoComercialService {
	
	public double getCusto(Loja loja, Produto produto){
		
		//faz de conta que iria no banco de dados e pegasse o custo da loja deste determinado produto
		return 2.99;
	}

}
