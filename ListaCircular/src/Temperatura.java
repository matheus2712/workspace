import java.util.Arrays;

public class Temperatura {

	private float graus[];
	private int tamanho;
	
	public Temperatura(int g){
		graus = new float[g];
		tamanho = 0;
	}

	public float[] getGraus() {
		return graus;
	}

	public void setGraus(float[] graus) {
		this.graus = graus;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "Temperatura [graus=" + Arrays.toString(graus) + ", tamanho=" + tamanho + "]";
	}
	
	
	
}
