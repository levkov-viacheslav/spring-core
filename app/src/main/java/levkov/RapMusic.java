package levkov;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RapMusic implements Music {
    private List<String> musicPlaylist;

    public RapMusic() {
        this.musicPlaylist = List.of("Lose Yourself - Eminem", "Changes - 2Pac",
                "Juicy - Notorious B.I.G.");
    }

    @Override
    public List<String> getPlaylist() {
        return musicPlaylist;
    }
}
