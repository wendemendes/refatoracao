package com.refatoracao.faturamentolote.ruim.service;

import org.springframework.stereotype.Service;

import com.refatoracao.faturamentolote.bom.enumeration.FinalidadeDistribuicaoEnum;
import com.refatoracao.faturamentolote.bom.enumeration.IndicadorPropriedadeEnum;
import com.refatoracao.faturamentolote.web.form.FaturamentoLoteForm;

import notafiscal.model.NotaFiscal;
import notafiscal.model.NotaFiscalFactory;

@Service
public class FaturamentoLoteService {

	public NotaFiscal criarNotaFiscal(FaturamentoLoteForm faturamentoLoteForm ) {
		
		if (faturamentoLoteForm.getFinalidadeDistribuicaoEnum().equals(FinalidadeDistribuicaoEnum.ENVIAR_PARA_UMA_LOJA)
				&& faturamentoLoteForm.getIndicadorPropriedadeEnum().equals(IndicadorPropriedadeEnum.PROPRIEDADE_DA_LOJA_E_EM_SEU_PODER)) {

			/// toda logisca para criar 
			return NotaFiscalFactory.criarNotaFiscal("pelo if de ENVIAR_PARA_UMA_LOJA e PROPRIEDADE_DA_LOJA_E_EM_SEU_PODER");
			
		}else if (faturamentoLoteForm.getFinalidadeDistribuicaoEnum().equals(FinalidadeDistribuicaoEnum.VENDA_A_CLIENTE)){
			/// toda logisca para criar 
			return NotaFiscalFactory.criarNotaFiscal("pelo if de VENDA_A_CLIENTE");
		}else{
			return NotaFiscalFactory.criarNotaFiscal("pelo if de operador logistico");
		}
	}

}
