package com.refatoracao.codigocustotransferencia.bom.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refatoracao.custo.custocomercial.service.CustoComercialService;
import com.refatoracao.loja.model.Loja;
import com.refatoracao.produto.model.Produto;

@Service
public class CustoComercialStrategy implements CustoTransferencia{

	@Autowired
	private CustoComercialService custoComercialService;
	
	@Override
	public double getCusto(Loja loja, Produto produto) {
		
		return custoComercialService.getCusto(loja, produto);
	}

}
