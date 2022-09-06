package br.stackx.empresa;

public class App {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		func.setNome("Joao");
		func.setSalario(1000);
		System.out.println(func);
		
		Gerente ger = new Gerente();
		ger.setNome("Maria");
		ger.setSalario(2000);
		System.out.println(ger);
		
		Dba dba = new Dba();
		dba.setNome("Arthur");
		dba.setSalario(3000);
		System.out.println(dba);
		
		Desenvolvedor desenvolvedor = new Desenvolvedor();
		desenvolvedor.setNome("Ana");
		desenvolvedor.setSalario(4000);
		System.out.println(desenvolvedor);

		Diretor diretor = new Diretor();
		diretor.setNome("Lucas");
		diretor.setSalario(8000);
		System.out.println(diretor);
		
		Faxineiro faxineiro = new Faxineiro();
		faxineiro.setNome("Arthur");
		faxineiro.setSalario(1500);
		System.out.println(faxineiro);
		
	
	}

}
