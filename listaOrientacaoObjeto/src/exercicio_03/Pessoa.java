package exercicio_03;

/**
 * Classe pessoa
 * @author Diego
 * author Weslei
 * 
 * Data 2019/12/10
 * */

public class Pessoa {
	
	private String nome;
	private String telefone;
	private String email;

	
	//Construtor
	public Pessoa (String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	
	//Métodos set e get
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//ToString
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
	}
	
	
}


