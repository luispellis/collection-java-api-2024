package list.Pesquisa;

public class Livro {

    // Atributos
    private String titulo;
    private String autor;
    private int anoFabricacao;

    // Construtor
    public Livro(String titulo, String autor, int anoFabricacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoFabricacao = anoFabricacao;
    }

    // Getter
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    // ToString


    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
