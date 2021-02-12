package br.unit.leand;

public class UsaLocadora {

	public static void main(String[] args) {
		Disco disco1 = new Disco(" Samba Social Clube 5", 2014, "V�rios Sambas", "V�rios Artistas", 12, "CD");
		Disco disco2 = new Disco("Pode Entrar", 2009, "Ivete e Convidados", " Ivete Sangalo", 14, "DVD");
		Filme filme1 = new Filme("Smurfs 2", 2013, "Gargamel cria a vers�o malvada dos Smurfs", "Raja Gosnell", 140, "Anima��o");
		Filme filme2 = new Filme("Os mercen�rios 2",  2012, "De volta ao mundo", "Simon West", 210, "Anima��o");
		Locadora loc = new Locadora();

		loc.novoDisco(disco1);
		loc.novoDisco(disco2);
		loc.novoFilme(filme1);
		loc.novoFilme(filme2);
		
		System.out.println("Informa��es dos Discos\n");
		System.out.println("-----------------------------------------");
		loc.listarDiscos();
		System.out.println("Informa��es dos Filmes\n");
		System.out.println("-----------------------------------------");
		loc.listarFilmes();

	}

}
