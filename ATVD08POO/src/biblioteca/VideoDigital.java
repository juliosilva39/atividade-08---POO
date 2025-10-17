package biblioteca;

public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {

    private int duracaoMinutos;

    public VideoDigital(String titulo, String autor, int duracaoMinutos) {
        super(titulo, autor);
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public String descricao() {
        return "Vídeo Digital: " + titulo + " | Autor: " + autor + " | Duração: " + duracaoMinutos + " min";
    }

    @Override
    public void baixar() {
        System.out.println("Baixando o vídeo \"" + titulo + "\"...");
    }

    @Override
    public void visualizar() {
        System.out.println("Reproduzindo o vídeo \"" + titulo + "\"...");
    }
}
