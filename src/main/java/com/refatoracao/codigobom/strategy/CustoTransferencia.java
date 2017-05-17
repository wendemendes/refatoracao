package com.refatoracao.codigobom.strategy;

import com.refatoracao.loja.model.Loja;
import com.refatoracao.produto.model.Produto;

public interface CustoTransferencia {
	
	double getCusto(Loja loja, Produto produto);
}
