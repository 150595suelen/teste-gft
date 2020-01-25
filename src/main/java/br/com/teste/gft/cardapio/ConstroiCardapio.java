package br.com.teste.gft.cardapio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.teste.gft.enuns.PeriodoEnum;
import br.com.teste.gft.enuns.TipoDePratoEnum;

@Component
public class ConstroiCardapio {

	public String constroiCardapio() {
		
		List<OpcoaoCardapio> opcoes = this.constroiOpcoes();
		List<TipoDePratoEnum> tiposDePratos = Arrays.asList(TipoDePratoEnum.values());
		List<PeriodoEnum> periodos = Arrays.asList(PeriodoEnum.values());
		
		String cabecalhoCardapio = this.cabecalhoCardapio(periodos);
		
		String corpoCardapio = this.constroiCorpoCardapio(tiposDePratos, opcoes, periodos);
		
		String cardapio = String.format("%s \n %s", cabecalhoCardapio, corpoCardapio);
		
		return cardapio;
	}

	private String constroiCorpoCardapio(List<TipoDePratoEnum> tiposDePratos, List<OpcoaoCardapio> opcoesCardapio, List<PeriodoEnum> periodos) {
		
		String corpo = "";
		
		for(TipoDePratoEnum tipodDePratoEnum : tiposDePratos) {
			
			corpo += String.format("%s %s |", tipodDePratoEnum.getTipo().toString(), tipodDePratoEnum.getDescricao());
			
			for(PeriodoEnum periodo : periodos) {
				
				for(OpcoaoCardapio opcoaoCardapio : opcoesCardapio) {
					
					if(periodo == opcoaoCardapio.getPeriodo() && tipodDePratoEnum == opcoaoCardapio.getTipoDePrato())
							corpo += String.format("%s |", opcoaoCardapio.getNome());
				}
			}
			
			corpo += "\n";
		}
		
		
		
		return String.format("%s", corpo);
	}

	private String cabecalhoCardapio(List<PeriodoEnum> periodos) {
		
		String periodo = "";
		
		for (PeriodoEnum periodoEnum : periodos) {
			periodo += String.format("%s | ", periodoEnum.getPeriodo());
		}
		
		return String.format("Tipos de Prato | %s", periodo);
	}

	public List<OpcoaoCardapio> constroiOpcoes() {
		
		List<OpcoaoCardapio> opcoes = new ArrayList<>();
		
		opcoes.add(OpcoaoCardapio.builder().nome("Ovo").tipoDePrato(TipoDePratoEnum.ENTRADA).periodo(PeriodoEnum.MANHA).build());
		opcoes.add(OpcoaoCardapio.builder().nome("Torrada").tipoDePrato(TipoDePratoEnum.LADO).periodo(PeriodoEnum.MANHA).build());
		opcoes.add(OpcoaoCardapio.builder().nome("Café").tipoDePrato(TipoDePratoEnum.BEBIDA).periodo(PeriodoEnum.MANHA).build());
		opcoes.add(OpcoaoCardapio.builder().nome("Não Contém").tipoDePrato(TipoDePratoEnum.SOBREMESA).periodo(PeriodoEnum.MANHA).build());
		
		opcoes.add(OpcoaoCardapio.builder().nome("Bife").tipoDePrato(TipoDePratoEnum.ENTRADA).periodo(PeriodoEnum.NOITE).build());
		opcoes.add(OpcoaoCardapio.builder().nome("Batata").tipoDePrato(TipoDePratoEnum.LADO).periodo(PeriodoEnum.NOITE).build());
		opcoes.add(OpcoaoCardapio.builder().nome("Vinho").tipoDePrato(TipoDePratoEnum.BEBIDA).periodo(PeriodoEnum.NOITE).build());
		opcoes.add(OpcoaoCardapio.builder().nome("Bolo").tipoDePrato(TipoDePratoEnum.SOBREMESA).periodo(PeriodoEnum.NOITE).build());
		
		return opcoes;
	}

}
