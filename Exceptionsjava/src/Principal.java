import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int opcao;
		do {
			String str0p1= JOptionPane.showInputDialog("Informe operador 1");
			String str0p2 = JOptionPane.showInputDialog("Informeoperador 2");
			try {
			int op1 = Integer.parseInt(str0p1);
			int op2 = Integer.parseInt(str0p2);
			
			Calculadora c = new Calculadora(op1,op2);
			String resposta = "A divisão de " +  op1  + " por " + op2 + " é igual a :" +
								c.operacao("divisao");
				JOptionPane.showMessageDialog(null, resposta);
				
				
			}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor errado informado para algum operando");
				e.printStackTrace();
			}catch(ArithmeticException e) {
				JOptionPane.showMessageDialog(null, "Valor informado foi zero");
				e.printStackTrace();
			}catch (Exception e) {JOptionPane.showMessageDialog(null, "Capturade Excessão genérica");
			e.printStackTrace();
			}	
			
			
			
			opcao = JOptionPane.showConfirmDialog(null, "Deseja calcular novamente?","Ian Lucca",JOptionPane.YES_NO_OPTION);
		}while(opcao==JOptionPane.YES_NO_OPTION);
	}

}
