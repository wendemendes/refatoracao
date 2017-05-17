package com.refatoracao.loja.model;

import com.refatoracao.loja.enumeration.CustoTransferenciaEnum;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class Loja {
	
	private int lojaKey;
	
    private String nomeRazao;
    
    private CustoTransferenciaEnum custoTransferenciaEnum;
	
	
}


