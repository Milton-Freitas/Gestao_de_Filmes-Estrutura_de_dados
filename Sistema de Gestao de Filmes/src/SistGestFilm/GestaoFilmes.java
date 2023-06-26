package SistGestFilm;

import java.util.List;
import java.util.Scanner;

public class GestaoFilmes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FilaEspera filaEspera = new FilaEspera();
        HistoricoFilmes historicoFilmes = new HistoricoFilmes();
        CatalogoFilmes catalogoFilmes = new CatalogoFilmes();
        CategoriasFilmes categoriasFilmes = new CategoriasFilmes();
        RecomendacaoFilmes recomendacaoFilmes = new RecomendacaoFilmes();

        int opcao;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Fila");
            System.out.println("2. Pilha");
            System.out.println("3. Lista Circular");
            System.out.println("4. Árvore Binária");
            System.out.println("5. Grafos");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    int opcaoFila;
                    do {
                        System.out.println("\n=== Menu da Fila ===");
                        System.out.println("1. Adicionar filme à fila de espera");
                        System.out.println("2. Remover filme da fila de espera");
                        System.out.println("3. Exibir próximos filmes na fila de espera");
                        System.out.println("0. Voltar");
                        System.out.print("Opção: ");
                        opcaoFila = scanner.nextInt();

                        switch (opcaoFila) {
                            case 1:
                                scanner.nextLine();
                                System.out.print("Digite o título do filme: ");
                                String tituloFilaEspera = scanner.nextLine();
                                Filme filmeFilaEspera = new Filme(tituloFilaEspera);
                                filaEspera.adicionarFilme(filmeFilaEspera);
                                System.out.println("Filme adicionado à fila de espera.");
                                break;
                            case 2:
                                Filme filmeRemovido = filaEspera.removerFilme();
                                if (filmeRemovido != null) {
                                    System.out.println("Filme removido da fila de espera: " + filmeRemovido.getTitulo());
                                } else {
                                    System.out.println("A fila de espera está vazia.");
                                }
                                break;
                            case 3:
                                filaEspera.exibirProximosFilmes();
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida. Por favor, digite novamente.");
                                break;
                        }
                    } while (opcaoFila != 0);
                    break;
                case 2:
                    int opcaoPilha;
                    do {
                        System.out.println("\n=== Menu da Pilha ===");
                        System.out.println("1. Adicionar filme ao histórico de filmes assistidos");
                        System.out.println("2. Remover filme do histórico de filmes assistidos");
                        System.out.println("3. Exibir histórico de filmes assistidos");
                        System.out.println("0. Voltar");
                        System.out.print("Opção: ");
                        opcaoPilha = scanner.nextInt();

                        switch (opcaoPilha) {
                            case 1:
                                scanner.nextLine();
                                System.out.print("Digite o título do filme: ");
                                String tituloHistorico = scanner.nextLine();
                                Filme filmeHistorico = new Filme(tituloHistorico);
                                historicoFilmes.adicionarFilme(filmeHistorico);
                                System.out.println("Filme adicionado ao histórico de filmes assistidos.");
                                break;
                            case 2:
                                Filme filmeRemovidoHistorico = historicoFilmes.removerFilme();
                                if (filmeRemovidoHistorico != null) {
                                    System.out.println("Filme removido do histórico de filmes assistidos: " + filmeRemovidoHistorico.getTitulo());
                                } else {
                                    System.out.println("O histórico de filmes assistidos está vazio.");
                                }
                                break;
                            case 3:
                                historicoFilmes.exibirHistoricoFilmesAssistidos();
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida. Por favor, digite novamente.");
                                break;
                        }
                    } while (opcaoPilha != 0);
                    break;
                case 3:
                    int opcaoListaCircular;
                    do {
                        System.out.println("\n=== Menu da Lista Circular ===");
                        System.out.println("1. Adicionar filme ao catálogo de filmes");
                        System.out.println("2. Obter filme atual no catálogo de filmes");
                        System.out.println("3. Obter próximo filme no catálogo de filmes");
                        System.out.println("0. Voltar");
                        System.out.print("Opção: ");
                        opcaoListaCircular = scanner.nextInt();

                        switch (opcaoListaCircular) {
                            case 1:
                                scanner.nextLine();
                                System.out.print("Digite o título do filme: ");
                                String tituloCatalogo = scanner.nextLine();
                                Filme filmeCatalogo = new Filme(tituloCatalogo);
                                catalogoFilmes.adicionarFilme(filmeCatalogo);
                                System.out.println("Filme adicionado ao catálogo de filmes.");
                                break;
                            case 2:
                                Filme filmeAtual = catalogoFilmes.obterFilmeAtual();
                                if (filmeAtual != null) {
                                    System.out.println("Filme atual do catálogo: " + filmeAtual.getTitulo());
                                } else {
                                    System.out.println("O catálogo de filmes está vazio.");
                                }
                                break;
                            case 3:
                                Filme proximoFilme = catalogoFilmes.obterProximoFilme();
                                if (proximoFilme != null) {
                                    System.out.println("Próximo filme do catálogo: " + proximoFilme.getTitulo());
                                } else {
                                    System.out.println("O catálogo de filmes está vazio.");
                                }
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida. Por favor, digite novamente.");
                                break;
                        }
                    } while (opcaoListaCircular != 0);
                    break;
                case 4:
                    int opcaoArvoreBinaria;
                    do {
                        System.out.println("\n=== Menu da Árvore Binária ===");
                        System.out.println("1. Adicionar categoria ao catálogo de filmes");
                        System.out.println("2. Exibir catálogo de filmes");
                        System.out.println("0. Voltar");
                        System.out.print("Opção: ");
                        opcaoArvoreBinaria = scanner.nextInt();

                        switch (opcaoArvoreBinaria) {
                            case 1:
                                scanner.nextLine();
                                System.out.print("Digite o nome da categoria: ");
                                String nomeCategoria = scanner.nextLine();
                                Categoria categoria = new Categoria(nomeCategoria);
                                categoriasFilmes.adicionarCategoria(categoria);
                                System.out.println("Categoria adicionada ao catálogo de filmes.");
                                break;
                            case 2:
                                categoriasFilmes.exibirCatalogo();
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida. Por favor, digite novamente.");
                                break;
                        }
                    } while (opcaoArvoreBinaria != 0);
                    break;
                case 5:
                    int opcaoGrafo;
                    do {
                        System.out.println("\n=== Menu dos Grafos ===");
                        System.out.println("1. Adicionar filme ao grafo de recomendação");
                        System.out.println("2. Adicionar recomendação de filme ao grafo");
                        System.out.println("3. Obter recomendações para um filme");
                        System.out.println("0. Voltar");
                        System.out.print("Opção: ");
                        opcaoGrafo = scanner.nextInt();

                        switch (opcaoGrafo) {
                            case 1:
                                scanner.nextLine();
                                System.out.print("Digite o título do filme: ");
                                String tituloGrafo = scanner.nextLine();
                                Filme filmeGrafo = new Filme(tituloGrafo);
                                recomendacaoFilmes.adicionarFilme(filmeGrafo);
                                System.out.println("Filme adicionado ao grafo de recomendação.");
                                break;
                            case 2:
                                scanner.nextLine();
                                System.out.print("Digite o título do filme de origem: ");
                                String tituloOrigem = scanner.nextLine();
                                System.out.print("Digite o título do filme recomendado: ");
                                String tituloRecomendado = scanner.nextLine();
                                Filme filmeOrigem = new Filme(tituloOrigem);
                                Filme filmeRecomendado = new Filme(tituloRecomendado);
                                recomendacaoFilmes.adicionarRecomendacao(filmeOrigem, filmeRecomendado);
                                System.out.println("Recomendação adicionada ao grafo de recomendação.");
                                break;
                            case 3:
                                scanner.nextLine();
                                System.out.print("Digite o título do filme: ");
                                String tituloRecomendacoes = scanner.nextLine();
                                Filme filmeRecomendacoes = new Filme(tituloRecomendacoes);
                                List<Filme> listaRecomendacoes = recomendacaoFilmes.obterRecomendacoes(filmeRecomendacoes);
                                System.out.println("Recomendações para " + filmeRecomendacoes.getTitulo() + ":");
                                if (listaRecomendacoes != null) {
                                    for (Filme recomendacao : listaRecomendacoes) {
                                        System.out.println(recomendacao.getTitulo());
                                    }
                                } else {
                                    System.out.println("Não há recomendações disponíveis para esse filme.");
                                }
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida. Por favor, digite novamente.");
                                break;
                        }
                    } while (opcaoGrafo != 0);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, digite novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}