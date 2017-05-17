package com.refatoracao.custo.web.view;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LojaView {
	
	private Integer lojaKey;
	
	private String nomeRazao;
	
	private String custoUtilizado;

}
