package levkov;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> musicPlaylist;

    public RockMusic() {
        this.musicPlaylist = List.of("Bohemian Rhapsody - Queen", "Stairway to Heaven - Led Zeppelin",
                "Smells Like Teen Spirit - Nirvana");
    }

    @Override
    public List<String> getPlaylist() {
        return musicPlaylist;
    }
}
