package model;

public class Usuario {
	private String nome;
	private String email;
	private String cpf;
	
	public Usuario(String nome, String email, String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	/**
	 * Geração do relatório usando o princípio tell dont ask
	 */
	public void gerarRelatorio() {
		System.out.println(" - Nome: " + this.getNome());
		System.out.println(" - E-mail: " + this.getEmail());
		System.out.println(" - CPF: " + this.getCpf());
		System.out.println();
	}
	
	
}
