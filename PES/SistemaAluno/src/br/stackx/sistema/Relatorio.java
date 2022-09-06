package br.stackx.sistema;

public class Relatorio {

	private Aluno alunos[] = new Aluno[3]; // criei um vetor de Aluno

	private int pos = 0; //para controlar a posiçao num array preciso criar 
	//entao eu criei mais um atributo...
	

	public void adicionarAluno(Aluno aluno) {
		
		this.alunos[pos] = aluno;
		pos++;
	}
	
	
	public void imprimirDados() {
	
	for(int i = 0; i < 3; i++ ) {
		System.out.println(alunos[i]);
	  }	
	}
	
	public void imprimirSomatorioMedia() {
		
		double totalMedia = 0;
		
		for(int i = 0; i < 3; i++ ) {
			totalMedia = totalMedia + alunos[i].obterMedia();
		}
		System.out.printf("SOMATÓRIO DE MÉDIA: %.2f\n", totalMedia);
  }
	
	public void imprimirMediaGeral() {
		
		double mediaGeral = 0;
		double totalMedia = 0;
		
		for(int i = 0; i < 3; i++ ) {
			totalMedia = totalMedia + alunos[i].obterMedia();
			mediaGeral = totalMedia/(i+1);
		}
		System.out.printf("MÉDIA GERAL: %.2f\n", mediaGeral);
  }
}