package SistGestFilm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecomendacaoFilmes {
    private static Map<Filme, List<Filme>> recomendacoes;

    public RecomendacaoFilmes() {
        recomendacoes = new HashMap<>();
    }

    public static void adicionarFilme(Filme filme) {
        recomendacoes.put(filme, new ArrayList<>());
    }

    public static void adicionarRecomendacao(Filme filme1, Filme filme2) {
        List<Filme> listaRecomendacoes = recomendacoes.get(filme1);
        listaRecomendacoes.add(filme2);
    }

    public static List<Filme> obterRecomendacoes(Filme filme) {
        return recomendacoes.get(filme);
    }
}
