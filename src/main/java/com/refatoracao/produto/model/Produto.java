package com.refatoracao.produto.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Produto {
	
	private int produtoKey;
	
	private String descricao;

}
