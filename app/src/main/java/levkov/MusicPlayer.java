package levkov;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer  {
    private Music music;
    private String name;
    private int volume;
    private List<Music> musicList = new ArrayList<>();

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {}

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() throws Exception {
        if(musicList.size() > 0) {
            for (Music music: musicList) {
                System.out.println(music.playSong());
            }
        }
        else {
            throw new Exception("There is nothing to play");
        }
    }

    private void initialize() {
        System.out.println("Initializing...");
    }
    // Bean's scope must be Singleton (doesn't work with prototype, honestly it makes no sense)
    private void destroy() {
        System.out.println("Destroying...");
    }
}
