package br.com.teste.gft.enuns;

public enum TipoDePratoEnum {

	ENTRADA(1L, "Entrada"), LADO(2L, "Lado"), BEBIDA(3L, "Bebida"), SOBREMESA(4L, "Sobremesa");

	private Long tipo;
	private String descricao;

	private TipoDePratoEnum(Long tipo, String descricao) {
		this.tipo = tipo;
		this.descricao = descricao;
	}

	public Long getTipo() {
		return this.tipo;
	}

	public String getDescricao() {
		return this.descricao;
	}
}
