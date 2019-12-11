package exercicio_04;

/**
 * @author Diego
 * Data 2019/12/10
 * 
 *Classe Marca
 * */

public class Marca {
	private String _nome;
	private int _nModelo;
	private String _anoLancamento;
	private int _codIdentificador;
	
	
	//Construtor
	public Marca(String _nome, int _nModelo, String _anoLancamento, int _codIdentificador) {
		super();
		this._nome = _nome;
		this._nModelo = _nModelo;
		this._anoLancamento = _anoLancamento;
		this._codIdentificador = _codIdentificador;
	}
	
	//========================
	// Método Set e Get
	//========================
	public String get_nome() {
		return _nome;
	}
	
	public void set_nome(String _nome) {
		this._nome = _nome;
	}
	
	public int get_nModelo() {
		return _nModelo;
	}
	
	public void set_nModelo(int _nModelo) {
		this._nModelo = _nModelo;
	}
	
	public String get_anoLancamento() {
		return _anoLancamento;
	}
	
	public void set_anoLancamento(String _anoLancamento) {
		this._anoLancamento = _anoLancamento;
	}
	
	public int get_codIdentificador() {
		return _codIdentificador;
	}
	
	public void set_codIdentificador(int _codIdentificador) {
		this._codIdentificador = _codIdentificador;
	}



}
