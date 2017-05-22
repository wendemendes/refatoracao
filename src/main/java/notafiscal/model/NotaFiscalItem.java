package notafiscal.model;

import com.refatoracao.produto.model.Produto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class NotaFiscalItem {
	
	private int notaFiscalItemKey;
	
	private Produto produto;

}
