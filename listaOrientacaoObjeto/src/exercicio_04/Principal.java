package exercicio_04;

import java.util.Scanner;

/**
 * Exercício 4. Construa um programa com as seguintes características:
 * Implemente uma classe Proprietário. Declare os seguintes atributos na classe:
 * Nome, CPF, RG, Data de Nascimento, Rua, Bairro, Cidade, Estado, Cep, Complemento
 * Implemente uma classe Carro. Declare os seguintes atributos na classe:
 * Modelo, Cor, Ano, Marca, Chassi, Proprietário, Velocidade máxima, Velocidade atual, Nr de
 * portas, tem teto solar?, Nr Marchas, tem cambio automatico?, Volume de combustível
 * Implemente o método acelera que aumenta a velocidade de 1 em 1 km/h
 * Implemente o método freia que para o carro – Velocidade = 0 km/h
 * Implemete o método troca marcha
 * Implemente o método reduz a marcha;
 * Altere a classe Proprietário para que o atributo Endereço vire uma classe
 * A marcha ré nao pode ser engatada se o a velocidade for superior a 0 KM/h;
 * Implemente um método que calcule a autonomia de viagem do veículo com base no consumo
 * médio passado como parâmetro;
 * Implemente um método para exibir o volume de combustível
 * Transforme o atributo Marca de um carro em uma classe Marca com nome, nrDeModelos,
 * ano de lançamento e código identificador
 * Instancie um objeto da classe Carro, Pessoa, Endereço, Marca e relacione os objetos utilizando
 * os métodos ou construtores quando necessário.
 * 
 * @author Diego
 * Data: 2019/12/10
 * 
 * */

public class Principal {

	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("\n-- Entre com os dados da Marca do carro --"
				+ "\nNome: ");
		String nomeMarca = ler.next();
		System.out.println("Número do modelo: ");
		int nModelo = ler.nextInt();
		System.out.println("Ano do lançamento: ");
		String anoLancamento = ler.next();
		System.out.println("Código identificador: ");
		int codIdentificador = ler.nextInt();
		
		//instância do objeto marca
		Marca marca = new Marca(nomeMarca, nModelo, anoLancamento, codIdentificador);
		
		System.out.println("\n-- Entre com os dados do Carro--"
				+ "\nModelo: ");
		String modelo = ler.next();
		System.out.println("Cor: ");
		String cor = ler.next();
		System.out.println("Ano: ");
		String ano = ler.next();
		System.out.println("Chassi: ");
		String chassi = ler.next();
		System.out.println("Velocidade Máxima: ");
		int velocidadeMaximo = ler.nextInt();
		System.out.println("Velocidade Atual: ");
		int velocidadeAtual = ler.nextInt();
		System.out.println("Número de portas: ");
		int nPortas = ler.nextInt();
		System.out.println("Tem teto solar? (true or false): ");
		boolean tetoSolar = ler.nextBoolean();
		System.out.println("Número de Marcha: ");
		int nMarcha = ler.nextInt();
		System.out.println("O cambio é automático? (true or false): ");
		boolean cambioAutomatico = ler.nextBoolean();
		System.out.println("Capacidade do tanque de Combustível: ");
		int volumeCombustivel = ler.nextInt();
		
		//instância do objeto CARRO passando o objeto MARCA no construtor
		Carro carro = new Carro(modelo, cor, ano, chassi, velocidadeMaximo, velocidadeAtual, nPortas, tetoSolar, nMarcha, cambioAutomatico, volumeCombustivel, marca);
		
		
		System.out.print("-- Entre com os dados do endereço do proprietário --"
				+ "\nRua: ");
		String rua = ler.next();
		System.out.println("Bairro: ");
		String bairro = ler.next();
		System.out.println("Cidade: ");
		String cidade = ler.next();
		System.out.println("Estado: ");
		String estado = ler.next();
		System.out.println("CEP: ");
		String cep = ler.next();
		System.out.println("Complemento: ");
		String complemento = ler.next();
		
		//Instância o objeto endereço
		Endereco endereco = new Endereco(rua, bairro, cidade, estado, cep, complemento);
		
		System.out.println("\n -- Entre com os dados do proprietário --"
				+ "\nNome: ");
		String nome = ler.next();
		System.out.println("cpf: ");
		String cpf = ler.next();
		System.out.println("Data de nascimento: ");
		String data = ler.next();
		
		//instância do objeto PROPRIETÁRIO passando os objetos ENDERECO E CARRO no construtor
		Proprietario proprietario = new Proprietario(nome, cpf, data, endereco, carro);
		
		
		ler.close();
		
		
		
	}
	
	
}
