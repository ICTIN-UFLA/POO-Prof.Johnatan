public class Professor {
    private String nome;
    private List<Curso> cursos;

    public Professor(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
