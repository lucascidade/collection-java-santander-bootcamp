package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private List<Livro> livrolist;

    public CatalagoLivros() {
        this.livrolist = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrolist.add(new Livro(titulo,autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        if(!livrolist.isEmpty()){
            for (Livro l : livrolist){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervaloAno = new ArrayList<>();
        if(!livrolist.isEmpty()){
            for (Livro l : livrolist){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livroPorIntervaloAno.add(l);
                }
            }
        }
        return livroPorIntervaloAno;
    }

    public Livro livroPorTitulo(String titulo) {
        Livro livroPorTitulo = null;

        if(!livrolist.isEmpty()){
            for (Livro l : livrolist){
                if(l.getTitutlo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();
        catalagoLivros.adicionarLivro("Livro 1", "autor 1", 2020);
        catalagoLivros.adicionarLivro("Livro 1", "autor 2", 2021);
        catalagoLivros.adicionarLivro("Livro 2", "autor 2", 2022);
        catalagoLivros.adicionarLivro("Livro 3", "autor 3", 2023);
        catalagoLivros.adicionarLivro("Livro 4", "autor 4", 2024);

        System.out.println(catalagoLivros.pesquisarPorAutor("Autor 2"));
    }
}
