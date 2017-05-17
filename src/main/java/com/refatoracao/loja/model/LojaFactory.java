package com.refatoracao.loja.model;

import com.refatoracao.loja.enumeration.CustoTransferenciaEnum;


public class LojaFactory {
	
	public static Loja criar(String nomeLoja, int lojaKey, CustoTransferenciaEnum custoTransferenciaEnum){
	
		return new Loja.LojaBuilder()
				.nomeRazao(nomeLoja)
				.lojaKey(lojaKey)
				.custoTransferenciaEnum(custoTransferenciaEnum)
				.build();
	}

}
