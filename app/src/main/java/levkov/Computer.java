package levkov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private ClassicalMusicPlayer classicalMusicPlayer;
    private int id;
    @Autowired
    public Computer(ClassicalMusicPlayer classicalMusicPlayer) {
        this.classicalMusicPlayer = classicalMusicPlayer;
        this.id = 1;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "classicalMusicPlayer=" + classicalMusicPlayer.play() +
                ", id=" + id +
                '}';
    }
}
