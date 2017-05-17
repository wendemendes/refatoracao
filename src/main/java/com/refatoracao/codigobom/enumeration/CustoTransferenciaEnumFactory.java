package com.refatoracao.codigobom.enumeration;

import com.refatoracao.codigobom.strategy.CustoComercialStrategy;
import com.refatoracao.codigobom.strategy.CustoContabilStrategy;
import com.refatoracao.codigobom.strategy.CustoTransferencia;
import com.refatoracao.codigobom.strategy.PrecoTransferenciaStrategy;
import com.refatoracao.codigobom.strategy.UltimaEntradaStrategy;
import java.util.stream.Stream;

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
