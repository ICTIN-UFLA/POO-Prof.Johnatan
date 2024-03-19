public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Dr. Smith");
        Curso curso1 = new Curso("Introdução à POO");
        Curso curso2 = new Curso("Desenvolvimento Avançado em Java");

        curso1.setProfessor(professor);
        curso2.setProfessor(professor);

        System.out.println("Professor: " + professor.getNome());
        for (Curso curso : professor.getCursos()) {
            System.out.println("Curso: " + curso.getNome());
        }
    }
}
