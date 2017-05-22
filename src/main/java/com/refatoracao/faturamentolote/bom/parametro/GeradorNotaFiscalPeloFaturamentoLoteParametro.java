package com.refatoracao.faturamentolote.bom.parametro;

import com.refatoracao.faturamentolote.bom.enumeration.FinalidadeDistribuicaoEnum;
import com.refatoracao.faturamentolote.bom.enumeration.IndicadorPropriedadeEnum;

public class GeradorNotaFiscalPeloFaturamentoLoteParametro {

	private int cdKey;
	private int destinatarioKey;
	private IndicadorPropriedadeEnum indicadorPropriedadeEnum;
	private FinalidadeDistribuicaoEnum finalidadeDistribuicaoEnum;

	private GeradorNotaFiscalPeloFaturamentoLoteParametro(Builder builder) {

		this.cdKey = builder.getCdKey();
		this.destinatarioKey = builder.getDestinatarioKey();
		this.indicadorPropriedadeEnum = builder.getIndicadorPropriedadeEnum();
		this.finalidadeDistribuicaoEnum = builder.getFinalidadeDistribuicaoEnum();
	}

	public FinalidadeDistribuicaoEnum getFinalidadeDistribuicaoEnum() {
		return finalidadeDistribuicaoEnum;
	}

	public int getCdKey() {
		return cdKey;
	}

	public int getDestinatarioKey() {
		return destinatarioKey;
	}

	public IndicadorPropriedadeEnum getIndicadorPropriedadeEnum() {
		return indicadorPropriedadeEnum;
	}

	public static class Builder {

		private int cdKey;
		private int destinatarioKey;
		private IndicadorPropriedadeEnum indicadorPropriedadeEnum;
		private FinalidadeDistribuicaoEnum finalidadeDistribuicaoEnum;

		public Builder() {
		}

		public Builder doCdKey(int cdKey) {
			this.cdKey = cdKey;
			return this;
		}

		public Builder paraDestinatarioKey(int destinatarioKey) {
			this.destinatarioKey = destinatarioKey;
			return this;
		}

		public Builder doIndicadorPropriedade(IndicadorPropriedadeEnum indicadorPropriedade) {
			this.indicadorPropriedadeEnum = indicadorPropriedade;
			return this;
		}

		public Builder paraFinalidadeDistribuicao(FinalidadeDistribuicaoEnum finalidadeDistribuicao) {
			this.finalidadeDistribuicaoEnum = finalidadeDistribuicao;
			return this;
		}

		public int getCdKey() {
			return cdKey;
		}

		public int getDestinatarioKey() {
			return destinatarioKey;
		}

		public IndicadorPropriedadeEnum getIndicadorPropriedadeEnum() {
			return indicadorPropriedadeEnum;
		}

		public FinalidadeDistribuicaoEnum getFinalidadeDistribuicaoEnum() {
			return finalidadeDistribuicaoEnum;
		}

		public GeradorNotaFiscalPeloFaturamentoLoteParametro build() {

			return new GeradorNotaFiscalPeloFaturamentoLoteParametro(this);
		}
	}
	
	public boolean deveCriarNotaParaCd(){
		return getFinalidadeDistribuicaoEnum().equals(FinalidadeDistribuicaoEnum.ENVIAR_PARA_UMA_LOJA)

				&& getIndicadorPropriedadeEnum()
						.equals(IndicadorPropriedadeEnum.PROPRIEDADE_DA_LOJA_E_EM_SEU_PODER);

	}
	
	public boolean deveCriarNotaFiscalParaVendaCliente(){
		return getFinalidadeDistribuicaoEnum().equals(FinalidadeDistribuicaoEnum.VENDA_A_CLIENTE);
	}
	
	public boolean deveCriarNotaFiscalParaOperadorLogistico(){
		return !deveCriarNotaParaCd() && !deveCriarNotaFiscalParaVendaCliente();
	}


}
