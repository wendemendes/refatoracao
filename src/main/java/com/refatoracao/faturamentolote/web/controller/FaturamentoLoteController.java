package com.refatoracao.faturamentolote.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.refatoracao.faturamentolote.bom.enumeration.FinalidadeDistribuicaoEnum;
import com.refatoracao.faturamentolote.bom.enumeration.IndicadorPropriedadeEnum;
import com.refatoracao.faturamentolote.bom.service.FaturamentoLoteRefatoradoService;
import com.refatoracao.faturamentolote.ruim.service.FaturamentoLoteService;
import com.refatoracao.faturamentolote.web.form.FaturamentoLoteForm;
import com.refatoracao.faturamentolote.web.view.FaturamentoLoteView;

import notafiscal.model.NotaFiscal;

@Controller
public class FaturamentoLoteController {

	@Autowired
	private FaturamentoLoteRefatoradoService faturamentoLoteRefatoradoService;

	@Autowired
	private FaturamentoLoteService faturamentoLoteService;
	
	@ResponseBody
	@RequestMapping(value = "/gerar-nota-fiscal", method = RequestMethod.GET)
	public FaturamentoLoteView gerarNotaFiscal() {

		FaturamentoLoteForm faturamentoLoteForm = new FaturamentoLoteForm(IndicadorPropriedadeEnum.PROPRIEDADE_DA_LOJA_E_EM_POSSE_DE_TERCEIROS, FinalidadeDistribuicaoEnum.VENDA_A_CLIENTE);
		
		NotaFiscal notaFiscal = faturamentoLoteRefatoradoService.criarNotaFiscal(faturamentoLoteForm);

		return new FaturamentoLoteView(notaFiscal);

	}
	
	@ResponseBody
	@RequestMapping(value = "/gerar-nota-fiscal-legado", method = RequestMethod.GET)
	public FaturamentoLoteView gerarNotaFiscalLegado() {

		FaturamentoLoteForm faturamentoLoteForm = new FaturamentoLoteForm(IndicadorPropriedadeEnum.PROPRIEDADE_DA_LOJA_E_EM_POSSE_DE_TERCEIROS, FinalidadeDistribuicaoEnum.VENDA_A_CLIENTE);
		
		NotaFiscal notaFiscal = faturamentoLoteService.criarNotaFiscal(faturamentoLoteForm);

		return new FaturamentoLoteView(notaFiscal);

	}
	
	

}
