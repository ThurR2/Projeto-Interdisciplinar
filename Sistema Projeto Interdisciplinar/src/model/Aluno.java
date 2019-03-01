package model;

/**
 *
 * @author Grupo PI
 */
public class Aluno extends Usuario {

    private int id;
    private int ra;

    public Aluno(int id, int ra, String nome, String email, String senha) {
        super(nome, email, senha);
        this.id = id;
        this.ra = ra;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRa() {
        return this.ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
}
