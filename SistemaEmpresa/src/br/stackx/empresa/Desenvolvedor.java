package br.stackx.empresa;

public class Desenvolvedor extends Funcionario  {

	public Desenvolvedor() {
		cargo = "DESENVOLVEDOR";
		}
		
		public double getBonus() {
			
			return salario * 0.25;
			
	}

}
