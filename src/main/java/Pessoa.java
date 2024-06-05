package main.java;
import java.util.List;
import java.util.Objects;

public class Pessoa {
	private String nome;
	private String sexo;
	private int idade;
	
	public Pessoa() {

	}
	
	public Pessoa(String nome, String sexo, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idade, nome, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return idade == other.idade && Objects.equals(nome, other.nome)
				&& Objects.equals(sexo, other.sexo);
	}

	public List<Pessoa> populaPessoas() {
		Pessoa pessoa1 = new Pessoa("Mateus Raimundo", "masculino", 29);
		Pessoa pessoa2 = new Pessoa("Masashi Kishimoto", "masculino", 26);
		Pessoa pessoa3 = new Pessoa("Sakura", "feminino", 26);
		Pessoa pessoa4 = new Pessoa("Hinata", "feminino", 21);
		return List.of(pessoa1, pessoa2, pessoa3, pessoa4);
	}

	
}
