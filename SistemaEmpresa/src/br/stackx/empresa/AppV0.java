package br.stackx.empresa;

public class App {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		func.setNome("Joao");
		func.setCargo(1);
		func.setSalario(1000);
		
		System.out.println(func);
		
	}

}
