package com.refatoracao.faturamentolote.bom.strategy;

import org.springframework.stereotype.Service;

import com.refatoracao.faturamentolote.bom.parametro.GeradorNotaFiscalPeloFaturamentoLoteParametro;

import notafiscal.model.NotaFiscal;
import notafiscal.model.NotaFiscalFactory;

@Service
public class GeradorNotaFiscalPeloFaturamentoLoteParaVendaCliente implements GeradorNotaFiscalPeloFaturamentoLote{

	@Override
	public NotaFiscal criarNotaFiscal(GeradorNotaFiscalPeloFaturamentoLoteParametro parametro) {
		return NotaFiscalFactory.criarNotaFiscal(this.toString());
	}

}
