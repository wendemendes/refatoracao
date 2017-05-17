package com.refatoracao.codigobom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refatoracao.codigobom.factory.CustoTransferenciaFactory;
import com.refatoracao.codigobom.strategy.CustoTransferencia;
import com.refatoracao.loja.model.Loja;
import com.refatoracao.produto.model.Produto;

@Service
public class CustoTransferenciaRefatoradoService {

	@Autowired
	private CustoTransferenciaFactory custoTransferenciaFactory;

	public double getCustoTransferencia(Loja loja, Produto produto) {
		
		final CustoTransferencia strategyParaCusto = custoTransferenciaFactory
				.getStrategyParaCusto(loja.getCustoTransferenciaEnum().toString());
		
		return strategyParaCusto.getCusto(loja, produto);
	}

}
