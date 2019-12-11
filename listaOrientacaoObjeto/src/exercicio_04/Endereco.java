package exercicio_04;

/**
 * @author Diego
 * Data 2019/12/10
 * 
 * Classe de Endereço
 * */

public class Endereco {
	
	private String _rua;
	private String _bairro;
	private String _cidade;
	private String _estado;
	private String _cep;
	private String _complemento;
	
	
	
	//Construtor
	public Endereco(String _rua, String _bairro, String _cidade, String _estado, String _cep, String _complemento) {
		super();
		this._rua = _rua;
		this._bairro = _bairro;
		this._cidade = _cidade;
		this._estado = _estado;
		this._cep = _cep;
		this._complemento = _complemento;
	}
	
	//===============================
	//Métodos Set e Get
	//===============================
	
	public String get_rua() {
		return _rua;
	}
	public void set_rua(String _rua) {
		this._rua = _rua;
	}
	public String get_bairro() {
		return _bairro;
	}
	public void set_bairro(String _bairro) {
		this._bairro = _bairro;
	}
	public String get_cidade() {
		return _cidade;
	}
	public void set_cidade(String _cidade) {
		this._cidade = _cidade;
	}
	public String get_estado() {
		return _estado;
	}
	public void set_estado(String _estado) {
		this._estado = _estado;
	}
	public String get_cep() {
		return _cep;
	}
	public void set_cep(String _cep) {
		this._cep = _cep;
	}
	public String get_complemento() {
		return _complemento;
	}
	public void set_complemento(String _complemento) {
		this._complemento = _complemento;
	}
	
	

}
