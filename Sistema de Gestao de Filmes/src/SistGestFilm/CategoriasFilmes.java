package SistGestFilm;

public class CategoriasFilmes {
    private Categoria raiz;

    public CategoriasFilmes() {
        raiz = null;
    }

    public void adicionarCategoria(Categoria categoria) {
        if (raiz == null) {
            raiz = categoria;
        } else {
            adicionarCategoriaRecursiva(raiz, categoria);
        }
    }

    public void adicionarCategoriaRecursiva(Categoria no, Categoria categoria) {
        if (no.getNome().equals(categoria.getNome())) {
            no.adicionarSubcategoria(categoria);
        } else {
            for (Categoria subcategoriaNo : no.getSubcategorias()) {
                adicionarCategoriaRecursiva(subcategoriaNo, categoria);
            }
        }
    }

    public void exibirCatalogo() {
        System.out.println("Catálogo de filmes por categoria:");
        exibirCatalogoRecursivo(raiz, 0);
    }

    private void exibirCatalogoRecursivo(Categoria no, int nivel) {
        StringBuilder prefixo = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            prefixo.append("-");
        }
        System.out.println(prefixo + no.getNome());
        for (Categoria subcategoria : no.getSubcategorias()) {
            exibirCatalogoRecursivo(subcategoria, nivel + 1);
        }
    }
}
