public class Candidato {
    private String nome;
    private int cursosRealizados;

    public Candidato(String nome, int cursosRealizados) {
        this.nome = nome;
        this.cursosRealizados = cursosRealizados;
    }

    public String getNome() {
        return nome;
    }

    public int getCursosRealizados() {
        return cursosRealizados;
    }
}
