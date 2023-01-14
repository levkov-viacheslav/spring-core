package levkov;

public class MusicPlayer  {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Now is playing " + music.playSong());
    }
}
