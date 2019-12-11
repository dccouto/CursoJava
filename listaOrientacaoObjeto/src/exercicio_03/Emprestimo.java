package exercicio_03;

/**
 * @author Diego
 * 
 * Data 2019/12/10
 * 
 * Classe Empréstimo
 * 
 * */

import java.util.ArrayList;

public class Emprestimo {

	Pessoa pessoa;
	ArrayList<Livro> livros;
	
	
	
	//Construtor
	public Emprestimo(Pessoa pessoa, ArrayList<Livro> livros) {
		super();
		this.pessoa = pessoa;
		this.livros = livros;
	}
	
	//Métodos set e get
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public ArrayList<Livro> getLivros() {
		return livros;
	}
	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
	
	
	
	
}
