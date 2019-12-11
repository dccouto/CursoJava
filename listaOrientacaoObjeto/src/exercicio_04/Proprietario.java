package exercicio_04;

/**
 * @author Diego
 * 
 * Data 2019/12/10
 * 
 * 
 * Classe Proprietario
 * 
 * */


public class Proprietario {

	private String _nome;
	private String _cpf;
	private String _date;

	//Objeto da classe Endereço
	private Endereco endereco;
	//Objeto da classe Carro
	private Carro carro;
	
	
	//Construtor
	public Proprietario(String _nome, String _cpf, String _date, Endereco endereco, Carro carro) {
		super();
		this._nome = _nome;
		this._cpf = _cpf;
		this._date = _date;
		this.endereco = endereco;
		this.carro = carro;

	}
	
	//============================
	// Método Set e Get
	//============================
	
	public Carro getCarro() {
		return carro;
	}


	public void setCarro(Carro carro) {
		this.carro = carro;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public String get_nome() {
		return _nome;
	}
	
	public void set_nome(String _nome) {
		this._nome = _nome;
	}
	
	public String get_cpf() {
		return _cpf;
	}
	
	public void set_cpf(String _cpf) {
		this._cpf = _cpf;
	}
	
	public String get_date() {
		return _date;
	}
	
	public void set_date(String _date) {
		this._date = _date;
	}
	

}
