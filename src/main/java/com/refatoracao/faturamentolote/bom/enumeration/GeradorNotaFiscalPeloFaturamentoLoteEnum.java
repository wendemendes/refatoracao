package com.refatoracao.faturamentolote.bom.enumeration;

import com.refatoracao.faturamentolote.bom.parametro.GeradorNotaFiscalPeloFaturamentoLoteParametro;
import com.refatoracao.faturamentolote.bom.strategy.GeradorNotaFiscalPeloFaturamentoLote;
import com.refatoracao.faturamentolote.bom.strategy.GeradorNotaFiscalPeloFaturamentoLoteParaCd;
import com.refatoracao.faturamentolote.bom.strategy.GeradorNotaFiscalPeloFaturamentoLoteParaOperadorLogistico;
import com.refatoracao.faturamentolote.bom.strategy.GeradorNotaFiscalPeloFaturamentoLoteParaVendaCliente;
import java.util.stream.Stream;

public enum GeradorNotaFiscalPeloFaturamentoLoteEnum {

	CRIADOR_NOTA_CD(GeradorNotaFiscalPeloFaturamentoLoteParaCd.class) {
		@Override
		boolean ehEstaEstrategia(GeradorNotaFiscalPeloFaturamentoLoteParametro parametro) {
			return parametro.deveCriarNotaParaCd();

		}
	},
	CRIADOR_NOTA_VENDA_CLIENTE(GeradorNotaFiscalPeloFaturamentoLoteParaVendaCliente.class) {
		@Override
		boolean ehEstaEstrategia(GeradorNotaFiscalPeloFaturamentoLoteParametro parametro) {
			return parametro.deveCriarNotaFiscalParaVendaCliente();
		}
	},
	CRIADOR_NOTA_OPERADOR_LOGISTICO(GeradorNotaFiscalPeloFaturamentoLoteParaOperadorLogistico.class) {
		@Override
		boolean ehEstaEstrategia(GeradorNotaFiscalPeloFaturamentoLoteParametro parametro) {
			return parametro.deveCriarNotaFiscalParaOperadorLogistico();
		}
	};

	private final Class<? extends GeradorNotaFiscalPeloFaturamentoLote> classeCriadora;

	GeradorNotaFiscalPeloFaturamentoLoteEnum(Class<? extends GeradorNotaFiscalPeloFaturamentoLote> classeCriadora) {
		this.classeCriadora = classeCriadora;
	}

	public static GeradorNotaFiscalPeloFaturamentoLoteEnum meDaStrategia(
			GeradorNotaFiscalPeloFaturamentoLoteParametro parametro) {
		return Stream.of(GeradorNotaFiscalPeloFaturamentoLoteEnum.values())
				.filter(strategy -> strategy.ehEstaEstrategia(parametro)).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Strategia de criador de nota fiscal desconhecido."));
	}

	public Class<? extends GeradorNotaFiscalPeloFaturamentoLote> getClasseCriadora() {
		return classeCriadora;
	}

	abstract boolean ehEstaEstrategia(GeradorNotaFiscalPeloFaturamentoLoteParametro parametro);

}
