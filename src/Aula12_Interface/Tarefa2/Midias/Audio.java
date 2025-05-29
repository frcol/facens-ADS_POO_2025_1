package Aula12_Interface.Tarefa2.Midias;

public class Audio extends Media {

    public Audio(int duration, String title) {
        super(duration, title);
    }

    @Override
    public void play() {
        System.out.println("Reproduzindo �udio: " + title);
    }

    @Override
    public void stop() {
        System.out.println("Parando �udio: " + title);
    }
}
