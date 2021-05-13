public class Jogo implements Salvador{
    String nome;
    String plataforma;

    public Jogo(String nome, String plataforma) {
        this.nome = nome;
        this.plataforma = plataforma;
    }

    @Override
    public void salvar(){
        System.out.println("O jogo " + nome + " foi salvo");
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + nome + '\'' +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }
}
