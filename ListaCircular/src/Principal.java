import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int opc;
		ListaDeNomes l1 = new ListaDeNomes(4); 
		FilaCircular f1 = new FilaCircular(4);
		
		do{
		 opc = Integer.parseInt(JOptionPane.showInputDialog(
				"1 - Adiciona nome \n 2 - Remove nome \n 3 - Recupera nome \n 4 - Mostrar \n 5 - Sair"));

		switch (opc) {
		case 1:
			String e = JOptionPane.showInputDialog("Digite um nome: ");
			l1.adiciona(e);
			break;

		case 2:
			l1.removeInicio();
			break;
		case 3:
			Aluno a = new Aluno(12, "matt");
			Aluno aa = new Aluno(123, "matthh");
			f1.adiciona(a);
			f1.adiciona(aa);
			System.out.println(f1.percorre());
			
			break;
		case 4:
			System.out.println(l1.percorre());
			
			break;

		case 5:
			System.exit(opc);
			break;

		default:
			break;
		
		}
		}while(opc != 5);
	}
	
	
}
