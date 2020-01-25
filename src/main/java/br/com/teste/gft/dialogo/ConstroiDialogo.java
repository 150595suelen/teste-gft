package br.com.teste.gft.dialogo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.teste.gft.cardapio.OpcoaoCardapio;
import br.com.teste.gft.enuns.PeriodoEnum;
import br.com.teste.gft.enuns.TipoDePratoEnum;

@Component
public class ConstroiDialogo {
	
	public PeriodoEnum verificaPeriodoSelecionado(String periodoSelecionado) throws Exception {
		return PeriodoEnum.getPeriodoByDescricao(periodoSelecionado);
	}

	public List<OpcoaoCardapio> verificaOpcoesSelecionadas(List<OpcoaoCardapio> opcoesCardapio,
			String opcoesSelecionadas, PeriodoEnum periodo) throws Exception {

		List<OpcoaoCardapio> opcoaoCardapios = new ArrayList<>();

		for (String selecionado : Arrays.asList(opcoesSelecionadas.split(","))) {
			Long opcaoSelecionada = Long.parseLong(selecionado);

			Optional<OpcoaoCardapio> item = opcoesCardapio.stream()
					.filter(a -> a.getTipoDePrato().getTipo().equals(opcaoSelecionada) && a.getPeriodo() == periodo).findFirst();

			if (item.isPresent()) {
				opcoaoCardapios.add(item.get());
			} else {

				throw new Exception("Item não encontrado");
			}
		}

		return opcoaoCardapios;
	}

	public void verificaItensDuplicados(List<OpcoaoCardapio> itensSelecionados, PeriodoEnum periodoSelecionado) throws Exception {
		
		List<OpcoaoCardapio> opcoesDuplicadas = new ArrayList<>();
		
		for (OpcoaoCardapio opcoaoCardapio : itensSelecionados) {
			
			
			if(periodoSelecionado == PeriodoEnum.MANHA) {
				
				if(opcoesDuplicadas.contains(opcoaoCardapio) && opcoaoCardapio.getTipoDePrato() != TipoDePratoEnum.BEBIDA)
					throw new Exception("Item não pode ser duplicado");
			} 
			
			else if(periodoSelecionado == PeriodoEnum.NOITE) {
				
				if(opcoesDuplicadas.contains(opcoaoCardapio) && opcoaoCardapio.getTipoDePrato() != TipoDePratoEnum.LADO)
					throw new Exception("Item não pode ser duplicado");
			}
			
			opcoesDuplicadas.add(opcoaoCardapio);
		}
	}

	public void verificaItemNaoAplicavel(List<OpcoaoCardapio> itensSelecionados, PeriodoEnum periodo) throws Exception {
		
		if(periodo == PeriodoEnum.MANHA) {
			
			Optional<OpcoaoCardapio> itemNaoAplicavel = itensSelecionados.stream().filter(item -> item.getTipoDePrato() == TipoDePratoEnum.SOBREMESA).findFirst();
		
			if(itemNaoAplicavel.isPresent())
				throw new Exception("Item não aplicavel");
		}
	}
}
