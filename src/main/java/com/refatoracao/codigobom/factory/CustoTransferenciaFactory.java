package com.refatoracao.codigobom.factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refatoracao.codigobom.enumeration.CustoTransferenciaEnumFactory;
import com.refatoracao.codigobom.strategy.CustoTransferencia;

@Service
public class CustoTransferenciaFactory {

	@Autowired
	private BeanFactory beanFactory;

	public CustoTransferencia getStrategyParaCusto(String estrategiaInformada) {

		return beanFactory
				.getBean(CustoTransferenciaEnumFactory.meDaEstrategiaPara(estrategiaInformada).getClasseCriadora());

	}

}
