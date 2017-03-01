import java.awt.image.DataBufferDouble;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int opc;
		ListaDeInteiros lista = new ListaDeInteiros(4);
		
		do{
			opc = Integer.parseInt(JOptionPane.showInputDialog("MENU LISTA DE INTEIROS\n1 - Adiciona In�cio\n2 - Adiciona Final\n"
					+ "3 - Adiciona em Posi��o Espec�fica\n4 - Remove In�cio\n5 - Remove Final\n6 - Remove em Posi��o Espec�fica\n"
					+ "7 - Mostra Todos os Elementos da Lista\n8 - Consulta o Primeiro Elemento da Lista\n"
					+ "9 - Consulta o �ltimo Elemento da Lista\n99 - SAIR"));
			
			switch (opc) {
			case 1:	int e = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
					lista.adicionaInicio(e);
				break;
				
			case 2: int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
						lista.adicionaFinal(a);
				break;
				
			case 3:
				int v = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
				int pos = Integer.parseInt(JOptionPane.showInputDialog("Digite uma posicao: "));
				lista.adicionaPosicao(v, pos);
				break;
			case 4:
                    System.out.println("Valor removido = "+lista.removeInicio()+"\n Tamanho = "+lista.getTamanho());
				break;
			case 5: 
				int x = lista.removeFinal();
				System.out.println(x);
				break;
			case 6:
				int p = Integer.parseInt(JOptionPane.showInputDialog("digite a posicao a ser removida"));
				lista.removePosicao(p);
				
				break;
			case 7:
				System.out.println(lista.percorre());
				break;
			case 9:
				System.exit(opc);
				break;
			default:
				break;
			}
		}while(opc != 9);
	}

}
