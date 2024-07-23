package exemploplimorfismoparametrico;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		cadastro c = new cadastro();
		
		for (int i =0; i<3; i++) {
			String nome = JOptionPane.showInputDialog("Informe o nome do aluno");
			String strMat= JOptionPane.showInputDialog("Informe matrícula");
			int mat = Integer.parseInt(strMat);
			
			Aluno a = new Aluno(nome, mat);
			c.CadastrarAluno(a);
		}

		for(int i = 0; i<2;i++) {
			String strMat= JOptionPane.showInputDialog("Qual matrícula será pesquisada?");
			int mat = Integer.parseInt(strMat);
			
			Aluno a =c.pesquisarAluno(mat);
			
			if (a==null) {JOptionPane.showMessageDialog(null,"Aluno não encontrado");
			}
			else {
				System.out.println(a.getMatricula()+"-"+a.getNome());
			}
		}
	}
}
