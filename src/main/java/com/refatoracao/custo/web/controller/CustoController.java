package com.refatoracao.custo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.refatoracao.codigocustotransferencia.bom.service.CustoTransferenciaRefatoradoService;
import com.refatoracao.codigocustotransferencia.ruim.service.CustoTransferenciaService;
import com.refatoracao.custo.web.view.CustoView;
import com.refatoracao.loja.model.Loja;
import com.refatoracao.loja.service.LojaService;
import com.refatoracao.produto.model.Produto;
import com.refatoracao.produto.model.ProdutoFactory;

@Controller
public class CustoController {
	
	@Autowired
	private CustoTransferenciaService custoTransferenciaService;  

	@Autowired
	private LojaService lojaService;
	
	@Autowired
	private CustoTransferenciaRefatoradoService custoTransferenciaRefatoradoService;  
	
	@ResponseBody
	@RequestMapping(value="/obter-custo",method = RequestMethod.GET)
    public CustoView obterCusto(){
        
		Produto produto = ProdutoFactory.criar(1222, "Cerveja");
		Loja loja = lojaService.obter();
		double custo = custoTransferenciaService.getCustoTransferencia(loja, produto);
		
		return new CustoView(custo, loja, produto);
	
	}
	
	@ResponseBody
	@RequestMapping(value="/obter-custo-refatorado",method = RequestMethod.GET)
    public CustoView obterCustoRefatorado(){
        
		Produto produto = ProdutoFactory.criar(1222, "Cerveja");
		Loja loja = lojaService.obter();
		double custo = custoTransferenciaRefatoradoService.getCustoTransferencia(loja, produto);
		
		return new CustoView(custo, loja, produto);
	
	}
	
	

}