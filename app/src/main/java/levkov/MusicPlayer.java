package levkov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private Music classicalMusic;
    private Music rockMusic;
    private Music rapMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic")Music classicalMusic, @Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("rapMusic") Music rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
    }

    public void playMusic(Genres genre) {
        if(genre == Genres.CLASSICAL) {
            System.out.println(shufflePlaylist(classicalMusic.getPlaylist()));
        }
        else if(genre == Genres.ROCK) {
            System.out.println(shufflePlaylist(rockMusic.getPlaylist()));
        }
        else if (genre == Genres.RAP) {
            System.out.println(shufflePlaylist(rapMusic.getPlaylist()));
        }
        else {
            System.out.println("The genre not found");
        }
    }

    private String shufflePlaylist(List<String> playlist) {
        if(playlist.size() == 0) {
            return "empty playlist";
        }
        else {
            Random random = new Random();
            return playlist.get(random.nextInt(0, playlist.size()));
        }
    }

}
