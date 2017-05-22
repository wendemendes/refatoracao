package notafiscal.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class NotaFiscal {
	
	private int notaFiscalKey;
	
	private List<NotaFiscalItem> itens  = new ArrayList<>();
	
	private String notaFiscalCriadoPelaStrategia;
	

}
