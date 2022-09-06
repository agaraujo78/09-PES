package br.stackx.empresa;

public class Diretor extends Funcionario {

	public Diretor() {
		cargo = "DIRETOR";
	}
	
	public double getBonus() {
		
		return salario * 0.35;
		
	}
	
}
