package br.com.teste.gft.dialogo;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.teste.gft.cardapio.ConstroiCardapio;
import br.com.teste.gft.cardapio.OpcoaoCardapio;
import br.com.teste.gft.enuns.PeriodoEnum;
import br.com.teste.gft.util.StringUtils;

@Component
public class Dialogo {

	public static final Scanner SCANNER = new Scanner(System.in);

	public static final String NAO_APLICAVEL = "Não Aplicavel";

	@Autowired
	private ConstroiDialogo constroiDialogo;

	@Autowired
	private ConstroiCardapio constroiCardapio;

	public void iniciaDialogo() {

		try {

			System.out.println(this.constroiCardapio.constroiCardapio());

			System.out.println("Informe: Manhã ou Noite");

			String periodoSelecionado = SCANNER.nextLine();

			if (periodoSelecionado == null)
				throw new Exception(Dialogo.NAO_APLICAVEL);

			periodoSelecionado = StringUtils.removeCaracteresEspeciais(periodoSelecionado.toLowerCase());

			PeriodoEnum periodo = this.constroiDialogo
					.verificaPeriodoSelecionado(periodoSelecionado);

			System.out.println(
					"Informe os numeros dos tipos de prato (1,2,3), Sendo que café para manhã e batata para noite é a vontade...");

			String opcoesSelecionadas = SCANNER.nextLine();

			List<OpcoaoCardapio> itensSelecionados = this.constroiDialogo.verificaOpcoesSelecionadas(this.constroiCardapio.constroiOpcoes(), opcoesSelecionadas, periodo);
			
			this.constroiDialogo.verificaItensDuplicados(itensSelecionados, periodo);
			
			this.constroiDialogo.verificaItemNaoAplicavel(itensSelecionados, periodo);
			
			String pedido = "";
			
			pedido += String.format("%s, ", periodo.getPeriodo());
			
			for(OpcoaoCardapio item : itensSelecionados) {
				pedido += String.format("%s: %s, ", item.getTipoDePrato().getDescricao(), item.getNome());
			}
			
			System.out.println(pedido);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
