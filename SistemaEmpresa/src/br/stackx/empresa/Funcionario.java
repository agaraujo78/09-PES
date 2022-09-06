package br.stackx.empresa;

public class Funcionario {

	protected String cargo;
	protected String nome;
	protected double salario;
	
	
	public Funcionario() {
		cargo = "FUNCIONARIO GERAL";
	}
	
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
		
		return salario * 0.20;
		
	}
	

	@Override
	public String toString() {
		
		return String.format("CARGO: %s\nNOME: %s\nSALARIO: R$ %.2f\nBÔNUS: %.2f\n", cargo, nome, salario, getBonus());
	}
}
