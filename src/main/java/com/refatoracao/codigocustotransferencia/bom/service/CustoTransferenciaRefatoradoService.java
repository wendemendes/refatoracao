package com.refatoracao.codigocustotransferencia.bom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refatoracao.codigocustotransferencia.bom.factory.CustoTransferenciaFactory;
import com.refatoracao.codigocustotransferencia.bom.strategy.CustoTransferencia;
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
