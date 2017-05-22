package com.refatoracao.faturamentolote.bom.strategy;

import com.refatoracao.faturamentolote.bom.parametro.GeradorNotaFiscalPeloFaturamentoLoteParametro;

import notafiscal.model.NotaFiscal;

public interface GeradorNotaFiscalPeloFaturamentoLote {
	
	 NotaFiscal criarNotaFiscal(GeradorNotaFiscalPeloFaturamentoLoteParametro parametro);

}
