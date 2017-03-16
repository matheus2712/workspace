
public class FilaCircular {

	private Aluno dados[];
	private int tamanho;
	int f, i;

	public FilaCircular(int c) {
		dados = new Aluno[c];
		tamanho = 0;
		f = 0;
		i = 0;

	}
	
	public String percorre(){
		String r="";
		for(int i=0; i<tamanho; i++){
			r = r + dados[i] + " ";
			
		}
		return r;
	}
	

	public void adiciona(Aluno a) {
		if (tamanho == dados.length)
			System.out.println("Erro! Fila cheia");
		else {
			dados[f] = a;
			/*
			 * volta no indice zero quando o fim for igual ao tamanho do vetor
			 * f++; 
			 * if(f==dados.length) 
			 * f=0;
			 */
			f = (f + 1) % dados.length;
			tamanho++;
		}
	}

	public Aluno remove() {
		Aluno r = null;
		if (tamanho == 0)
			System.out.println("ERRO! Fila Vazia");
		else {
			r = dados[i];
			i = (i + 1) % dados.length;
			tamanho--;
		}
		return r;
	}

}