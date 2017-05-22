package com.refatoracao.codigocustotransferencia.bom.enumeration;

import java.util.stream.Stream;

import com.refatoracao.codigocustotransferencia.bom.strategy.CustoComercialStrategy;
import com.refatoracao.codigocustotransferencia.bom.strategy.CustoContabilStrategy;
import com.refatoracao.codigocustotransferencia.bom.strategy.CustoTransferencia;
import com.refatoracao.codigocustotransferencia.bom.strategy.PrecoTransferenciaStrategy;
import com.refatoracao.codigocustotransferencia.bom.strategy.UltimaEntradaStrategy;

public enum CustoTransferenciaEnumFactory {
	
	CUSTO_COMERCIAL(CustoComercialStrategy.class),
	CUSTO_CONTABIL(CustoContabilStrategy.class),
	PRECO_TRANSFERENCIA(PrecoTransferenciaStrategy.class),
	ULTIMA_COMPRA(UltimaEntradaStrategy.class);
	
	CustoTransferenciaEnumFactory(Class<? extends CustoTransferencia> classeCriadora) {
        this.classeCriadora = classeCriadora;
    }
	
	private final Class<? extends CustoTransferencia> classeCriadora;
	
	public static CustoTransferenciaEnumFactory meDaEstrategiaPara(String estrategiaInformada) {
        return Stream.of(CustoTransferenciaEnumFactory.values())
            .filter(strategy -> estrategiaInformada.equals(strategy.toString()))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Strategia de obter custo desconhecida."));
    }
	
	 public Class<? extends CustoTransferencia> getClasseCriadora() {
	        return classeCriadora;
	 }

}
