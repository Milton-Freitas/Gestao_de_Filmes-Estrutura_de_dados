package SistGestFilm;

import java.util.Stack;

public class HistoricoFilmes {
    private static Stack<Filme> pilha;

    public HistoricoFilmes() {
        pilha = new Stack<>();
    }

    public void adicionarFilme(Filme filme) {
        pilha.push(filme);
    }

    public Filme removerFilme() {
        return pilha.pop();
    }

    public static void exibirHistoricoFilmesAssistidos() {
        System.out.println("Histórico de filmes associados:");
        for (Filme filme : pilha) {
            System.out.println(filme.getTitulo());
        }
    }
}
