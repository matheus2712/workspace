/**
 * LISTA DE NOMES ORGANIZADOSE, ORDEM CRESCOMTE DE COMPRIMENTO(quantidade de
 * caracteres)
 * 
 * @author tecnico
 *
 */
public class ListaDeNomes {
	String nomes[];
	int tamanho;

	public ListaDeNomes(int c) {
		nomes = new String[c];
		tamanho = 0;
	}

	public boolean cheia() {
		return tamanho == nomes.length;
	}

	public String percorre() {
		String r = "";
		for (int i = 0; i < tamanho; i++) {
			r = r + nomes[i] + " ";

		}
		return r;
	}

	public void adiciona(String e) {
		int ii =tamanho;
		if (cheia()) {
			System.out.println("cheia");
		} else if (tamanho == 0) {
			nomes[tamanho] = e;
			tamanho++;
		
			
		} else if (nomes[tamanho - 1].compareTo(e) < 0) {
			nomes[tamanho] = e;
			tamanho++;
		} 
		
		else {
			
	while(nomes[ii - 1].compareTo(e) > 0){
			
			
			
			
			// CompareTo -1 PRIMEIRO VALOR EH MENOR
			    
				nomes[ii] = nomes[ii - 1];
				ii--;
				System.out.println(percorre());
				}			
	}
			
		
			
			// comparaTo(a.getNome())>0
		}
			
		

	
	
	public String removeInicio(){
		if(tamanho == 0){
			System.out.println("vazia");
			return null;
		}
		String aux = nomes[0];
		
		for(int i = 0; i<tamanho+1; i++){
			nomes[i] = nomes[i+1];
			
		}
		tamanho--;
		
		
		return aux;
	}

}
