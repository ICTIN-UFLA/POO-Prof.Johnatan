public class Curso {
    private String nome;
    private Professor professor;

    public Curso(String nome) {
        this.nome = nome;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
        professor.adicionarCurso(this);
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }
}
