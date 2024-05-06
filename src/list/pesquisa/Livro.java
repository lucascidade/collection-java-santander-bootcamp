package list.pesquisa;

public class Livro {
    private String titutlo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titutlo, String autor, int anoPublicacao) {
        this.titutlo = titutlo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitutlo() {
        return titutlo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titutlo='" + titutlo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
