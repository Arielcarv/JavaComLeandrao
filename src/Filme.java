import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

public class Filme implements Salvador {

    String nome;
    String diretor;
    ArrayList<Genero> generos;
    Duration duracao;
    LocalDate dataDeLancamento;

    public Filme(String nome, String diretor, ArrayList<Genero> generos, Duration duracao, LocalDate dataDeLancamento) {
        this.nome = nome;
        this.diretor = diretor;
        this.generos = generos;
        this.duracao = duracao;
        this.dataDeLancamento = dataDeLancamento;
    }
    @Override
    public void salvar(){
        System.out.println("O filme " + nome + " foi salvo");
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", diretor='" + diretor + '\'' +
                ", generos=" + generos +
                ", duracao=" + duracao.toMinutes()+ " minutos " +
                ", dataDeLancamento=" + dataDeLancamento +
                '}';
    }
}
