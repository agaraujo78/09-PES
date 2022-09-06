package br.stackx.empresa;

public class Funcionario {

	private String nome;
	private double salario;
	
	// 1- Gerente, 2- Desenvolvedor, 3- Outros...
	private int cargo;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonus() {
		
		if (cargo == 1) { //Gerente
		return salario * 0.30;
		} else if (cargo == 2) {//Desenvolvedor
		return salario * 0.25;	
		}else {//Outros
		return salario * 0.20;
		}
	}
	
	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		
		return String.format("NOME: %s\nSALARIO: R$ %.2f\nBÔNUS: %.2f", nome, salario, getBonus());
	}
}
