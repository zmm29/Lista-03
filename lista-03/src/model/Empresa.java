package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String nome;
	private String cnpj;
	private List<Funcionario> funcionarios;
//	private List<Funcionario> funcionarios = new ArrayList<Funcionario>(); criar ou n�o criar uma vari�vel de classe j� instanciada (quando for lista)?
//  O construtor (Empresa()) tem que ser sem par�metros (vazio) ou com um par�metro para cada vari�vel de classe?
//	public Empresa(String nome, String cnpj, Funcionario funcionario) {
//		this.nome = nome;
//		this.cnpj = cnpj;
//		this.funcionarios = new ArrayList<Funcionario>();
//		this.funcionarios.add(funcionario);
//	}
	
	public Empresa() {
		this.funcionarios = new ArrayList<Funcionario>();
	}
	
	public Empresa(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.funcionarios = new ArrayList<Funcionario>();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public List<Funcionario> getFuncionarios() {
		return this.funcionarios;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void setFuncionarios(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
}
