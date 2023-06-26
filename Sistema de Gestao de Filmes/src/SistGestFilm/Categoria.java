package SistGestFilm;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nome;
    private List<Categoria> subcategorias;

    public Categoria(String nome) {
        this.nome = nome;
        subcategorias = new ArrayList<>();
    }

    public void adicionarSubcategoria(Categoria subcategoria) {
        subcategorias.add(subcategoria);
    }

    public List<Categoria> getSubcategorias() {
        return subcategorias;
    }

    public String getNome() {
        return nome;
    }
}
