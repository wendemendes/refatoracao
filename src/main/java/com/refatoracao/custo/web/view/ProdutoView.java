package com.refatoracao.custo.web.view;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProdutoView {
	
	private Integer produtoKey;
	
	private String descricao;

}
