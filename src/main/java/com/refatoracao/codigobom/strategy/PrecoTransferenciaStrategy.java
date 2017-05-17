package com.refatoracao.codigobom.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refatoracao.custo.precotransferencia.service.PrecoTransferenciaService;
import com.refatoracao.loja.model.Loja;
import com.refatoracao.produto.model.Produto;

@Service
public class PrecoTransferenciaStrategy implements CustoTransferencia{

	@Autowired
	private PrecoTransferenciaService precoTransferenciaService;
	
	@Override
	public double getCusto(Loja loja, Produto produto) {
		
		return precoTransferenciaService.getCusto(loja, produto);
	}

}