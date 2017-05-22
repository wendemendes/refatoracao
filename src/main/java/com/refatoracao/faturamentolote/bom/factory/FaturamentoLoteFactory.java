package com.refatoracao.faturamentolote.bom.factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refatoracao.codigocustotransferencia.bom.enumeration.CustoTransferenciaEnumFactory;
import com.refatoracao.codigocustotransferencia.bom.strategy.CustoTransferencia;

@Service
public class FaturamentoLoteFactory {
	
	@Autowired
	private BeanFactory beanFactory;

	public CustoTransferencia getStrategyParaCusto(String estrategiaInformada) {

		return beanFactory
				.getBean(CustoTransferenciaEnumFactory.meDaEstrategiaPara(estrategiaInformada).getClasseCriadora());

	}

	

}
