package com.refatoracao.faturamentolote.bom.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refatoracao.faturamentolote.bom.enumeration.GeradorNotaFiscalPeloFaturamentoLoteEnum;
import com.refatoracao.faturamentolote.bom.parametro.GeradorNotaFiscalPeloFaturamentoLoteParametro;
import com.refatoracao.faturamentolote.bom.strategy.GeradorNotaFiscalPeloFaturamentoLote;
import com.refatoracao.faturamentolote.web.form.FaturamentoLoteForm;

import notafiscal.model.NotaFiscal;

@Service
public class FaturamentoLoteRefatoradoService {

	@Autowired
	private BeanFactory beanFactory;

	public NotaFiscal criarNotaFiscal(FaturamentoLoteForm faturamentoLoteForm) {
		
		GeradorNotaFiscalPeloFaturamentoLoteParametro parametro = new GeradorNotaFiscalPeloFaturamentoLoteParametro.Builder()
				.doIndicadorPropriedade(faturamentoLoteForm.getIndicadorPropriedadeEnum())
				.paraFinalidadeDistribuicao(faturamentoLoteForm.getFinalidadeDistribuicaoEnum())
				.build();

		GeradorNotaFiscalPeloFaturamentoLote strategy = beanFactory
				.getBean(GeradorNotaFiscalPeloFaturamentoLoteEnum.meDaStrategia(parametro).getClasseCriadora());

		return strategy.criarNotaFiscal(parametro);
	}

}
