package br.com.teste.gft.cardapio;

import java.util.List;

import br.com.teste.gft.enuns.PeriodoEnum;
import br.com.teste.gft.enuns.TipoDePratoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cardapio {
	
	private List<OpcoaoCardapio> opcoes;
	
	private List<TipoDePratoEnum> tipos;
	
	private List<PeriodoEnum> periodos;
}
