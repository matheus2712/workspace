public class ListaDeInteiros {
	public int dados[];
	private int tamanho;
		
	public ListaDeInteiros(int c){
		dados = new int[c];
		tamanho = 0;
	}
	
	public boolean cheia(){
		return tamanho == dados.length;
	}
	public boolean vazia(){
		return tamanho == 0;
	}
	 
	public String percorre(){
		String r="";
		for(int i=0; i<tamanho; i++){
			r = r + dados[i] + " ";
			
		}
		return r;
	}
	
	public void adicionaInicio(int e){
		if(cheia())
			System.out.println("ERRO! Lista Cheia");
		else{
			int i = tamanho;
			while(i > 0){
				dados[i] = dados[i-1];
				i--;
			}
			dados[0] = e;
			tamanho++;
		}
	}
		public void adicionaPosicao(int e, int pos){
			if(cheia())
				System.out.println("ERRO! Lista Cheia");
			else if(pos<tamanho+1) {
				int i = tamanho;
				while(i != pos-1){
					dados[i] = dados[i-1];
					i--;
				}
				dados[pos-1] = e;
				tamanho++;
			}
		
	}
	
	public void adicionaFinal(int e){
		if(cheia())
			System.out.println("ERRO! Lista Cheia");
		else{
			dados[tamanho] = e;
			tamanho++;
		}
	}
	
	public int removeInicio(){
		if(vazia()){
			System.out.println("vazia");
			return 0;
		}
		int aux = dados[0];
		
		for(int i = 0; i<tamanho; i++){
			dados[i] = dados[i+1];
			
		}
		tamanho--;
		
		
		return aux;
	}
	
	public void removePosicao(int pos){
		if(vazia()){
			System.out.println("vazia");
			
		}
		int i=tamanho;
		for(int a=pos; a<tamanho+1;a++){
			dados[a-1] = dados[a];
			
			
		}
		tamanho--;
		
		
		
		
	}
	

	public int removeFinal(){
		if(vazia()){
			System.out.println("lista vazia");
			return 0;
		}
		int aux = dados[tamanho-1];
		tamanho--;
		//System.out.println(aux);
		return aux;
	}
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
}