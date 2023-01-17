package levkov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusicPlayer {

    private ClassicalMusic classicalMusic;

    @Autowired
    public ClassicalMusicPlayer(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

    public String play() {
        return "playing " + classicalMusic.playSong();
    }
}
