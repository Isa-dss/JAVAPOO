package aulas.aula3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente { 

	// atributos
	private String nome, endereco;
	private final Date dataNasc; //transforma a variável em constante atraves do final

	// construtor
	public Cliente(String nome, String endereco, String dataNasc) throws ParseException{ // lancar uma exception
		this.nome = nome;// nome declarado no escopo global = nome do escopo local
		this.endereco = endereco;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); // string que recebe o formato 
		this.dataNasc = formato.parse(dataNasc);  // trasnforma a string com o formato para o date e recebe datenasc como parametro 
	}

	//métodos getters (read) / setters (write) -- Neste caso e usado pois é a unica forma de acessar as variaveis que sao privada (encapsuladas - só acessam com metodos)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) { // como esta inserindo algo prescisa de um parametro para receber este valor
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataNasc() {
		return dataNasc;
	}
}
