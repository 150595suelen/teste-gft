package br.com.teste.gft.enuns;

import java.util.Arrays;

public enum PeriodoEnum {
	MANHA("Manhã", "manha"), NOITE("Noite", "noite");

	private String periodo;
	private String descricao;
	
	private PeriodoEnum(String periodo, String descricao) {
		this.periodo = periodo;
		this.descricao = descricao;
	}

	public String getPeriodo() {
		return this.periodo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	
	public static PeriodoEnum getPeriodoByDescricao(String descricao) throws Exception {
		PeriodoEnum periodoEnum = null;
		
		for(PeriodoEnum periodo : Arrays.asList(PeriodoEnum.values())) {
			
			if(periodo.getDescricao().equals(descricao))
				periodoEnum = periodo;
		}
		
		if(periodoEnum == null)
			throw new Exception(String.format("Periodo: %s, n�o aplicavel", descricao));
		
		return periodoEnum;
	}
}
