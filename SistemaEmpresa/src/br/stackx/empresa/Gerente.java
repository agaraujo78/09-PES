package br.stackx.empresa;

public class Gerente extends Funcionario {

	
	
	public Gerente() {
		cargo = "GERENTE";
	}
	
	public double getBonus() {
		
		return salario * 0.30;
		
	}
	


}
