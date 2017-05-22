package com.refatoracao.faturamentolote.web.form;

import com.refatoracao.faturamentolote.bom.enumeration.FinalidadeDistribuicaoEnum;
import com.refatoracao.faturamentolote.bom.enumeration.IndicadorPropriedadeEnum;

import lombok.Getter;


@Getter
public class FaturamentoLoteForm {
	
	private IndicadorPropriedadeEnum indicadorPropriedadeEnum;
	
	private FinalidadeDistribuicaoEnum finalidadeDistribuicaoEnum;
	
	public FaturamentoLoteForm(IndicadorPropriedadeEnum indicadorPropriedadeEnum, FinalidadeDistribuicaoEnum finalidadeDistribuicaoEnum){
		this.indicadorPropriedadeEnum = indicadorPropriedadeEnum;
		this.finalidadeDistribuicaoEnum = finalidadeDistribuicaoEnum;
	}

}
