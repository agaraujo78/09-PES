package br.stackx.empresa;

public class Faxineiro extends Funcionario  {

	public Faxineiro() {
		cargo = "FAXINEIRO";
	}
	
	public double getBonus() {
		
		return salario * 0.05;
		
	}
	

}
