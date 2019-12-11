package exercicio_03;

/**
 * @author Diego
 * author Weslei
 * 
 * Data 2019/12/10
 * 
 * Classe livro
 * 
 * */

public class Livro {
	private String nomeLivro;
	private String autor;
	private String genero;
	private String ano;

	
	//Construtor
	public Livro(String nomeLivro, String autor, String genero, String ano) {
		this.nomeLivro = nomeLivro;
		this.autor = autor;
		this.genero = genero;
		this.ano = ano;
	}

	//Métodos set e get
	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	//ToString
	@Override
	public String toString() {
		return "Livro [nomeLivro=" + nomeLivro + ", autor=" + autor + ", genero=" + genero + ", ano=" + ano + "]";
	}
	
	
}
