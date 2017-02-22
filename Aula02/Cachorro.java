package aula;

public class Cachorro{
	private String raca;
	private String cor;
	private String sexo;
	public String nome;
	
	public void latir(){
		System.out.println(this.nome + "  latindo : au au !");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaça(String raca) {
		this.raca = raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}