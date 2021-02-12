package br.unit.leand;

public class Filme extends Item {

	private String diretor;
	private Integer duracao;
	private String genero;

	public Filme() {

	}

	public Filme(String titulo, Integer anoLacamento, String comentario, String diretor, Integer duracao,
			String genero) {
		super(titulo, anoLacamento, comentario);
		this.diretor = diretor;
		this.duracao = duracao;
		this.genero = genero;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public void listaInformacoes() {
		System.out.println("Informa��es sobre o filme:\n" + "Titulo: " + this.getTitulo() + "\n" + "Ano de lan�amento "
				+ this.getAnoLacamento() + "\n" + "Coment�rio " + this.getComentario() + "\n" + "Diretor "
				+ this.getDiretor() + "\n" + "Dura��o " + this.getDuracao() + "\n" + "G�nero: " + this.getGenero());

	}

}
