package br.com.teste.gft.cardapio;

import br.com.teste.gft.enuns.PeriodoEnum;
import br.com.teste.gft.enuns.TipoDePratoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OpcoaoCardapio {
	
	private String nome;
	
	private TipoDePratoEnum tipoDePrato;
	
	private PeriodoEnum periodo;
}
