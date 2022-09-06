package br.stackx.empresa;

public class Dba extends Funcionario  {

	public Dba() {
		cargo = "DBA";
	}
	
	public double getBonus() {
		
		return salario * 0.10;
	}	

}
