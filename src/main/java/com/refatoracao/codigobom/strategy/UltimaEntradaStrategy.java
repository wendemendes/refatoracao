package com.refatoracao.codigobom.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refatoracao.custo.ultimacompra.service.UltimaCompraService;
import com.refatoracao.loja.model.Loja;
import com.refatoracao.produto.model.Produto;

@Service
public class UltimaEntradaStrategy implements CustoTransferencia{

	@Autowired
	private UltimaCompraService ultimaCompraService;
	
	@Override
	public double getCusto(Loja loja, Produto produto) {
		
		return ultimaCompraService.getCusto(loja, produto);
	}

}
