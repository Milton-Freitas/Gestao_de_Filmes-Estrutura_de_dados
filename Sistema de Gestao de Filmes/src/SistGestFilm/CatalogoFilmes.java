package SistGestFilm;

import java.util.ArrayList;
import java.util.List;

public class CatalogoFilmes {
    private List<Filme> lista;
    private int indiceAtual;

    public CatalogoFilmes() {
        lista = new ArrayList<>();
        indiceAtual = 0;
    }

    public void adicionarFilme(Filme filme) {
        lista.add(filme);
    }

    public Filme obterFilmeAtual() {
        if (lista.isEmpty()) {
            return null;
        }
        return lista.get(indiceAtual);
    }

    public Filme obterProximoFilme() {
        if (lista.isEmpty()) {
            return null;
        }
        indiceAtual = (indiceAtual + 1) % lista.size();
        return lista.get(indiceAtual);
    }
}
