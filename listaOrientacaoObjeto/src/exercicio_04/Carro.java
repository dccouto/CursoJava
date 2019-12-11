package exercicio_04;

/**
 * @author Diego
 * Data 2019/12/10
 * 
 * 
 * Classe Carro
 * 
 * */


public class Carro {
	
	private String _modelo;
	private String _cor;
	private String _ano;
	private String _chassi;
	private int _velocidadeMaxima;
	private int _velocidadeAtual;
	private int _nPorta;
	private boolean _tetoSolar;
	private int _nMarcha;
	private boolean _cambioAutomarico;
	private int _volumeCombustivel;
	
	//Objeto marca
	Marca marca;
	
	
	
	//Construtor	
	public Carro(String _modelo, String _cor, String _ano, String _chassi, int _velocidadeMaxima,
			int _velocidadeAtual, int _nPorta, boolean _tetoSolar, int _nMarcha, boolean _cambioAutomarico,
			int _volumeCombustivel, Marca marca) {
		super();
		this._modelo = _modelo;
		this._cor = _cor;
		this._ano = _ano;
		this._chassi = _chassi;
		this._velocidadeMaxima = _velocidadeMaxima;
		this._velocidadeAtual = 0;
		this._nPorta = _nPorta;
		this._tetoSolar = _tetoSolar;
		this._nMarcha = _nMarcha;
		this._cambioAutomarico = _cambioAutomarico;
		this._volumeCombustivel = _volumeCombustivel;
		this.marca = marca;
	}
	
	//==============================
	// Métodos Set e Get
	//==============================
	
	public String get_modelo() {
		return _modelo;
	}
	
	public void set_modelo(String _modelo) {
		this._modelo = _modelo;
	}
	
	public String get_cor() {
		return _cor;
	}
	
	public void set_cor(String _cor) {
		this._cor = _cor;
	}
	
	public String get_ano() {
		return _ano;
	}
	
	public void set_ano(String _ano) {
		this._ano = _ano;
	}
	
	public String get_chassi() {
		return _chassi;
	}
	
	public void set_chassi(String _chassi) {
		this._chassi = _chassi;
	}
	
	public int get_velocidadeMaxima() {
		return _velocidadeMaxima;
	}
	
	public void set_velocidadeMaxima(int _velocidadeMaxima) {
		this._velocidadeMaxima = _velocidadeMaxima;
	}
	
	public int get_velocidadeAtual() {
		return _velocidadeAtual;
	}
	
	public void set_velocidadeAtual(int _velocidadeAtual) {
		this._velocidadeAtual = _velocidadeAtual;
	}
	
	public int get_nPorta() {
		return _nPorta;
	}
	
	public void set_nPorta(int _nPorta) {
		this._nPorta = _nPorta;
	}
	
	public boolean is_tetoSolar() {
		return _tetoSolar;
	}
	
	public void set_tetoSolar(boolean _tetoSolar) {
		this._tetoSolar = _tetoSolar;
	}
	
	public int get_nMarcha() {
		return _nMarcha;
	}
	
	public void set_nMarcha(int _nMarcha) {
		this._nMarcha = _nMarcha;
	}
	
	public boolean is_cambioAutomarico() {
		return _cambioAutomarico;
	}
	
	public void set_cambioAutomarico(boolean _cambioAutomarico) {
		this._cambioAutomarico = _cambioAutomarico;
	}
	
	public int get_volumeCombustivel() {
		return _volumeCombustivel;
	}
	
	public void set_volumeCombustivel(int _volumeCombustivel) {
		this._volumeCombustivel = _volumeCombustivel;
	}


	//Método acelera carro
	public void acelera() {
		//Verifica se a velocidade atual é menor que a velocidade máxima
		if(this._velocidadeAtual < this._velocidadeMaxima)
			this._velocidadeAtual++; // incrementa velocidade atual
	}
	
	//Método Freia
	public void freia() {
		//seta a velocidade atual para 0
		this._velocidadeAtual = 0;
	}

	
	//Método passar a marcha
	public void passarMarcha() {
		//Verifica se é automático
		if(!this._cambioAutomarico)
			if(this._nMarcha < 5) // Verifica se é menor que a 5 marcha
				this._nMarcha++;
	}

	//Método reduzir a marcha
	public void reduzirMarcha() {
		//Se não for automático
		if(!this._cambioAutomarico) {
			if(this._nMarcha > 0) {
				this._nMarcha--;
			}
			//Verifica se o carro está parado e no ponto morto para colocar a marcha ré (-1)
			if(this._velocidadeAtual == 0 && _nMarcha == 0)
				this._nMarcha--;
		}	
	}
	
	//Método que mostra a autonomia do carro de acordo com o consumo médio do veículo
	public void autonomia(float consumoMedio) {
		System.out.println("Autonomia de: " + consumoMedio * _volumeCombustivel + " KM");
	}




}
