package br.stackx.sistema;

public class Aluno {
	//Atributos
	//esta classe está para armazenar os dados
	private String nome;
	private double nota1;
	private double nota2;
	
	
	// para corrigir o problema em formAluno
	public Aluno() {}
	//irei inserir um metodo construtor 
	public Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	 
	//Métodos Especiais
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public double getNota1() {
		return this.nota1;
	}
	public void setNota1 (double nota1) {
		if(nota1 >= 0.0 && nota1<=10.0) {
		this.nota1 = nota1;
		}
	}
	public double getNota2() {
		return this.nota2;
	}
	public void setNota2(double nota2) {
		if(nota2 >= 0.0 && nota2<=10.0) {
			this.nota2 = nota2;
			}
	}
	
	//Métodos Públicos
	public	double obterMedia() {
		
		double res = (nota1 + nota2) / 2;
		
		return res;
	}

	@Override
	public String toString() {
		
		String info = String.format("ALUNO: %s | NOTA 1: %.2f | NOTA 2: %.2f | MÉDIA: %.2f\n"
				+ "============================================================", nome, nota1, nota2, obterMedia());
		
		return info;
	}
}
