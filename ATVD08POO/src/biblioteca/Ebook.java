package biblioteca;

public class Ebook extends ItemBibliotecaDigital implements Baixavel {

    private int numeroPaginas;

    public Ebook(String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String descricao() {
        return "Ebook: " + titulo + " | Autor: " + autor + " | Páginas: " + numeroPaginas;
    }

    @Override
    public void baixar() {
        System.out.println("Baixando o ebook \"" + titulo + "\"...");
    }
}

