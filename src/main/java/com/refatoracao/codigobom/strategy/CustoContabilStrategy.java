package com.refatoracao.codigobom.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refatoracao.custo.custocontabil.service.CustoContabilService;
import com.refatoracao.loja.model.Loja;
import com.refatoracao.produto.model.Produto;

@Service
public class CustoContabilStrategy implements CustoTransferencia{

	@Autowired
	private CustoContabilService custoContabilService;
	
	@Override
	public double getCusto(Loja loja, Produto produto) {
		
		return custoContabilService.getCusto(loja, produto);
	}

}