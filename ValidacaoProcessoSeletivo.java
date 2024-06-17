import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ValidacaoProcessoSeletivo {
    public static void main(String[] args) {
        List<Candidato> candidatos = new ArrayList<>();
        
        // Exemplo de adicionar candidatos (nome, cursosRealizados)
        candidatos.add(new Candidato("João", 3));
        candidatos.add(new Candidato("Maria", 5));
        candidatos.add(new Candidato("Pedro", 2));
        
        // Ordenando a lista de candidatos pelo número de cursos realizados (do maior para o menor)
        Collections.sort(candidatos, Comparator.comparingInt(Candidato::getCursosRealizados).reversed());
        
        // O primeiro da lista é o vencedor
        Candidato vencedor = candidatos.get(0);
        
        // Exibindo o nome do vencedor e a quantidade de cursos realizados
        System.out.println("O vencedor do processo seletivo é: " + vencedor.getNome());
        System.out.println("Número de cursos realizados: " + vencedor.getCursosRealizados());
    }
    
}
