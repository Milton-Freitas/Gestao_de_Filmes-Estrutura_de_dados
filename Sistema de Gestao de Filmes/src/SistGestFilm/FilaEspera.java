package SistGestFilm;

import java.util.LinkedList;
import java.util.Queue;

public class FilaEspera {
    private Queue<Filme> fila;

    public FilaEspera() {
        fila = new LinkedList<>();
    }

    public void adicionarFilme(Filme filme) {
        fila.add(filme);
    }

    public Filme removerFilme() {
        return fila.poll();
    }

    public void exibirProximosFilmes() {
        System.out.println("Próximos filmes da fila:");
        for (Filme filme : fila) {
            System.out.println(filme.getTitulo());
        }
    }
}