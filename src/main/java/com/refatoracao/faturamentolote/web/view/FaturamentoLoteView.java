package com.refatoracao.faturamentolote.web.view;

import lombok.Getter;
import notafiscal.model.NotaFiscal;


public class FaturamentoLoteView {
	
	@Getter
	private NotaFiscalView notaFiscalView;

	public FaturamentoLoteView(NotaFiscal notaFiscal) {

		this.notaFiscalView = new NotaFiscalView.NotaFiscalViewBuilder()
				.notaFiscalCriadoPelaStrategia(notaFiscal.getNotaFiscalCriadoPelaStrategia()).build();
	}
}
