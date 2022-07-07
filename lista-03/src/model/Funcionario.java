package model;

public class Funcionario {

	private String nome;
	private String cpf;
	private Double salario;
	private Empresa empresa;

//	public Funcionario(String nome, String cpf, Double salario, Empresa empresa) {
//		this.nome = nome;
//		this.cpf = cpf;
//		this.salario = salario;
//		this.empresa = empresa;
//	}
	
	public Funcionario() {
		
	}

	public Funcionario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}
	
	public Double getSalario() {
		return this.salario;
	}
	
	public Empresa getEmpresa() {
		return this.empresa;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
}
