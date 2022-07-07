package view;

import model.Empresa;
import model.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Empresa ti = new Empresa();
		ti.setNome("IT - Aiti");
		ti.setCnpj("77.140.899/0001-72");
		
//		Funcionario josue = new Funcionario("Josué", "123.456.789-10", 900.00, ti);
		Funcionario josue = new Funcionario();
		josue.setNome("Josué");
		josue.setCpf("123.456.789-10");
		josue.setSalario(900.00);
		josue.setEmpresa(ti);
		
		ti.setFuncionarios(josue);

		System.out.println("=== Dados da empresa IT - Aiti ===");
		System.out.println(ti.getNome());
		System.out.println(ti.getCnpj());
		for (Funcionario f : ti.getFuncionarios()) {
			System.out.println(f.getNome());
		}

		System.out.println("=== Dados do funcionário Josué ===");
		System.out.println(josue.getNome());
		System.out.println(josue.getCpf());
		System.out.println(josue.getSalario());
		System.out.println(josue.getEmpresa().getNome());
		
//		Empresa it = new Empresa("IT Technologies", "52.311.515/0001-06", calebe);
		Empresa it = new Empresa("IT Technologies", "52.311.515/0001-06");
		
		Funcionario calebe = new Funcionario("Calebe");
		calebe.setCpf("111.000.101-01");
		calebe.setSalario(1100.00);
		
		calebe.setEmpresa(it);
		
		System.out.println("=== Dados da empresa IT Technologies ===");
		System.out.println(it.getNome());
		System.out.println(it.getCnpj());
		for (Funcionario f2 : it.getFuncionarios()) {
			System.out.println(f2.getNome());
		}
		
		System.out.println("=== Dados do funcionário Calebe ===");
		System.out.println(calebe.getNome());
		System.out.println(calebe.getCpf());
		System.out.println(calebe.getSalario());
		System.out.println(calebe.getEmpresa().getNome());
	}
}
