package notafiscal.model;

import java.util.Arrays;

import com.refatoracao.produto.model.ProdutoFactory;

public class NotaFiscalFactory {
	
	public static NotaFiscal criarNotaFiscal(String notaFiscalCriadoPelaStrategia){
		
		NotaFiscalItem item = new NotaFiscalItem.NotaFiscalItemBuilder()
		.produto(ProdutoFactory.criar(123, "Cerveja"))
		.build();
		
		return new NotaFiscal.NotaFiscalBuilder()
		.notaFiscalCriadoPelaStrategia(notaFiscalCriadoPelaStrategia)
		.itens(Arrays.asList(item))
		.build();
	}

}
