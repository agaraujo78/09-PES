package br.stackx.sistema;

import java.util.Scanner; // Ctrl + shift + O

public class FormAluno {

	private Scanner leitor = new Scanner(System.in);
	
	public Aluno criar() {
		
		Aluno aluno = new Aluno();
		
		System.out.print("Nome do Aluno: ");
		aluno.setNome (leitor.nextLine());
		
		System.out.printf("Nota 01: ");
		aluno.setNota1(leitor.nextDouble());
		
		System.out.printf("Nota 02: ");
		aluno.setNota2(leitor.nextDouble());
		
		//CAPTURA O "ENTER" DESCARTADO NO COMANDO nextDouble() ANTERIOR
		leitor.nextLine();
		
		return aluno;
	}
}
