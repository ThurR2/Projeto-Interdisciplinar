package model;

public class Professor extends Usuario {

	private int id;
	private int administrador;
	private String matricula;

	public Professor(String nome, String email, String senha, int id, int administrador, String matricula) {
		super(nome, email, senha);
		this.id = id;
		this.administrador = administrador;
		this.matricula = matricula;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAdministrador() {
		return administrador;
	}

	public void setAdministrador(int administrador) {
		this.administrador = administrador;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
