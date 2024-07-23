package exemploplimorfismoparametrico;

public class cadastro {
private Aluno[] alunos;

public  void Cadastro() {
	alunos = new Aluno[0];
}

public boolean CadastrarAluno(Aluno a) {
	//Criar um vetor de alunos com uma posição a mais
	Aluno[] temp = new Aluno[alunos.length +1];
	
	// Copiar todas as referências atuais para o novo vetor
	for(int i =0; i<alunos.length;i++) {
		temp[i]= alunos[i];
}//na posição adicional de temp adiciona o novo aluno
		temp[alunos.length]=a;
		
	// Atualizar alunos
		alunos=temp;
		return true;
}

		public Aluno pesquisarAluno(int matricula) {
			Aluno resposta = null;
			for (int i = 0; i<= alunos.length;i++) {
				if(alunos[i].getMatricula()==matricula) {
					resposta=alunos[i];
					break;
				}
			}
			return resposta;
		}
	
}

