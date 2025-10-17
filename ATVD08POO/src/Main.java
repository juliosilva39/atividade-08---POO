import biblioteca.*;

public class Main {
    public static void main(String[] args) {

        Ebook ebook1 = new Ebook("Livro 1", "Autor 1", 100);
        Ebook ebook2 = new Ebook("Livro 2", "Autor 2", 200);

        VideoDigital video1 = new VideoDigital("Video 1", "Autor Video 1", 80);
        VideoDigital video2 = new VideoDigital("Video 2", "Autor Video 2", 90);

        System.out.println(ebook1.descricao());
        System.out.println(ebook2.descricao());
        System.out.println(video1.descricao());
        System.out.println(video2.descricao());

        ebook1.baixar();
        ebook2.baixar();

        video1.baixar();
        video1.visualizar();

        video2.baixar();
        video2.visualizar();
    }
}

