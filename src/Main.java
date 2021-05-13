import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite Nome do filme : ");
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        System.out.println("Digite o diretor do filme: ");
        String diretor = scan.nextLine();

        System.out.println("Escolha o genero do filme:");
        for ( Genero genero : Genero.values()) {
            System.out.println(genero.ordinal() + " - " + genero);
        }
        ArrayList<Genero> generos = new ArrayList<>();
        Scanner scanGenero = new Scanner(System.in);
        String numeroGenero = scanGenero.nextLine();
        for (String elemento : numeroGenero.split(",")){
            Genero generoConvertido = Genero.values()[Integer.parseInt(elemento)];
            generos.add(generoConvertido);
        }

        System.out.println("Digite o duracao do filme em minutos: ");
        String duracao = scan.nextLine();
        Duration duracaoConvertida = Duration.ofMinutes(Integer.parseInt(duracao));

        System.out.println("Digite o data de lancamento do filme(dd/mm/aa): ");
        String dataDeLancamento = scan.nextLine();
        DateTimeFormatter formatoDaData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFormatada = LocalDate.parse(dataDeLancamento, formatoDaData);

        Filme filme = new Filme (nome, diretor, generos ,duracaoConvertida,dataFormatada);


        System.out.println("Digite o nome do jogo");
        Scanner scanJogo = new Scanner(System.in);
        String nomeDoJogo = scanJogo.nextLine();
        System.out.println("Digite o nome da plataforma");
        String plataforma = scanJogo.nextLine();

        Jogo jogo = new Jogo(nomeDoJogo, plataforma);

        BancoDeDadosFake falsiane = new BancoDeDadosFake();


        falsiane.salvar(filme);
        falsiane.salvar(jogo);
    }
}
