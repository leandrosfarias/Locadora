package br.unit.leand;

public class Disco extends Item {

	private String artista;
	private Integer qtdFaixas;
	private String midia;

	public Disco() {

	}

	public Disco(String titulo, Integer anoLacamento, String comentario, String artista, Integer qtdFaixas,
			String midia) {
		super(titulo, anoLacamento, comentario);
		this.artista = artista;
		this.qtdFaixas = qtdFaixas;
		this.midia = midia;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public Integer getQtdFaixas() {
		return qtdFaixas;
	}

	public void setQtdFaixas(Integer qtdFaixas) {
		this.qtdFaixas = qtdFaixas;
	}

	public String getMidia() {
		return midia;
	}

	public void setMidia(String midia) {
		this.midia = midia;
	}

	@Override
	public void listaInformacoes() {
		System.out.println("Informa��es sobre o disco:\n" + "Titulo: " + this.getTitulo() + "\n" + "Ano de lan�amento: "
				+ this.getAnoLacamento() + "\n" + "Coment�rio " + this.getComentario() + "\n" + "Artista: "
				+ this.getArtista() + "\n" + "Quantidade de faixas " + this.getQtdFaixas() + "\n" + "Tipo de m�dia "
				+ this.getMidia());

	}

}
