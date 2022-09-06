package br.stackx.sistema;

public class Teste {

	public static void main(String[] args) {
		
		String nomes[] = new String[3];
		int inteiros[] = new int[5];
			
		Aluno alunos[] = new Aluno[3]; // criei um vetor de Aluno

		nomes[0] = "Almir";
		inteiros[2] = 150;
				
		alunos [0] = new Aluno( "Joao", 3.5, 7.9);
		alunos [1] = new Aluno("Maria", 5.5, 8.9);
		alunos [2] = new Aluno("Bete", 7.5, 6.9);
		
		for(int i = 0; i < 3; i++ ) {
			System.out.println(alunos[i]);
			
		} 

	}

}
