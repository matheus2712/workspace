
public class Fornecedor {

	private int cnpj, telefone;
	private String razao, endereco;
	
	public Fornecedor(int cnpj, int telefone, String razao, String endereco){
		
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.razao = razao;
		this.endereco = endereco;
		
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Fornecedor [cnpj=" + cnpj + ", telefone=" + telefone + ", razao=" + razao + ", endereco=" + endereco
				+ "]";
	}
	
}
