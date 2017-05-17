package com.refatoracao.codigoprecoruim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refatoracao.custo.custocomercial.service.CustoComercialService;
import com.refatoracao.custo.custocontabil.service.CustoContabilService;
import com.refatoracao.custo.precotransferencia.service.PrecoTransferenciaService;
import com.refatoracao.custo.ultimacompra.service.UltimaCompraService;
import com.refatoracao.loja.enumeration.CustoTransferenciaEnum;
import com.refatoracao.loja.model.Loja;
import com.refatoracao.produto.model.Produto;



@Service
public class CustoTransferenciaService {
	
	@Autowired
	private PrecoTransferenciaService precoTransferenciaService;
	
	@Autowired
	private UltimaCompraService ultimaCompraService;
	
	@Autowired
	private CustoContabilService custoContabilService;
	
	@Autowired
	private CustoComercialService custoComercialService;
	
	public double getCustoTransferencia(Loja loja, Produto produto){
		
		
		if(loja.getCustoTransferenciaEnum().equals(CustoTransferenciaEnum.CUSTO_CONTABIL)){
			return custoContabilService.getCusto(loja, produto);
		}else if(loja.getCustoTransferenciaEnum().equals(CustoTransferenciaEnum.CUSTO_COMERCIAL)){
			return custoComercialService.getCusto(loja, produto);
		}else if(loja.getCustoTransferenciaEnum().equals(CustoTransferenciaEnum.PRECO_TRANSFERENCIA)){
			return precoTransferenciaService.getCusto(loja, produto);
		}else{
			return ultimaCompraService.getCusto(loja, produto);	
		}
	}

}
