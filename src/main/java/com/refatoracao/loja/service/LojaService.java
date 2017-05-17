package com.refatoracao.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refatoracao.loja.dao.LojaDao;
import com.refatoracao.loja.model.Loja;

@Service
public class LojaService {
	
	@Autowired
	private LojaDao lojaDao;
	
	public Loja obter(){
		return lojaDao.obter();
	}

}
