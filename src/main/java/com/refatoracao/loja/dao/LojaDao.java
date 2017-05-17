package com.refatoracao.loja.dao;

import org.springframework.stereotype.Repository;

import com.refatoracao.loja.enumeration.CustoTransferenciaEnum;
import com.refatoracao.loja.model.Loja;
import com.refatoracao.loja.model.LojaFactory;

@Repository
public class LojaDao {
	
	public Loja obter(){
		return LojaFactory
				.criar("Loja 4", 4, CustoTransferenciaEnum.ULTIMA_COMPRA);
	}

}
