package br.unit.leand;

public abstract class Item {

	public String titulo;
	public Integer anoLacamento;
	public String comentario;

	public Item() {

	}

	public Item(String titulo, Integer anoLacamento, String comentario) {
		this.titulo = titulo;
		this.anoLacamento = anoLacamento;
		this.comentario = comentario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAnoLacamento() {
		return anoLacamento;
	}

	public void setAnoLacamento(Integer anoLacamento) {
		this.anoLacamento = anoLacamento;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public abstract void listaInformacoes();

}
